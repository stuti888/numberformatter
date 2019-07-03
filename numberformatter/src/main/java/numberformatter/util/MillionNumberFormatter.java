package numberformatter.util;

public class MillionNumberFormatter extends ThousandNumberFormatter {

	@Override
	public String format(String input) throws Exception {
		StringBuffer sb = new StringBuffer();
		sb.append(formatSB(input.substring(0, 3)));
		sb.append(" million ");
		sb.append(super.format(input.substring(3)));
		return sb.toString();
	}
}
