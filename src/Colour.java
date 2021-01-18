public enum Colour {

    YELLOW("\033[0;33m"),
    PURPLE("\033[0;35m"),
    BLUE("\033[0;34m"),
    RED("\033[0;31m"),
    GREEN("\033[0;32m"),
    WHITE("\033[0;37m"),
    RESET("\033[0m");

    private String colour;

    Colour(String colour) {
        this.colour = colour;
    }

    public String getColour() { return this.colour; }

}
