package core.basesyntax;

public abstract class Figure implements FigurePrinter, AreaCalculator {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
