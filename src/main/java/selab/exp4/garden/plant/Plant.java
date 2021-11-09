package selab.exp4.garden.plant;

public abstract class Plant {
    private static final int ARID_WATER_RATE_THRESHOLD = 20;

    public abstract int getSize();

    public abstract int getWaterConsumption();

    public boolean isAppropriateForAridCondition() {
        int rate = this.getWaterConsumption() / this.getSize();
        return rate <= ARID_WATER_RATE_THRESHOLD;
    }
}
