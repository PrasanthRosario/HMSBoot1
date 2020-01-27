package global.coda.hms.exception;

public class UserNotFoundException extends Exception {
	/**
	 *serial version.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * default constructor.
	 * @param message message
	 */
	public UserNotFoundException(String message) {
		super(message);
	}

}
