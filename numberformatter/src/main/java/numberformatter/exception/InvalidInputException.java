package numberformatter.exception;

public class InvalidInputException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int errorcode;
	private String message;

	public InvalidInputException(int errorcode, String message) {
		this.errorcode = errorcode;
		this.message = message;
	}

	public String toString() {
		return String.format("InvalidInputException[ errorcode : %s, message : %s]", errorcode, message);
	}

	@Override
	public String getMessage() {
		return message;
	}

}
