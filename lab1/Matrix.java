package lab1;

public class Matrix {
    public Number[][] data;
    public int rows;
    public int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new Number[rows][cols];
    }

    public void print() {
        for (Number[] row : data) {
            for (Number x : row) {
                System.out.printf("%10s", x);
            }
            System.out.println();
        }
    }
}
