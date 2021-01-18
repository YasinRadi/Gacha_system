public abstract class Item {

    protected Stars stars;
    protected String name;

    public Item(Stars stars, String name) {
        this.stars = stars;
        this.name = name;
    }

    public int getNumStars() {
        return this.stars.getNumStars();
    }

    public String getName() {
        return this.name;
    }
}
