package global.coda.hms.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import global.coda.hms.constants.ApplicationConstants;
import global.coda.hms.exception.BusinessException;
import global.coda.hms.exception.SystemException;
import global.coda.hms.model.Patient;
import global.coda.hms.model.ResponseBody;
import global.coda.hms.service.PatientService;

/**
 * patient controller.
 *
 * @author VC
 *
 */
@CrossOrigin
@RestController
@RequestMapping("/patients")
public class PatientController {

	private PatientService patientService;
	private final Logger logger = LogManager.getLogger(PatientController.class);

	/**
	 * Constructor method.
	 *
	 * @param patientService patient service object
	 */
	public PatientController(PatientService patientService) {
		this.patientService = patientService;
	}

	/**
	 * To read patient.
	 *
	 * @param id user id
	 * @return response response
	 * @throws BusinessException business exception
	 * @throws SystemException   system exception
	 */
	@GetMapping("/{id}")
	public ResponseBody<Patient> getById(@PathVariable("id") String id) throws BusinessException, SystemException {
		logger.entry(id);
		ResponseBody<Patient> response = new ResponseBody<Patient>();
		response.setSetStatus(ApplicationConstants.SUCCESS);
		response.setSetMessage(patientService.getbyId(id));
		logger.traceExit(response);
		return response;
	}

	/**
	 * to create Patient.
	 *
	 * @param patient patient model
	 * @return response response
	 * @throws BusinessException business exception
	 * @throws SystemException   system exception
	 */
	@PostMapping("/create")
	public ResponseBody<Patient> createPatient(@RequestBody Patient patient) throws BusinessException, SystemException {
		logger.entry(patient);
		ResponseBody<Patient> response = new ResponseBody<Patient>();
		response.setSetStatus(ApplicationConstants.SUCCESS);
		response.setSetMessage(patientService.createPatient(patient));
		logger.traceExit(response);
		return response;
	}

	/**
	 * To update Patient.
	 *
	 * @param patient patient model
	 * @return response response
	 * @throws BusinessException business exception
	 * @throws SystemException   system exception
	 */
	@PutMapping("/update")
	public ResponseBody<Patient> updatePatient(@RequestBody Patient patient) throws BusinessException, SystemException {
		logger.entry(patient);
		ResponseBody<Patient> response = new ResponseBody<Patient>();
		response.setSetStatus(ApplicationConstants.SUCCESS);
		response.setSetMessage(patientService.updatePatient(patient));
		logger.traceExit(response);
		return response;
	}

	/**
	 * To delete patient.
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
		response.setSetMessage(patientService.deletePatient(id));
		logger.traceExit(response);
		return response;
	}
}
