public class ElementalBoost {

    private Element elementToBoost;
    private float percentageBoost;

    public ElementalBoost (Element elementToBoost, float percentageEnhc) {
        this.elementToBoost = elementToBoost;
        this.percentageBoost = percentageEnhc;
    }

    public Element getElementToBoost() {
        return this.elementToBoost;
    }

    public void setElementToBoost(Element elementToBoost) {
        this.elementToBoost = elementToBoost;
    }

    public float getPercentageBoost() {
        return this.percentageBoost;
    }

    public void setPercentageBoost(float percentageBoost) {
        this.percentageBoost = percentageBoost;
    }
}
