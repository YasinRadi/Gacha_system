public class AttributeBoostBuilder implements IBuilder<AttributeBoost> {
    
    private float attackMultiplier;
    private float defenseMultiplier;
    private float speedMultiplier;
    private float critChanceMultiplier;
    private float healthMultiplier;
    private float energyMultiplier;
    private ElementalBoost elementalBoost;

    public AttributeBoostBuilder(Element elementToBoost, float percentageEnhc) {
        this.elementalBoost = new ElementalBoost(elementToBoost, percentageEnhc);
    }

    @Override
    public AttributeBoost build() {
        return new AttributeBoost(
            this.attackMultiplier,
            this.defenseMultiplier,
            this.speedMultiplier,
            this.critChanceMultiplier,
            this.healthMultiplier,
            this.energyMultiplier,
            this.elementalBoost
        );
    }

    public AttributeBoostBuilder withAttackMultiplier(float attackMultiplier) {
        this.attackMultiplier = attackMultiplier;
        return this;
    }

    public AttributeBoostBuilder withDefenseMultiplier(float defenseMultiplier) {
        this.defenseMultiplier = defenseMultiplier;
        return this;
    }

    public AttributeBoostBuilder withSpeedMultiplier(float speedMultiplier) {
        this.speedMultiplier = speedMultiplier;
        return this;
    }

    public AttributeBoostBuilder withCritChanceMultiplier(float critChanceMultiplier) {
        this.critChanceMultiplier = critChanceMultiplier;
        return this;
    }

    public AttributeBoostBuilder withHealthMultiplier(float healthMultiplier) {
        this.healthMultiplier = healthMultiplier;
        return this;
    }

    public AttributeBoostBuilder withEnergyMultiplier(float energyMultiplier) {
        this.energyMultiplier = energyMultiplier;
        return this;
    }
}
