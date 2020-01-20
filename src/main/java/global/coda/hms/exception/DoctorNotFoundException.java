package global.coda.hms.exception;
/**
 * Doctor not found exception.
 * @author VC
 *
 */
public class DoctorNotFoundException extends Exception {

	/**
	 *serial version.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * default constructor.
	 * @param message message
	 */
	public DoctorNotFoundException(String message) {
		super(message);
	}



}
