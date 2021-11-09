package selab.exp4.garden.plant.tree.decorative;

import selab.exp4.garden.plant.tree.Tree;

public class CedarTree extends DecorativeTree {

    private int layerCount;

    public int getLayerCount() {
        return layerCount;
    }

    public void setLayerCount(int layerCount) {
        this.layerCount = layerCount;
    }

    public CedarTree() {
        this.setMass(200);
        this.setLayerCount(5);
    }

    public CedarTree(CedarTree source) {
        this.setMass(source.getMass());
        this.setLayerCount(source.getLayerCount());
    }

    @Override
    public int getWaterConsumption() {
        return 5000;
    }


    @Override
    public Tree copy() {
        return new CedarTree(this);
    }
}
