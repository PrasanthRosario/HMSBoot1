package global.coda.hms.exception;
/**
 * To use business exception.
 * @author VC
 *
 */
public class BusinessException extends Exception {

	/**
	 *serial version.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Default constructor.
	 * @param msg msg
	 */
	public BusinessException(String msg) {
		super(msg);
	}
}
