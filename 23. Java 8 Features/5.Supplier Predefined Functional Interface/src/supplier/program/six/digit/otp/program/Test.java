package supplier.program.six.digit.otp.program;

import java.util.function.Supplier;

public class Test {

	public static void main(String[] args) {
		
		Supplier<String> mysupplier = () -> {
			String otp = "";
			for(int i = 0; i < 6; i++)
			{
			otp += (int)(Math.random() * 10);
			}
			return otp;
		};
		
		System.out.println(mysupplier.get());

	}

}
