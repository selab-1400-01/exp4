package selab.exp4.garden.factory;

import selab.exp4.garden.plant.bush.Bush;
import selab.exp4.garden.plant.tree.decorative.DecorativeTree;
import selab.exp4.garden.plant.tree.fruit.FruitTree;

public class AridGardenFactory extends GardenFactory {
    @Override
    public DecorativeTree createDecorativeTree() {
        return null;
    }

    @Override
    public FruitTree createFruitTree() {
        return null;
    }

    @Override
    public Bush createBush() {
        return null;
    }
}
