package selab.exp4.garden.plant.tree.fruit;

import selab.exp4.garden.plant.tree.Tree;

public class MapleTree extends FruitTree {

    public MapleTree() {
        this.setFruitsCount(500);
    }

    public MapleTree(MapleTree source) {
        this.setFruitsCount(source.getFruitsCount());
    }

    @Override
    public int getWaterConsumption() {
        return 10000;
    }

    @Override
    public Tree copy() {
        return new MapleTree(this);
    }
}
