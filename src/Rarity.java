public enum Rarity {

    YELLOW("\033[0;33m"),
    PURPLE("\033[0;35m"),
    BLUE("\033[0;34m"),
    RED("\033[0;31m"),
    GREEN("\033[0;32m"),
    WHITE("\033[0;37m"),
    RESET("\033[0m");

    private String rarityColor;

    Rarity (String colorCode) {
        this.rarityColor = colorCode;
    }

    public static Rarity getRarityFromStars(int starNum) {
        switch (starNum) {
            case 3:
                return Rarity.BLUE;
            
            case 4:
                return Rarity.PURPLE;
            
            case 5:
                return Rarity.YELLOW;
            
            default:
                System.out.println("No rarity available for such star number.");
                return null;
        }
    }

    public String getRarityColor() {
        return this.rarityColor;
    }

    public void setRarityColor(Rarity rarity) {
        this.rarityColor = rarity.getRarityColor();
    }
}
