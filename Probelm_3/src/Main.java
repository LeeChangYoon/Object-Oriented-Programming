public class Main {
    public static void main(String[] args) {
        double[][] temp01 = {{0, 1, 2, 3, 4},
                             {5, 6, 7, 8, 9},
                             {10, 11, 12, 13, 14},
                             {15, 16, 17, 18, 19}};

        double[][] temp02 = {{15, 16, 17, 18, 19},
                             {10, 11, 12, 13, 14},
                             {5, 6, 7, 8, 9},
                             {0, 1, 2, 3, 4}};

        Matrix matrix01 = new Matrix(temp01);
        Matrix matrix02 = new Matrix(temp02);
        Matrix matrix01_transpose;
        Matrix Add = new Matrix(4, 5);
        Matrix Sub = new Matrix(4, 5);


        System.out.println("---------------- Basic Display ---------------");
        matrix01.display();
        System.out.println("----------------------------------------------\n");

        System.out.println("\n-------------- Transpose Display -------------");
        matrix01_transpose = matrix01.transpose();
        matrix01_transpose.display();
        System.out.println("----------------------------------------------\n");

        System.out.println("\n--------------- Addition Display -------------");
        Add = Add.Addition(matrix01, matrix02, 4, 5);
        Add.display();
        System.out.println("----------------------------------------------\n");

        System.out.println("\n------------- Subtraction Display ------------");
        Sub = Sub.Subtraction(matrix01, matrix02, 4, 5);
        Sub.display();
        System.out.println("----------------------------------------------\n");

        System.out.println("\n----------- Identity Matrix Display ----------");
        IdentityMatrix identityMatrix = new IdentityMatrix(5);
        identityMatrix.display();
        System.out.println("----------------------------------------------\n");
    }
}
