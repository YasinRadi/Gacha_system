public enum Stars {

    THREE(3),
    FOUR(4),
    FIVE(5);

    private final int num_stars;

    Stars(int num_stars) {
        this.num_stars = num_stars;
    }

    public int getNumStars() {
        return this.num_stars;
    }

    public static Colour getColour(Stars stars) {
        switch(stars) {
            case FIVE:
                return Colour.YELLOW;
            case FOUR:
                return Colour.PURPLE;
            case THREE:
                return Colour.BLUE;
            default:
                return null;
        }
    }
}
