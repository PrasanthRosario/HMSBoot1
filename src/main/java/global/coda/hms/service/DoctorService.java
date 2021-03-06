package global.coda.hms.service;

import java.util.LinkedList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import global.coda.hms.constants.ApplicationConstants;
import global.coda.hms.exception.BusinessException;
import global.coda.hms.exception.DoctorNotFoundException;
import global.coda.hms.exception.SystemException;
import global.coda.hms.exception.UserNotCreatedException;
import global.coda.hms.mapper.DoctorMapper;
import global.coda.hms.model.Doctor;
/**
 * Doctor Service.
 * @author VC
 *
 */
@Service
public class DoctorService {
	private DoctorMapper mapper;

	private final  Logger logger = LogManager.getLogger(DoctorService.class);
	/**
	 * Default constructor.
	 * @param mapper mapper
	 */
	public DoctorService(DoctorMapper mapper) {
		this.mapper = mapper;
	}
	/**
	 * read doctor.
	 * @param id user id
	 * @return doctor doctor
	 * @throws BusinessException business exception
	 * @throws SystemException system exception
	 */
	public Doctor read(String id) throws BusinessException, SystemException {
		Doctor doctor = null;
		try {
			logger.entry(id);
			doctor = mapper.read(Integer.parseInt(id));
			if (doctor == null) {
				throw new DoctorNotFoundException(ApplicationConstants.DOCTOR_NOT_FOUND);
			}
		} catch (DoctorNotFoundException e) {
			throw new BusinessException(e.getMessage());
		} catch (NumberFormatException e) {
			throw new BusinessException(e.getMessage());
		} catch (Exception e) {
			throw new SystemException(e.getMessage());
		}
		logger.traceExit(doctor);
		return doctor;
	}
	/**
	 * To create doctor in the mapper.
	 * @param doctor doctor
	 * @return doctor doctor
	 * @throws BusinessException business exception
	 * @throws SystemException system exception
	 */
	public Doctor create(Doctor doctor) throws BusinessException, SystemException {
		Doctor newDoctor = null;
		int created = 0;
		logger.entry(doctor);
		try {
			created = mapper.createUsers(doctor);
			if (created == 1) {
				created = mapper.createDoctors(doctor);
				if (created == 1) {
					newDoctor = doctor;
				}
			} else {
				throw new UserNotCreatedException(ApplicationConstants.USER_NOT_CREATED);
			}
		} catch (UserNotCreatedException e) {
			throw new BusinessException(e.getMessage());
		} catch (Exception e) {
			throw new SystemException(e.getMessage());
		}
		logger.traceExit(newDoctor);
		return newDoctor;
	}
	/**
	 * delete doctor.
	 * @param id user id
	 * @return string message
	 * @throws BusinessException business exception
	 * @throws SystemException system exception
	 */
	public String delete(String id) throws BusinessException, SystemException {
		int created = 0;
		String msg = "";
		logger.entry(id);
		try {
			created = mapper.deleteUsers(Integer.parseInt(id));
			if (created == 1) {
				mapper.deleteDoctors(Integer.parseInt(id));
				msg = ApplicationConstants.DELETED;
			} else {
				throw new DoctorNotFoundException(ApplicationConstants.DOCTOR_NOT_FOUND);
			}
		} catch (NumberFormatException e) {
			throw new BusinessException(e.getMessage());
		} catch (DoctorNotFoundException e) {
			throw new BusinessException(e.getMessage());
		} catch (Exception e) {
			throw new SystemException(e.getMessage());
		}
		logger.traceExit(msg);
		return msg;
	}
	/**
	 * update doctor.
	 * @param doctor doctor
	 * @return doctor doctor
	 * @throws BusinessException business exception
	 * @throws SystemException system exception
	 */
	public Doctor update(Doctor doctor) throws BusinessException, SystemException {
		Doctor newDoctor = null;
		int created = 0;
		logger.entry(doctor);
		try {
			created = mapper.updateUsers(doctor);
			if (created == 1) {
				mapper.updateDoctors(doctor);
				newDoctor = doctor;
			} else {
				throw new DoctorNotFoundException(ApplicationConstants.DOCTOR_NOT_FOUND);
			}
		} catch (DoctorNotFoundException e) {
			throw new BusinessException(e.getMessage());
		} catch (Exception e) {
			throw new SystemException(e.getMessage());
		}
		logger.traceExit(newDoctor);
		return newDoctor;
	}
	//	/**
	//	 * read all patients under a doctor.
	//	 * @param doctorId doctor id
	//	 * @return list all patients
	//	 * @throws BusinessException business exception
	//	 * @throws SystemException system exception
	//	 */
	//	public Doctor readAll(String userId) throws BusinessException, SystemException {
	//		Doctor doctor = null;
	//		logger.entry(userId);
	//		try {
	//			doctor = mapper.getPatients(Integer.parseInt(userId));
	//		} catch (NumberFormatException e) {
	//			throw new BusinessException(e.getMessage());
	//		} catch (Exception e) {
	//			throw new SystemException(e.getMessage());
	//		}
	//		logger.traceExit(doctor);
	//		return doctor;
	//	}
	/**
	 * read all patients under all doctors.
	 * @return list all patients and doctors
	 * @throws BusinessException business exception
	 * @throws SystemException system exception
	 */
	public List<Doctor> readAllDoctor(String  id) throws BusinessException, SystemException {
		logger.traceEntry();
		List<Doctor> allDoctors = new LinkedList<Doctor>();

		try {
			allDoctors = mapper.getPatients(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			throw new BusinessException(e.getMessage());
		} catch (Exception e) {
			throw new SystemException(e.getMessage());
		}

		logger.traceExit(allDoctors);
		return allDoctors;
	}
}
