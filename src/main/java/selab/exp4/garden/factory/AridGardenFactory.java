package selab.exp4.garden.factory;

import selab.exp4.garden.plant.bush.Bush;
import selab.exp4.garden.plant.bush.ThornyBush;
import selab.exp4.garden.plant.tree.decorative.DecorativeTree;
import selab.exp4.garden.plant.tree.decorative.PalmTree;
import selab.exp4.garden.plant.tree.fruit.FruitTree;
import selab.exp4.garden.plant.tree.fruit.PistachioTree;

public class AridGardenFactory extends GardenFactory {
    @Override
    public DecorativeTree createDecorativeTree() {
        return new PalmTree();
    }

    @Override
    public FruitTree createFruitTree() {
        return new PistachioTree();
    }

    @Override
    public Bush createBush() {
        return new ThornyBush();
    }
}
