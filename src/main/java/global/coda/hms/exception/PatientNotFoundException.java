package global.coda.hms.exception;
/**
 * Patient not found exception.
 * @author VC
 *
 */
public class PatientNotFoundException extends Exception {
	/**
	 * serial version.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Default constructor.
	 * @param message message
	 */
	public PatientNotFoundException(String message) {
		super(message);
	}

}
