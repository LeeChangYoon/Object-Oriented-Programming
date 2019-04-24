import java.util.Scanner;
import java.util.Arrays;

public class Main {
    // Method that prints out the stars in pyramid shape
    public static void PrintStar(int Num) {
        int i, j;

        for (i = 0; i < (Num + 1) / 2; i++) {
            for (j = 0; j < (Num - 2 * i) / 2; j++)
                System.out.print(" ");
            for (j = 0; j < (i * 2) + 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    // Method that calculates two number arrays by the character arrays
    public static double[] Calc(double[] array1, double[] array2, char[] opArray) {
        double[] ans = new double[opArray.length];

        if (array1.length != array2.length || array1.length != opArray.length) {
            ans = null;
        }

        else {
            for (int i = 0; i < opArray.length; i++) {
                switch (opArray[i]) {
                    case '+':
                        ans[i] = array1[i] + array2[i];
                        break;
                    case '-':
                        ans[i] = array1[i] - array2[i];
                        break;
                    case '*':
                        ans[i] = array1[i] * array2[i];
                        break;
                    case '/':
                        try {
                            ans[i] = array1[i] / array2[i];
                            break;
                        }
                        catch (ArithmeticException e) {
                            System.out.println("Number cannot be divided by zero.");
                        }
                }
            }
        }
        return ans;
    }

    // Method that counts the frequency of each alphabet characters of a
    // String argument.
    public static int Frequency(String msg, char alpha) {
        int count = 0;

        String match = "[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s\n]";
        String msg_alpha = msg.replaceAll(match, "");
        char[] Statement = msg_alpha.toCharArray();

        for (char temp : Statement) {
            if (temp == alpha)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Num;

        // PrintStar
        while(true) {
            System.out.print("Enter an odd number: ");
            Num = input.nextInt();

            if (Num % 2 == 0) {
                System.out.println("It is even number, try it again");
                continue;
            }
            else
                PrintStar(Num);
            break;
        }

        System.out.println();

        // Calc
        double[] array1 = {7, 5, 3, 8, 4};
        double[] array2 = {5, 3, 2, 0, 8};
        char[] opArray = {'+', '-', '*', '/', '+'};

        double[] result = Calc(array1, array2, opArray);
        if (result == null)
            System.out.println("Error: length of arrays does not match.");
        else
            System.out.println("Answer: "+ Arrays.toString(result));

        System.out.println();

        // Frequency
        String msg = "object-oriented programming (oop) refers to a type of computer \n" +
                     "programming (software design) in which programmers define \n" +
                     "not only the data type of a data structure, but also the types of \n" +
                     "operations (functions) that can be applied to the data structure. \n" +
                     "in this way, the data structure becomes an object that includes \n" +
                     "both data and functions. in addition, programmers can create \n" +
                     "relationships between one object and another. for example, \n" +
                     "objects can inherit characteristics from other objects.";

        char alpha = 'a';
        int ans = Frequency(msg, alpha);
        System.out.println("Frequency of " + alpha + ": " + ans);
    }
}
