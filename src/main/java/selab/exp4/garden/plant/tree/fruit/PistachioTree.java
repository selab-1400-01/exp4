package selab.exp4.garden.plant.tree.fruit;

import selab.exp4.garden.plant.tree.Tree;

public class PistachioTree extends FruitTree {

    public PistachioTree() {
        this.setFruitsCount(350);
    }

    public PistachioTree(PistachioTree source) {
        this.setFruitsCount(source.getFruitsCount());
    }

    @Override
    public int getWaterConsumption() {
        return 1500;
    }

    @Override
    public Tree copy() {
        return new PistachioTree(this);
    }
}
