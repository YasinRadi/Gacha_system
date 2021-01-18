public class Weapon extends Item {

    private WeaponType weaponType;

    public Weapon(Stars stars, String name, WeaponType weaponType) {
        super(stars, name);
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        Colour stars = Stars.getColour(this.stars);
        return new StringBuilder(stars.getColour()).append(getName()).append(" ").append(getNumStars()).append("*")
                .append(Colour.RESET.getColour()).toString();
    }
}
