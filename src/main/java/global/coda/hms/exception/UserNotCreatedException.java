package global.coda.hms.exception;
/**
 * User not found exception.
 * @author VC
 *
 */
public class UserNotCreatedException extends Exception {
	/**
	 *serial version.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Default Constructor.
	 * @param msg message
	 */
	public UserNotCreatedException(String msg) {
		super(msg);
	}
}
