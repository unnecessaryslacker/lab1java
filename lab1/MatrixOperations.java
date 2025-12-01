package lab1;

public class MatrixOperations {

    public static Matrix apply(Matrix A, Matrix B, int C5) {
        Matrix result = new Matrix(A.rows, A.cols);

        switch (C5) {
            case 0 -> {
                double d = 2.0;
                for (int i = 0; i < A.rows; i++)
                    for (int j = 0; j < A.cols; j++)
                        result.data[i][j] = A.data[i][j].doubleValue()
                                + B.data[i][j].doubleValue() + d;
            }
            case 1 -> {
                for (int j = 0; j < A.cols; j++)
                    for (int i = 0; i < A.rows; i++)
                        result.data[j][i] = A.data[i][j];
            }
            case 2 -> {
                for (int i = 0; i < A.rows; i++)
                    for (int j = 0; j < A.cols; j++)
                        result.data[i][j] = A.data[i][j].doubleValue()
                                - B.data[i][j].doubleValue();
            }
            case 3 -> {
                for (int i = 0; i < A.rows; i++)
                    for (int j = 0; j < A.cols; j++)
                        result.data[i][j] = A.data[i][j].intValue()
                                ^ B.data[i][j].intValue();
            }
            case 4 -> {
                for (int i = 0; i < A.rows; i++) {
                    for (int j = 0; j < A.cols; j++) {
                        double sum = 0;
                        for (int k = 0; k < A.cols; k++) {
                            sum += A.data[i][k].doubleValue()
                                    * B.data[k][j].doubleValue();
                        }
                        result.data[i][j] = sum;
                    }
                }
            }
            default -> throw new IllegalArgumentException("Невірне значення C5!");
        }
        return result;
    }
}
