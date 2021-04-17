/* Coder: Andre Foreman
 * Purpose:  EmptyOperandException when the operand empty
 * Returns: String
 */
// CLASS 4
public class EmptyOperandException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public EmptyOperandException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
