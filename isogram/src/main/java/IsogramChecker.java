class IsogramChecker {

    boolean isIsogram(String phrase) {
    	phrase = phrase.replaceAll(" ", "");
    	phrase = phrase.replaceAll("-", "");
    	phrase = phrase.toLowerCase();
    	for(int i = 0; i < phrase.length(); i++) {
    		for(int j = i+1; j < phrase.length(); j++ ) {
    			if(phrase.charAt(i) == phrase.charAt(j)) {
    				return false;
    			}
    		}
    	}
    	return true;
    }

}
