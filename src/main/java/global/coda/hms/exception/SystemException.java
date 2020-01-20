package global.coda.hms.exception;
/**
 * system exception.
 * @author VC
 *
 */
public class SystemException extends Exception {

	/**
	 *serial version.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Default constructor.
	 * @param msg message
	 */
	public SystemException(String msg) {
		super(msg);
	}

}
