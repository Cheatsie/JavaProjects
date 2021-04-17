/* Coder: Andre Foreman
 * Purpose: Throws long operand error when the operand entered is too long
 * Returns: String
 */
// CLASS 3
public class LongOperandException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public LongOperandException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}

