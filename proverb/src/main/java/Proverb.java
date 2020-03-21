class Proverb {

	String proverb = "";
	
    Proverb(String[] words) {
    	if(words.length > 0) {
	        for(int i = 0; i < words.length-1; i++) {
	        	proverb = proverb.concat("For want of a " + words[i] + 
	        				" the " + words[i+1] + " was lost.\n");
	        	
	        }
	        proverb = proverb.concat("And all for the want of a " + words[0] + ".");
    	}
    }

    String recite() {
        return proverb;
    }
}
