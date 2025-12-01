package lab1;

public class MatrixCalculations {

    public static double calculate(Matrix C, int C11) {
        return switch (C11) {
            case 0 -> sumOfMinInColumns(C);
            case 1 -> sumOfMinInRows(C);
            case 2 -> sumOfMaxInColumns(C);
            case 3 -> sumOfMaxInRows(C);
            case 10 -> average(C);
            default -> throw new IllegalArgumentException("Невірне значення C11");
        };
    }

    private static double sumOfMinInColumns(Matrix C) {
        double total = 0;
        for (int j = 0; j < C.cols; j++) {
            double min = Double.MAX_VALUE;
            for (int i = 0; i < C.rows; i++)
                min = Math.min(min, C.data[i][j].doubleValue());
            total += min;
        }
        return total;
    }

    private static double sumOfMinInRows(Matrix C) {
        double total = 0;
        for (int i = 0; i < C.rows; i++) {
            double min = Double.MAX_VALUE;
            for (int j = 0; j < C.cols; j++)
                min = Math.min(min, C.data[i][j].doubleValue());
            total += min;
        }
        return total;
    }

    private static double sumOfMaxInColumns(Matrix C) {
        double total = 0;
        for (int j = 0; j < C.cols; j++) {
            double max = -1e9;
            for (int i = 0; i < C.rows; i++)
                max = Math.max(max, C.data[i][j].doubleValue());
            total += max;
        }
        return total;
    }

    private static double sumOfMaxInRows(Matrix C) {
        double total = 0;
        for (int i = 0; i < C.rows; i++) {
            double max = -1e9;
            for (int j = 0; j < C.cols; j++)
                max = Math.max(max, C.data[i][j].doubleValue());
            total += max;
        }
        return total;
    }

    private static double average(Matrix C) {
        double total = 0;
        int count = C.rows * C.cols;
        for (Number[] row : C.data)
            for (Number x : row)
                total += x.doubleValue();
        return total / count;
    }
}
