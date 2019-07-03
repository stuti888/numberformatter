package numberformatter.util;

import numberformatter.exception.InvalidInputException;

public class NumberContoller {

	public static String format(String input) throws InvalidInputException, Exception {
		input = validateInput(input);
		return (getvalue(input));

	}

	private static String validateInput(String input) throws InvalidInputException {
		if (input != null) {
			if (input.contains(",")) {
				input = input.replace(",", "");
			}
			int inp = 0;
			try {
				inp = Integer.parseInt(input);
			} catch (NumberFormatException n) {
				throw new InvalidInputException(2, "Input is not a valid Number");
			}

			if (inp <= 0 || inp > 999999999) {
				throw new InvalidInputException(2, "Input is not in supported range");
			}
			return inp + "";
		}
		throw new InvalidInputException(1, "input is null");
	}

	private static String getvalue(String input) throws Exception {
		input = addAerosInPrefix(input);
		if (input.length() == 3) {
			return new HundredNumberFormatter().format(input);
		}
		if (input.length() == 6) {
			return new ThousandNumberFormatter().format(input);
		}
		return new MillionNumberFormatter().format(input);
	}

	private static String addAerosInPrefix(String input) {
		while (input.length() % 3 != 0) {
			input = "0" + input;
		}
		return input;
	}

	public static void main(String[] args) throws Exception, InvalidInputException {
		System.out.println(format("809809"));
	}

}
