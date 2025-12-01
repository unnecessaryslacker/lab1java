package lab1;

public class Main {
    public static void main(String[] args) {
        try {
            int z = 3517;
            int C5 = z % 5;
            int C7 = z % 7;
            int C11 = z % 11;

            System.out.println("C5 = " + C5);
            System.out.println("C7 = " + C7);
            System.out.println("C11 = " + C11);

            int rows = 4;
            int cols = 4;

            Matrix A = MatrixGenerator.createMatrix(rows, cols, C7);
            Matrix B = MatrixGenerator.createMatrix(rows, cols, C7);

            System.out.println("\nMatrix A:");
            A.print();

            System.out.println("\nMatrix B:");
            B.print();

            Matrix C = MatrixOperations.apply(A, B, C5);

            System.out.println("\nMatrix C:");
            C.print();

            double result = MatrixCalculations.calculate(C, C11);
            System.out.println("\nFinal result (C11 operation): " + result);

        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
