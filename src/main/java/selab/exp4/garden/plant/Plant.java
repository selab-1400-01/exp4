package selab.exp4.garden.plant;

public abstract class Plant {
    private static final int ARID_WATER_RATE_THRESHOLD = 20;

    private static final int RAINY_WATER_RATE_THRESHOLD = 40;

    public abstract int getSize();

    public abstract int getWaterConsumption();

    public boolean isAppropriateForAridCondition() {
        int rate = getWaterRate();
        return rate <= ARID_WATER_RATE_THRESHOLD;
    }

    public boolean isAppropriateForRainyCondition() {
        int rate = getWaterRate();
        return rate <= RAINY_WATER_RATE_THRESHOLD;
    }

    private int getWaterRate() {
        return this.getWaterConsumption() / this.getSize();
    }
}
