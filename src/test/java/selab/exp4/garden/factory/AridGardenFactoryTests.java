package selab.exp4.garden.factory;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AridGardenFactoryTests {
    private GardenFactory factory = new AridGardenFactory();

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
        Bush tree = this.factory.createBush();

        assertTrue(tree.isAppropriateForAridCondition());
    }
}
