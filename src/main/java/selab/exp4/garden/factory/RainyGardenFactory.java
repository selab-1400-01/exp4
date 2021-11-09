package selab.exp4.garden.factory;

import selab.exp4.garden.plant.bush.Bush;
import selab.exp4.garden.plant.bush.FloweryBush;
import selab.exp4.garden.plant.tree.decorative.CedarTree;
import selab.exp4.garden.plant.tree.decorative.DecorativeTree;
import selab.exp4.garden.plant.tree.fruit.FruitTree;
import selab.exp4.garden.plant.tree.fruit.MapleTree;

public class RainyGardenFactory extends GardenFactory {
    @Override
    public DecorativeTree createDecorativeTree() {
        return new CedarTree();
    }

    @Override
    public FruitTree createFruitTree() {
        return new MapleTree();
    }

    @Override
    public Bush createBush() {
        return new FloweryBush();
    }
}
