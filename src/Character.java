
public class Character extends SummonableEntity {

    private Element elementType;
    
    public Character(String name, StarCategory starCategory, Element elementType) {
        super(name, starCategory);
        this.elementType = elementType;
    }

    public Element getElement() {
        return this.elementType;
    }

    public void setElement(Element elementType) {
        this.elementType = elementType;
    }

    @Override
    public String toString() {
        return new StringBuilder(this.getStarCategory().getRarityColor())
            .append(this.getName())
            .append(" ")
            .append(this.getElement().toString())
            .append(" ")
            .append(this.getStarCategory().getStarNum())
            .append("*")
            .append(Rarity.RESET.getRarityColor())
            .toString();
    }
}
