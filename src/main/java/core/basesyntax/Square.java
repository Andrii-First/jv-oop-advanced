package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: Square, area: " + getArea() + " sq. units, side: " + side
                + " units, color: " + getColor();
    }

    @Override
    public String toString() {
        return draw();
    }
}
