package structural.adapter;

public class VectorAdapterFromRasterComposition implements VectorGraphicsInterface {

    private final RasterGraphics rasterGraphics;

    public VectorAdapterFromRasterComposition(RasterGraphics rasterGraphics) {
        this.rasterGraphics = rasterGraphics;
    }

    @Override
    public void drawLine() {
        rasterGraphics.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        rasterGraphics.drawRasterSquare();
    }
}
