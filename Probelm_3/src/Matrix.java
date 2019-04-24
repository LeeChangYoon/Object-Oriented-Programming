public class Matrix {
    double[][] data = null;
    int rows = 0, cols = 0;

    public Matrix(int rows, int cols) {
        data = new double[rows][cols];
        this.rows = rows;
        this.cols = cols;
    }

    public Matrix(double[][] data) {
        this.data = data.clone();
        rows = this.data.length;
        cols = this.data[0].length;
    }

    public void display() {
        System.out.print("[");
        for (int row = 0; row < rows; ++row) {
            if (row != 0) {
                System.out.print(" ");
            }

            System.out.print("[");

            for (int col = 0; col < cols; ++col) {
                System.out.printf("%8.3f", data[row][col]);

                if (col != cols - 1) {
                    System.out.print(" ");
                }
            }

            System.out.print("]");

            if (row == rows - 1) {
                System.out.print("]");
            }

            System.out.println();
        }
    }

    public Matrix transpose() {
        Matrix result = new Matrix(cols, rows);

        for (int row = 0; row < rows; ++row) {
            for (int col = 0; col < cols; ++col) {
                result.data[col][row] = data[row][col];
            }
        }

        return result;
    }

    public Matrix Addition(Matrix matrix_a, Matrix matrix_b, int rows, int cols) {
        Matrix ans = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans.data[i][j] = matrix_a.data[i][j] + matrix_b.data[i][j];
            }
        }

        return ans;
    }

    public Matrix Subtraction(Matrix matrix_a, Matrix matrix_b, int rows, int cols) {
        Matrix ans = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans.data[i][j] = matrix_a.data[i][j] - matrix_b.data[i][j];
            }
        }

        return ans;
    }
}