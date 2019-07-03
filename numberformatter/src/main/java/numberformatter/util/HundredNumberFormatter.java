package numberformatter.util;

public class HundredNumberFormatter implements INumberFormatter {

	public String format(String input) throws Exception {
		return formatSB(input).toString();
	}

	public StringBuffer formatSB(String input) throws Exception {
		StringBuffer sb = new StringBuffer();
		if (input.equals("000")) {
			return sb;
		}
		boolean flag = true;
		boolean isHundredPresent = false;
		boolean isTensPresent = false;
		char[] arr = input.toCharArray();
		if (arr[0] != '0') {
			sb.append(Units.getValue(String.valueOf(arr[0])));
			sb.append(" hundred");
			isHundredPresent = true;
		}
		if (arr[1] != '0') {
			if (isHundredPresent) {
				sb.append(" and ");
			}
			if (arr[1] == '1') {
				sb.append(Units.getValue(arr[1] + "" + arr[2]));
				flag = false;
				isTensPresent = true;
			} else {
				sb.append(Units.getValue(arr[1] + "0"));
				isTensPresent = true;
			}

		}
		if (flag && arr[2] != '0') {
			if(isTensPresent){
				sb.append(" ");
			}
			else if(isHundredPresent){
				sb.append(" and ");
			}
			sb.append(Units.getValue(arr[2] + ""));
		}
		return sb;

	}

}
