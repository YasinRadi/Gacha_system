import java.util.ArrayList;

public class Character extends Item {

    private Element element_type;

    public Character(Stars stars, String name, Element element_type) {
        super(stars, name);
        this.element_type = element_type;
    }

    @Override
    public String toString() {
        Colour element = Element.getElement(this.element_type);
        Colour stars = Stars.getColour(this.stars);
        return new StringBuilder(element.getColour()).append(getName()).append(" ").append(stars.getColour())
                .append(getNumStars()).append("*").append(Colour.RESET.getColour()).toString();
    }
}
