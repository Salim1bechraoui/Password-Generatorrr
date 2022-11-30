
public class Alphabet {
	public static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
	public static final String NUMBER = "0123456789";
	public static final String SYMBOLS = "!@#$%^&*()-_=+\\/~?";
	public static StringBuilder pool;

	public Alphabet(boolean uppercaseIncluded, boolean lowercaseIncluded, boolean numbersIncluded,
			boolean specialCharactersIncluded) {
		pool = new StringBuilder();
		if (uppercaseIncluded)
			pool.append(UPPERCASE);
		if (lowercaseIncluded)
			pool.append(LOWERCASE);
		if (numbersIncluded)
			pool.append(NUMBER);
		if (specialCharactersIncluded)
			pool.append(SYMBOLS);

	}
	 public String getAlphabet() {
		 return pool.toString() ;
	 }

}
