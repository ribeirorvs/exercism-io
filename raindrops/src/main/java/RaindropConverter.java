class RaindropConverter {
    String convert(int number) {
    	String sound = "";
    	for(int i = number; i >= 1; i--) {
    		double rest = number / (double)i;
    		if(rest == 3)
    			sound = sound.concat("Pling");
    		else if (rest == 5)
    			sound = sound.concat("Plang");
    		else if (rest == 7)
    			sound = sound.concat("Plong");
    	}
    	if(sound.isEmpty()) {
    		sound = String.valueOf(number);
    	}
    	return sound;
    }
}
