package selab.exp4.garden.plant.tree.decorative;

import selab.exp4.garden.plant.tree.Tree;

public class CedarTree extends DecorativeTree {

    public CedarTree() {
        super(200);
    }

    @Override
    public int getWaterConsumption() {
        return 5000;
    }


    @Override
    public Tree copy() {
        CedarTree cedarTree = new CedarTree();
        cedarTree.setMass(this.getMass());
        return cedarTree;
    }
}
