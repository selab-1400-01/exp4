package selab.exp4.garden.plant.tree.decorative;

import selab.exp4.garden.plant.tree.Tree;

public class PalmTree extends DecorativeTree {

    public PalmTree() {
        this.setMass(300);
    }

    public PalmTree(PalmTree source) {
        this.setMass(source.getMass());
    }

    @Override
    public int getWaterConsumption() {
        return 1000;
    }

    @Override
    public Tree copy() {
        return new PalmTree(this);
    }
}
