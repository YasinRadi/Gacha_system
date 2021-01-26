public enum WeaponType {

    CLAYMORE(0),
    SWORD(1),
    POLEARM(2),
    CATALYST(3),
    BOW(4);

    private int type;

    WeaponType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        switch (this.type) {
            case 0:
                return "Claymore";
            
            case 1:
                return "Sword";
            
            case 2:
                return "Polearm";
            
            case 3:
                return "Catalyst";

            case 4:
                return "Bow";
            
            default:
                return "";
        }
    }
}
