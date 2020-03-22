class TwelveDays {
	private final String [] verses = {" a Partridge in a Pear Tree.\n",
						" two Turtle Doves, and",
						" three French Hens,",
						" four Calling Birds,",
						" five Gold Rings,",
						" six Geese-a-Laying,",
						" seven Swans-a-Swimming,",
						" eight Maids-a-Milking,",
						" nine Ladies Dancing,",
						" ten Lords-a-Leaping,",
						" eleven Pipers Piping,",
						" twelve Drummers Drumming,"};
	private final String[] ordinal = {"first",
										"second",
										"third",
										"fourth",
										"fifth",
										"sixth",
										"seventh",
										"eighth",
										"ninth",
										"tenth",
										"eleventh",
										"twelfth"};
	private String song;
    private StringBuilder builder = new StringBuilder();
	String verse(int verseNumber) {
		builder.setLength(0);
		builder.append("On the %s day of Christmas my true love gave to me:");
    	for(int i = verseNumber-1; i >= 0; i--) {
    		builder.append(verses[i]);
    	}
    	song = String.format(builder.toString(), ordinal[verseNumber-1]);
    	return song;
    }

    String verses(int startVerse, int endVerse) {
    	song = "";
    	StringBuilder aux = new StringBuilder();
    	for(int i = startVerse; i <= endVerse; i++) {
    		aux.append(verse(i));
    		aux.append("\n");
    	}
    	aux.setLength(aux.length()-1);
    	song = aux.toString();
    	return song;
    }
    
    String sing() {
    	return verses(1, 12);
    }
    
}
