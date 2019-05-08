package trial_programs;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			throw new NullPointerException();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}
