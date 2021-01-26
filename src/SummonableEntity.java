public abstract class SummonableEntity {
    private String name;
    private StarCategory starCategory;
    
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
