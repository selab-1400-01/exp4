package selab.exp4.garden.plant.tree.fruit;

import selab.exp4.garden.plant.tree.Tree;

public class MapleTree extends FruitTree {

    public MapleTree() {
        super(200);
    }

    @Override
    public int getWaterConsumption() {
        return 10000;
    }

    @Override
    public Tree copy() {
        MapleTree mapleTree = new MapleTree();
        mapleTree.setFruitsCount(this.getFruitsCount());
        return mapleTree;
    }
}
