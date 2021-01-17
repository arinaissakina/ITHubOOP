public class ResizableCircle extends CircleObject implements Resizable {

    public ResizableCircle() {
        super();
    }

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public void resize(int percent) {
        radius += radius / 100 * percent;
    }
}
