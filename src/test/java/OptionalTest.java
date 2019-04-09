import java.util.Optional;

public class OptionalTest {
	public static void run() { 
		
		Optional<String> opt = Optional.empty();
		
		if (opt.isPresent())
			System.out.println("opt.isPresent() == true");
		else
			System.out.println("opt.isPresent() == false");
		
		opt = Optional.of("foo");

		if (opt.isPresent())
			System.out.println("opt.get() == " + opt.get());

	}
}
