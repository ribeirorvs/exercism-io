public class PigLatinTranslator {
	public String translate(String word) {
		while(true) {
			if(((word.charAt(0) == 'y' || word.charAt(0) == 'x') 
					&& word.charAt(1) == 't') 
					|| compare(word.charAt(0))) {
				System.out.println(1);
				word = word.concat("ay");
				break;
			} else {
				if(word.length() == 2 && word.charAt(1) == 'y') {
					word = word.substring(1).concat(word.substring(0, 1)).concat("ay");
					break;
				} else if(word.charAt(2)== 'y') {
					word = word.substring(2).concat(word.substring(0, 2)).concat("ay");
					break;
				} else if(word.substring(0, 2).equals("qu")) {
					word = word.substring(2).concat(word.substring(0, 2)).concat("ay");
					break;
				}
			}
		}
		return word;
	}
	
	private boolean compare(char c) {
		String a = String.valueOf(c);
		return a.matches("[aeiou]");
	}
}
