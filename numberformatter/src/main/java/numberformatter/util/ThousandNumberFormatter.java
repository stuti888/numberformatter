package numberformatter.util;

public class ThousandNumberFormatter extends HundredNumberFormatter {

	@Override
	public String format(String input) throws Exception {
		StringBuffer sb = new StringBuffer();
		StringBuffer thousandSb = formatSB(input.substring(0, 3));
		StringBuffer hundredSb = formatSB(input.substring(3));
		if (!thousandSb.toString().equals("")) {
			sb.append(thousandSb);
			sb.append(" thousand ");
		}
		sb.append(hundredSb);
		return sb.toString();
	}

}
