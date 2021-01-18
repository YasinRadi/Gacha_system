import java.awt.*;

public enum Element {

    PYRO("Pyro"),
    HYDRO("Hydro"),
    ANEMO("Anemo"),
    DENDRO("Dendro"),
    CRYO("Cryo"),
    ELECTRO("Electro"),
    GEO("geo");

    private String element;

    Element(String element) {
        this.element = element;
    }

    public String getElement() { return this.element; }

    public static Colour getElement(Element element) {
        switch(element) {
            case PYRO:
                return Colour.RED;
            case HYDRO:
                return Colour.BLUE;
            case ANEMO:
            case DENDRO:
                return Colour.GREEN;
            case CRYO:
                return Colour.WHITE;
            case ELECTRO:
                return Colour.PURPLE;
            case GEO:
                return Colour.YELLOW;
            default:
                return null;
        }
    }
}