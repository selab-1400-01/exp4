package selab.exp4.garden.prototype;

import org.junit.Assert;
import org.junit.Test;
import selab.exp4.garden.plant.tree.decorative.CedarTree;
import selab.exp4.garden.plant.tree.decorative.PalmTree;
import selab.exp4.garden.plant.tree.fruit.PistachioTree;

public class PrototypeTests {
    @Test
    public void givenCedarTreePrototype_ReturnsClone() {
        CedarTree cedarTree = new CedarTree();
        copyCedarTree = cedarTree.copy();
        Assert.assertEquals(cedarTree.getMass(), copyCedarTree.getMass());
        Assert.assertEquals(cedarTree.getSize(), copyCedarTree.getSize());
    }

    @Test
    public void givenPistachioTreePrototype_ReturnsClone() {
        PistachioTree pistachioTree = new PistachioTree();
        copyPistachioTree = pistachioTree.copy();
        Assert.assertEquals(pistachioTree.getFruitsCount(), copyPistachioTree.getFruitsCount());
        Assert.assertEquals(pistachioTree.getSize(), copyPistachioTree.getSize());
        Assert.assertEquals(pistachioTree.getWaterConsumption(), copyPistachioTree.getWaterConsumption());
    }
}
