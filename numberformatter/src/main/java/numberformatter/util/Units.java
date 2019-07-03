package numberformatter.util;

public enum Units {
	ONE("1"), TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9"), TEN("10"), ELEVEN("11"), TWELVE("12"), THIRTEEN("13"), FOURTEEN("14"), FIFTEEN("15"), SIXTEEN(
			"16"), SEVENTEEN("17"), EIGHTEEN("18"), NINETEEN("19"), TWENTY("20"), THIRTY("30"), FORTY("40"), FIFTY("50"), SIXTY("60"), SEVENTY("70"), EIGHTY("80"), NINETY("90");

	private String number;

	private Units(String number) {
		this.number = number;
	}

	public static String getValue(String num) throws Exception {
		for (Units unit : Units.values()) {
			if (unit.number.equals(num)) {
				return unit.toString().toLowerCase();
			}
		}
		throw new Exception();
	}
}
