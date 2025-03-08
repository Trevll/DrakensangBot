package drakensang.bot.model;

public class GemModel {
    private boolean active;
    private GemQualityEnum gemQuality;
    private GemTypeEnum gemType;

    public GemModel(boolean active, GemQualityEnum gemQuality, GemTypeEnum gemType) {
        this.active = active;
        this.gemQuality = gemQuality;
        this.gemType = gemType;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public GemQualityEnum getGemQuality() {
        return gemQuality;
    }

    public void setGemQuality(GemQualityEnum gemQuality) {
        this.gemQuality = gemQuality;
    }

    public GemTypeEnum getGemType() {
        return gemType;
    }

    public void setGemType(GemTypeEnum gemType) {
        this.gemType = gemType;
    }
}