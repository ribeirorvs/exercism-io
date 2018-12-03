import java.util.Objects;

class Twofer {
    public String twofer(final String name) {
    	return String.format("One for %s, one for me.", Objects.toString(name, "you"));
    }
}
