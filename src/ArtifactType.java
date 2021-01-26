public enum ArtifactType {
    
    FLOWER(0),
    CIRCLET(1),
    GOBLET(2),
    PLUME(3),
    HOURGLASS(4);

    private int type;

    ArtifactType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        switch (this.type) {
            case 0:
                return "Flower";
            
            case 1:
                return "Circlet";
            
            case 2:
                return "Goblet";
            
            case 3:
                return "Plume";

            case 4:
                return "Hourglass";
            
            default:
                return "";
        }
    }
}
