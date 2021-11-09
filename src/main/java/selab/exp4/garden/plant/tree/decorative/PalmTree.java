package selab.exp4.garden.plant.tree.decorative;

import selab.exp4.garden.plant.tree.Tree;

public class PalmTree extends DecorativeTree {

    public PalmTree() {
        super(300);
    }

    @Override
    public int getWaterConsumption() {
        return 1000;
    }

    @Override
    public Tree copy() {
        PalmTree palmTree = new PalmTree();
        palmTree.setMass(this.getMass());
        return palmTree;
    }
}
