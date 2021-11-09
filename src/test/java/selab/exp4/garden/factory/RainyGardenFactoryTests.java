package selab.exp4.garden.factory;

import org.junit.Test;
import selab.exp4.garden.plant.bush.Bush;
import selab.exp4.garden.plant.tree.decorative.DecorativeTree;
import selab.exp4.garden.plant.tree.fruit.FruitTree;

import static org.junit.Assert.assertTrue;

public class RainyGardenFactoryTests {
    private final GardenFactory factory = new RainyGardenFactory();

    @Test
    public void createDecorativeTree_ReturnsWaterFriendlyDecorativeTree() {
        DecorativeTree tree = this.factory.createDecorativeTree();

        assertTrue(tree.isAppropriateForRainyCondition());
    }

    @Test
    public void createFruitTree_ReturnsWaterFriendlyFruitTree() {
        FruitTree tree = this.factory.createFruitTree();

        assertTrue(tree.isAppropriateForRainyCondition());
    }

    @Test
    public void createBush_ReturnsWaterFriendlyBush() {
        Bush bush = this.factory.createBush();

        assertTrue(bush.isAppropriateForRainyCondition());
    }
}
