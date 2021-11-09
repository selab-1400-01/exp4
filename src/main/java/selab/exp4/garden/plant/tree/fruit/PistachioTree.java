package selab.exp4.garden.plant.tree.fruit;

import selab.exp4.garden.plant.tree.Tree;

public class PistachioTree extends FruitTree {

    public PistachioTree() {
        super(500);
    }

    @Override
    public int getWaterConsumption() {
        return 1500;
    }

    @Override
    public Tree copy() {
        PistachioTree pistachioTree = new PistachioTree();
        pistachioTree.setFruitsCount(this.getFruitsCount());
        return pistachioTree;
    }
}
