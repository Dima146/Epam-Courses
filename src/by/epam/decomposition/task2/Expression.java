package by.epam.decomposition.task2;

public final class Expression {

    private Expression() {
    }

    public static double implementExpression(double a, double b, double c) {
        if (a == 0) {
            throw new RuntimeException("Number a must not be equal 0 ");
        }
        return (b+ Math.sqrt(Math.pow(b, 2) + 4 * a * c)
                / (2 * a) - Math.pow(a, 3) * c +Math.pow(b, -2));
    }
}
