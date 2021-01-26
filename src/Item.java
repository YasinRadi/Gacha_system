
public abstract class Item extends SummonableEntity {

    protected AttributeBoost attributeBoost;

    public Item(String name, StarCategory starCategory, AttributeBoost attrBoost) {
        super(name, starCategory);
        this.attributeBoost = attrBoost;
    }

    public int getStarNum() {
        return this.starCategory.getStarNum();
    }

    public String getName() {
        return this.name;
    }

    public AttributeBoost getAttributeBoost() {
        return this.attributeBoost;
    }

    public void setAttributeBoost(AttributeBoost attrBoost) {
        this.attributeBoost = attrBoost;
    }
}
