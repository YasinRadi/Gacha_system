
public enum Element {

    PYRO("Pyro"),
    HYDRO("Hydro"),
    ANEMO("Anemo"),
    DENDRO("Dendro"),
    CRYO("Cryo"),
    ELECTRO("Electro"),
    GEO("Geo");

    private String element;

    Element(String element) {
        this.element = element;
    }

    public String getElement() { return this.element; }

    public static String getElementColor(Element element) {
        switch(element) {
            case PYRO:
                return Rarity.RED.getRarityColor();
            case HYDRO:
                return Rarity.BLUE.getRarityColor();
            case ANEMO:
            case DENDRO:
                return Rarity.GREEN.getRarityColor();
            case CRYO:
                return Rarity.WHITE.getRarityColor();
            case ELECTRO:
                return Rarity.PURPLE.getRarityColor();
            case GEO:
                return Rarity.YELLOW.getRarityColor();
            default:
                return null;
        }
    }
}