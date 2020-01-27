package global.coda.hms.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import global.coda.hms.constants.ApplicationConstants;
import global.coda.hms.exception.BusinessException;
import global.coda.hms.exception.SystemException;
import global.coda.hms.model.LoginModel;
import global.coda.hms.model.ResponseBody;
import global.coda.hms.model.UserDetails;
import global.coda.hms.service.LoginService;
@CrossOrigin
@RestController
@RequestMapping("/login")
public class LoginController {
	private final Logger logger = LogManager.getLogger(LoginController.class);
	private LoginService loginService;

	public LoginController(LoginService loginService) {
		this.loginService = loginService;
	}
	@PostMapping("")
	public ResponseBody<UserDetails> login(@RequestBody LoginModel loginModel) throws BusinessException, SystemException {
		logger.entry(loginModel);
		ResponseBody<UserDetails> response = new ResponseBody<UserDetails>();
		response.setSetStatus(ApplicationConstants.SUCCESS);
		response.setSetMessage(loginService.login(loginModel));
		logger.traceExit(response);
		return response;
	}
}
