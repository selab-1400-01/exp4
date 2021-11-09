package selab.exp4.garden.plant.tree;

import selab.exp4.garden.plant.Plant;
import selab.exp4.garden.prototype.IPrototype;

public abstract class Tree extends Plant implements IPrototype<Tree> {
    @Override
    public int getSize() {
        return 100;
    }

}
