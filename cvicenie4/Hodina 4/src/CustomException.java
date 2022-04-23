
public class CustomException extends java.lang.Exception {
	
	public CustomException () {
		
		super ("Zadaný neplatný priemer");
	}
	
	public CustomException (String text) {
		
		super (text);
	}
}
