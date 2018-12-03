import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
    	List<String> aminoAcid = new ArrayList<String>();
    	for(int i = 0; i < rnaSequence.length()-2; i+=3) {
    		System.out.println(aminoAcid.toString());
    		String aux = rnaSequence.substring(i, i+3);
    		switch (aux){
    			case "AUG":
    				if(!aminoAcid.contains("Methionine"))
    					aminoAcid.add("Methionine");
    				break;
    			case "UUU":
    			case "UUC":
    				if(!aminoAcid.contains("Phenylalanine"))
    					aminoAcid.add("Phenylalanine");
    				break;
    			case "UUA":
    			case "UUG":
    				if(!aminoAcid.contains("Leucine"))
    					aminoAcid.add("Leucine");
    				break;
    			case "UCU":
    			case "UCC":
    			case "UCA":
    			case "UCG":
    				if(!aminoAcid.contains("Serine"))
    					aminoAcid.add("Serine");
    				break;
    			case "UAU":
    			case "UAC":
    				if(!aminoAcid.contains("Tyrosine"))
    					aminoAcid.add("Tyrosine");
    				break;
    			case "UGU":
    			case "UGC":
    				if(!aminoAcid.contains("Cysteine"))
    					aminoAcid.add("Cysteine");
    				break;
    			case "UGG":
    				if(!aminoAcid.contains("Tryptophan"))
    					aminoAcid.add("Tryptophan");
    				break;
    			case "UAA":
    			case "UAG":
    			case "UGA":
    				return aminoAcid;
    		}
    	}
    	return aminoAcid;
    }
}