public enum StarCategory {

    THREE(3),
    FOUR(4),
    FIVE(5);

    private final int starNum;
    private Rarity rarity;

    StarCategory (int starNum) {
        this.starNum = starNum;
        this.rarity = Rarity.getRarityFromStars(starNum);
    }

    public int getStarNum() {
        return this.starNum;
    }

    public Rarity getRarity() {
        return this.rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    public String getRarityColor() {
        return this.rarity.getRarityColor();
    }
}
