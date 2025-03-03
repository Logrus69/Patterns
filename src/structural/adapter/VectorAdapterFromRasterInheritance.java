package structural.adapter;

public class VectorAdapterFromRasterInheritance extends RasterGraphics implements VectorGraphicsInterface {


    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}
