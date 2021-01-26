public class Weapon extends Item {

    private WeaponType weaponType;

    public Weapon(String name, StarCategory starCategory, WeaponType weaponType, AttributeBoost attrBoost) {
        super(name, starCategory, attrBoost);
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() {
        return this.weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return new StringBuilder(this.starCategory.getRarityColor())
            .append(this.getName())
            .append(" ")
            .append(this.getWeaponType().toString())
            .append(" ")
            .append(this.getStarCategory().getStarNum())
            .append("*")
            .append(Rarity.RESET.getRarityColor())
            .toString();
    }
}
