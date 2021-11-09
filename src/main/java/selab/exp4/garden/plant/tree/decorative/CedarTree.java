package selab.exp4.garden.plant.tree.decorative;

import selab.exp4.garden.plant.tree.Tree;

public class CedarTree extends DecorativeTree {

    public CedarTree() {
        this.setMass(200);
    }

    public CedarTree(CedarTree source) {
        this.setMass(source.getMass());
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
