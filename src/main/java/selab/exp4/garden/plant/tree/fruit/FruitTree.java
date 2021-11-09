package selab.exp4.garden.plant.tree.fruit;

import selab.exp4.garden.plant.tree.Tree;

public abstract class FruitTree extends Tree {
    private int fruitsCount;


    public int getFruitsCount() {
        return fruitsCount;
    }

    public void setFruitsCount(int fruitsCount) {
        this.fruitsCount = fruitsCount;
    }
}
