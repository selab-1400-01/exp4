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
        CedarTree copyCedarTree = (CedarTree) cedarTree.copy();
        Assert.assertEquals(cedarTree.getMass(), copyCedarTree.getMass());
        Assert.assertEquals(cedarTree.getSize(), copyCedarTree.getSize());
        Assert.assertEquals(cedarTree.getLayerCount(), copyCedarTree.getLayerCount());
    }

    @Test
    public void givenPistachioTreePrototype_ReturnsClone() {
        PistachioTree pistachioTree = new PistachioTree();
        PistachioTree copyPistachioTree = (PistachioTree) pistachioTree.copy();
        Assert.assertEquals(pistachioTree.getFruitsCount(), copyPistachioTree.getFruitsCount());
        Assert.assertEquals(pistachioTree.getSize(), copyPistachioTree.getSize());
        Assert.assertEquals(pistachioTree.getWaterConsumption(), copyPistachioTree.getWaterConsumption());
    }
}
