package lab1;

import java.util.Random;

public class MatrixGenerator {

    public static Matrix createMatrix(int rows, int cols, int C7) {
        Matrix m = new Matrix(rows, cols);
        Random rnd = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                m.data[i][j] = switch (C7) {
                    case 0 -> rnd.nextDouble() * 10;
                    case 1 -> (byte) rnd.nextInt(20);
                    case 2 -> (short) rnd.nextInt(50);
                    case 3 -> rnd.nextInt(100);
                    case 4 -> rnd.nextLong(100);
                    case 5 -> (rnd.nextInt(26) + 65);
                    case 6 -> rnd.nextFloat() * 10;
                    default -> 0;
                };
            }
        }
        return m;
    }
}
