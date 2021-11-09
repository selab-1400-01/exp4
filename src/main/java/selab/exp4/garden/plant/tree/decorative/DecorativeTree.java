package selab.exp4.garden.plant.tree.decorative;

import selab.exp4.garden.plant.tree.Tree;

public abstract class DecorativeTree extends Tree {
    private int mass;

    protected DecorativeTree(int mass) {
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }
}
