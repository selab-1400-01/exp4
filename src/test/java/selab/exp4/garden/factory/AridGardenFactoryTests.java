package selab.exp4.garden.factory;

import org.junit.Test;
import selab.exp4.garden.plant.bush.Bush;
import selab.exp4.garden.plant.tree.decorative.DecorativeTree;
import selab.exp4.garden.plant.tree.fruit.FruitTree;

import static org.junit.Assert.assertTrue;

public class AridGardenFactoryTests {
    private final GardenFactory factory = new AridGardenFactory();

    @Test
    public void createDecorativeTree_ReturnsResistantDecorativeTree() {
        DecorativeTree tree = this.factory.createDecorativeTree();

        assertTrue(tree.isAppropriateForAridCondition());
    }

    @Test
    public void createFruitTree_ReturnsResistantFruitTree() {
        FruitTree tree = this.factory.createFruitTree();

        assertTrue(tree.isAppropriateForAridCondition());
    }

    @Test
    public void createBush_ReturnsResistantBush() {
        Bush bush = this.factory.createBush();

        assertTrue(bush.isAppropriateForAridCondition());
    }
}
