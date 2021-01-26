public class Artifact extends Item {

    private ArtifactType artifactType;

    public Artifact(String name, StarCategory starCategory, ArtifactType artifactType, AttributeBoost attrBoost) {
        super(name, starCategory, attrBoost);
        this.artifactType = artifactType;
    }

    public ArtifactType getArtifactType() {
        return this.artifactType;
    }

    public void setArtifactType(ArtifactType artifactType) {
        this.artifactType = artifactType;
    }
    

    @Override
    public String toString() {
        return new StringBuilder(this.starCategory.getRarityColor())
        .append(this.getName())
        .append(" ")
        .append(this.getArtifactType().toString())
        .append(" ")
        .append(this.getStarCategory().getStarNum())
        .append("*")
        .append(Rarity.RESET.getRarityColor())
        .toString();
    }
}
