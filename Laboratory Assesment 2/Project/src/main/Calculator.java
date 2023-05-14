package project;

/**
 *
 * @authors Diego Díaz, Pablo Alonso, Marco Fernández
 */
public class Calculator {

    // Method 1 of class Calculator
    public static int extendedEuclidean(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return extendedEuclidean(b, a % b);
        }
    }

    // Method 2 of class Calculator
    public static double determinant3Matrix(double[][] matrix) {
        double det = 0;
        det += matrix[0][0] * matrix[1][1] * matrix[2][2];
        det += matrix[0][1] * matrix[1][2] * matrix[2][0];
        det += matrix[0][2] * matrix[1][0] * matrix[2][1];
        det -= matrix[0][2] * matrix[1][1] * matrix[2][0];
        det -= matrix[0][1] * matrix[1][0] * matrix[2][2];
        det -= matrix[0][0] * matrix[1][2] * matrix[2][1];
        return det;
    }
}
