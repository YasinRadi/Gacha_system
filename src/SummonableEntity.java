public abstract class SummonableEntity {
    
    protected String name;
    protected StarCategory starCategory;
    
    public SummonableEntity (String name, StarCategory starCategory) {
        this.name = name;
        this.starCategory = starCategory;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StarCategory getStarCategory() {
        return this.starCategory;
    }

    public void setStarCategory(StarCategory starCategory) {
        this.starCategory = starCategory;
    }
}
