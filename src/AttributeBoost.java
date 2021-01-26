
public class AttributeBoost {

    private float attackMultiplier;
    private float defenseMultiplier;
    private float speedMultiplier;
    private float critChanceMultiplier;
    private float healthMultiplier;
    private float energyMultiplier;
    private ElementalBoost elementalBoost;

    AttributeBoost(
        float attackMultiplier,
        float defenseMultiplier,
        float speedMultiplier,
        float critChanceMultiplier,
        float healthMultiplier,
        float energyMultiplier,
        ElementalBoost elementalBoost
    ) {
        this.attackMultiplier = attackMultiplier;
        this.defenseMultiplier = defenseMultiplier;
        this.speedMultiplier = speedMultiplier;
        this.critChanceMultiplier = critChanceMultiplier;
        this.healthMultiplier = healthMultiplier;
        this.energyMultiplier = energyMultiplier;
        this.elementalBoost = elementalBoost;
    }

    public float getAttackMultiplier() {
        return this.attackMultiplier;
    }

    public void setAttack(float attackMultiplier) {
        this.attackMultiplier = attackMultiplier;
    }

    public float getDefense() {
        return this.defenseMultiplier;
    }

    public void setDefense(float defenseMultiplier) {
        this.defenseMultiplier = defenseMultiplier;
    }

    public float getSpeed() {
        return this.speedMultiplier;
    }

    public void setSpeed(float speedMultiplier) {
        this.speedMultiplier = speedMultiplier;
    }

    public float getCritChance() {
        return this.critChanceMultiplier;
    }

    public void setCritChance(float critChanceMultiplier) {
        this.critChanceMultiplier = critChanceMultiplier;
    }

    public float getHealth() {
        return this.healthMultiplier;
    }

    public void setHealth(int healthMultiplier) {
        this.healthMultiplier = healthMultiplier;
    }

    public float getEnergy() {
        return this.energyMultiplier;
    }

    public void setEnergy(float energyMultiplier) {
        this.energyMultiplier = energyMultiplier;
    }

    public ElementalBoost getElementalBoost() {
        return this.elementalBoost;
    }

    public void setElementalBoost(ElementalBoost elementalBoost) {
        this.elementalBoost = elementalBoost;
    }
}
