package selab.exp4.garden.factory;

import selab.exp4.garden.plant.bush.Bush;
import selab.exp4.garden.plant.tree.decorative.DecorativeTree;
import selab.exp4.garden.plant.tree.fruit.FruitTree;

public abstract class GardenFactory {
    public abstract DecorativeTree createDecorativeTree();

    public abstract FruitTree createFruitTree();

    public abstract Bush createBush();
}
