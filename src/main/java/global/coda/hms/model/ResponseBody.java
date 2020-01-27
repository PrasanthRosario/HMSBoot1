package global.coda.hms.model;

/**
 * Response body model.
 * @author VC
 * @param <T> generic datatype
 */
public class ResponseBody<T> {
	private int setStatus;
	private T setMessage;
	/**
	 * get statuscode.
	 * @return setstatus status code
	 */
	public int getSetStatus() {
		return setStatus;
	}
	/**
	 * set set status code.
	 * @param setStatus setStatus code
	 */
	private String requestId;
	public void setRequestId(String object) {
		this.requestId = object;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setSetStatus(int setStatus) {
		this.setStatus = setStatus;
	}
	/**
	 * Get generic message.
	 * @return message message
	 */
	public T getSetMessage() {
		return setMessage;
	}
	/**
	 * set generic message.
	 * @param setMessage message
	 */
	public void setSetMessage(T setMessage) {
		this.setMessage = setMessage;
	}
	/**
	 * to string method.
	 */
	@Override
	public String toString() {
		return "ResponseBody [setStatus=" + setStatus + ", setMessage=" + setMessage + "]";
	}

}
