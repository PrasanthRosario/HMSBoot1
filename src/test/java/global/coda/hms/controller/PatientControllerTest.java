package global.coda.hms.controller;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import global.coda.hms.constants.ApplicationConstants;
import global.coda.hms.exception.BusinessException;
import global.coda.hms.exception.SystemException;
import global.coda.hms.model.ResponseBody;
import global.coda.hms.service.PatientService;

public class PatientControllerTest {
	PatientService service;

	@Test
	public void deletePatient()  {

		PatientController patientController = new PatientController(service);

		ResponseBody<String> msg;
		try {
			msg = patientController.delete("2");

			assertEquals(msg, ApplicationConstants.DELETED);
		} catch (BusinessException | SystemException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}

	}
}
