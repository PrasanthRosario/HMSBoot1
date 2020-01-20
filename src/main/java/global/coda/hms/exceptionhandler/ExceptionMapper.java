package global.coda.hms.exceptionhandler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import global.coda.hms.constants.ApplicationConstants;
import global.coda.hms.exception.BusinessException;
import global.coda.hms.exception.SystemException;
import global.coda.hms.model.ResponseBody;
/**
 * Exception handler.
 * @author VC
 *
 */
@ControllerAdvice
public class ExceptionMapper {
	private final  Logger logger = LogManager.getLogger(ExceptionMapper.class);
	/**
	 * Business exception.
	 * @param error error
	 * @return response response
	 */
	@ExceptionHandler(value = BusinessException.class)
	public ResponseEntity<ResponseBody<String>>  businessException(BusinessException error) {
		logger.traceEntry();
		logger.error(error.getMessage());
		ResponseBody<String> response = new ResponseBody<String>();
		response.setSetStatus(ApplicationConstants.BAD_REQUEST);
		response.setSetMessage(error.getMessage());
		logger.traceExit(response);
		return new ResponseEntity<ResponseBody<String>>(response, HttpStatus.NOT_FOUND);
	}
	/**
	 * System exception.
	 * @param error error
	 * @return response response
	 */
	@ExceptionHandler(value = SystemException.class)
	public ResponseEntity<ResponseBody<String>>  systemException(SystemException error) {
		logger.traceEntry();
		logger.error(error.getMessage());
		ResponseBody<String> response = new ResponseBody<String>();
		response.setSetStatus(ApplicationConstants.INTERNAL_SERVER_ERROR);
		response.setSetMessage(ApplicationConstants.SERVER_ERROR);
		logger.traceExit(response);
		return new ResponseEntity<ResponseBody<String>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
