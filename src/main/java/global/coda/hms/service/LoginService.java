package global.coda.hms.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import global.coda.hms.exception.BusinessException;
import global.coda.hms.exception.SystemException;
import global.coda.hms.exception.UserNotFoundException;
import global.coda.hms.mapper.LoginMapper;
import global.coda.hms.model.LoginModel;
import global.coda.hms.model.UserDetails;
@Service
public class LoginService {

	private LoginMapper mapper;

	private final  Logger logger = LogManager.getLogger(LoginService.class);
	/**
	 * Default constructor.
	 * @param mapper mapper
	 */
	public LoginService(LoginMapper mapper) {
		this.mapper = mapper;
	}
	public UserDetails login(LoginModel login) throws BusinessException, SystemException {
		UserDetails user;
		logger.entry(login);
		try {
			user = mapper.login(login);
			if(user == null) {
				throw new UserNotFoundException("NO USER");
			}
		} catch (UserNotFoundException e) {
			throw new BusinessException(e.getMessage());
		} catch (Exception e) {
			throw new SystemException(e.getMessage());
		}
		logger.traceExit(user);
		return user;


	}
}
