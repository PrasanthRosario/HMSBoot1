package global.coda.hms.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import global.coda.hms.constants.ApplicationConstants;
import global.coda.hms.exception.BusinessException;
import global.coda.hms.exception.PatientNotFoundException;
import global.coda.hms.exception.SystemException;
import global.coda.hms.exception.UserNotCreatedException;
import global.coda.hms.mapper.PatientMapper;
import global.coda.hms.model.Patient;
/**
 * Patient service.
 * @author VC
 *
 */
@Service
public class PatientService {
	private PatientMapper mapper;

	private final  Logger logger = LogManager.getLogger(PatientService.class);
	/**
	 * Default constructor.
	 * @param mapper mapper
	 */
	public PatientService(PatientMapper mapper) {
		this.mapper = mapper;
	}
	/**
	 * read patient.
	 * @param id user id
	 * @return patient patient
	 * @throws BusinessException business exception
	 * @throws SystemException system exception
	 */
	public Patient getbyId(String id) throws BusinessException, SystemException {
		Patient patient = null;
		try {
			logger.entry(id);
			patient = mapper.getById(Integer.parseInt(id));
			if (patient == null) {
				throw new PatientNotFoundException(ApplicationConstants.PATIENT_NOT_FOUND);
			}
		} catch (PatientNotFoundException e) {
			throw new BusinessException(e.getMessage());
		} catch (NumberFormatException e) {
			throw new BusinessException(e.getMessage());
		} catch (Exception e) {
			throw new SystemException(e.getMessage());
		}
		logger.traceExit(patient);
		return patient;
	}
	/**
	 * To create patient.
	 * @param patient patient
	 * @return patient patient
	 * @throws BusinessException business exception
	 * @throws SystemException system exception
	 */
	public Patient createPatient(Patient patient) throws BusinessException, SystemException {

		Patient newPatient = null;
		int created = 0;
		logger.entry(patient);
		try {
			created = mapper.createUser(patient);
			if (created == 1) {
				created = mapper.createPatient(patient);
				if (created == 1) {
					newPatient = patient;
				}
			} else {
				throw new UserNotCreatedException(ApplicationConstants.USER_NOT_CREATED);
			}
		} catch (UserNotCreatedException e) {
			throw new BusinessException(e.getMessage());
		} catch (Exception e) {
			throw new SystemException(e.getMessage());
		}
		logger.traceExit(newPatient);
		return newPatient;
	}
	/**
	 * To delete a patient.
	 * @param id user id
	 * @return String message
	 * @throws BusinessException business exception
	 * @throws SystemException system exception
	 */
	public String deletePatient(String id) throws BusinessException, SystemException {
		int created = 0;
		String msg = "";
		logger.entry(id);
		try {
			created = mapper.deleteUser(Integer.parseInt(id));
			if (created == 1) {
				mapper.deletePatient(Integer.parseInt(id));
				msg = ApplicationConstants.DELETED;
			} else {
				throw new PatientNotFoundException(ApplicationConstants.PATIENT_NOT_FOUND);
			}
		} catch (NumberFormatException e) {
			throw new BusinessException(e.getMessage());
		} catch (PatientNotFoundException e) {
			throw new BusinessException(e.getMessage());
		} catch (Exception e) {
			throw new SystemException(e.getMessage());
		}
		logger.traceExit(msg);
		return msg;
	}
	/**
	 * update patient.
	 * @param patient patient
	 * @return patient patient
	 * @throws BusinessException business exception
	 * @throws SystemException system exception
	 */
	public Patient updatePatient(Patient patient) throws BusinessException, SystemException {
		Patient newPatient = null;
		int created = 0;
		logger.entry(patient);
		try {
			created = mapper.updateUser(patient);
			if (created == 1) {
				mapper.updatePatient(patient);
				newPatient = patient;
			} else {
				throw new PatientNotFoundException(ApplicationConstants.PATIENT_NOT_FOUND);
			}
		} catch (PatientNotFoundException e) {
			throw new BusinessException(e.getMessage());
		} catch (Exception e) {
			throw new SystemException(e.getMessage());
		}
		logger.traceExit(newPatient);
		return newPatient;

	}
}
