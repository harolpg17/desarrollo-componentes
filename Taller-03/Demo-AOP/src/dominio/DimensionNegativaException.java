package dominio;

public class DimensionNegativaException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public DimensionNegativaException() {
		super("Se est� intentando manejar dimensiones negativas en la figura.");
	}
	
	public DimensionNegativaException(String message) {
		super(message);
	}
}
