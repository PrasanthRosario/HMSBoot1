package global.coda.hms.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import global.coda.hms.constants.ApplicationConstants;
import global.coda.hms.exception.BusinessException;
import global.coda.hms.exception.SystemException;
import global.coda.hms.model.Doctor;
import global.coda.hms.model.ResponseBody;
import global.coda.hms.service.DoctorService;

/**
 * Doctor Controller.
 *
 * @author VC
 *
 */
@RestController
@RequestMapping("/doctors")
public class DoctorController {

	private final Logger logger = LogManager.getLogger(DoctorController.class);
	private DoctorService doctorService;

	/**
	 * Constructor Method.
	 *
	 * @param doctorService doctor service
	 */
	public DoctorController(DoctorService doctorService) {
		this.doctorService = doctorService;
	}

	/**
	 * To read doctor.
	 *
	 * @param id user id
	 * @return response response
	 * @throws BusinessException business exception
	 * @throws SystemException   system exception
	 */
	@GetMapping("/{id}")
	public ResponseBody<Doctor> getById(@PathVariable("id") String id) throws BusinessException, SystemException {
		logger.entry(id);
		ResponseBody<Doctor> response = new ResponseBody<Doctor>();
		response.setSetStatus(ApplicationConstants.SUCCESS);
		response.setSetMessage(doctorService.read(id));
		logger.traceExit(response);
		return response;

	}

	/**
	 * To create doctor.
	 *
	 * @param doctor doctor
	 * @return response response
	 * @throws BusinessException business exception
	 * @throws SystemException   system exception
	 */
	@PostMapping("/create")
	public ResponseBody<Doctor> createDoctor(@RequestBody Doctor doctor) throws BusinessException, SystemException {
		logger.entry(doctor);
		ResponseBody<Doctor> response = new ResponseBody<Doctor>();
		response.setSetStatus(ApplicationConstants.SUCCESS);
		response.setSetMessage(doctorService.create(doctor));
		logger.traceExit(response);
		return response;
	}

	/**
	 * To update Doctor.
	 *
	 * @param doctor doctor
	 * @return response response
	 * @throws BusinessException business exception
	 * @throws SystemException   system exception
	 */
	@PutMapping("/update")
	public ResponseBody<Doctor> updateDoctor(@RequestBody Doctor doctor) throws BusinessException, SystemException {
		logger.entry(doctor);
		ResponseBody<Doctor> response = new ResponseBody<Doctor>();
		response.setSetStatus(ApplicationConstants.SUCCESS);
		response.setSetMessage(doctorService.update(doctor));
		logger.traceExit(response);
		return response;
	}

	/**
	 * To delete the doctor.
	 *
	 * @param id user id
	 * @return response response
	 * @throws BusinessException business exception
	 * @throws SystemException   system exception
	 */
	@DeleteMapping("/delete/{id}")
	public ResponseBody<String> delete(@PathVariable("id") String id) throws BusinessException, SystemException {
		logger.entry(id);
		ResponseBody<String> response = new ResponseBody<String>();
		response.setSetStatus(ApplicationConstants.DELETED_OK);
		response.setSetMessage(doctorService.delete(id));
		logger.traceExit(response);
		return response;
	}

	/**
	 * read patient under a doctor.
	 *
	 * @param doctorId doctor id
	 * @return resposne response
	 * @throws BusinessException business exception
	 * @throws SystemException   system exception
	 */
	@GetMapping("/getPatients")
	public ResponseBody<List<Doctor>> readAllPatients(@RequestParam(name = "userId", required = false) String userId)
			throws BusinessException, SystemException {
		logger.entry(userId);
		if (userId == null) {
			userId = "0";
		}
		ResponseBody<List<Doctor>> response = new ResponseBody<List<Doctor>>();
		response.setSetStatus(ApplicationConstants.SUCCESS);
		response.setSetMessage(doctorService.readAllDoctor(userId));
		logger.traceExit(response);
		return response;
	}
	// /**
	// * To get all doctor and all patients.
	// * @return response response
	// * @throws BusinessException business exception
	// * @throws SystemException system exception
	// */
	// @GetMapping("/getPatients")
	// public ResponseBody<List<Doctor>> readAllUsers() throws BusinessException,
	// SystemException {
	// logger.traceEntry();
	// ResponseBody<List<Doctor>> response = new ResponseBody<List<Doctor>>();
	// response.setSetStatus(ApplicationConstants.SUCCESS);
	// response.setSetMessage(doctorService.readAllDoctor("0"));
	// logger.traceExit(response);
	// return response;
	// }
}
