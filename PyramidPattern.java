public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 9; //
        printPyramidPattern(rows);
    }

    public static void printPyramidPattern(int rows) {
        for (int i = 1; i <= rows; i++) {

            int numberOfWhiteSpaces = (rows - i) * 2;
            printSpaces(numberOfWhiteSpaces);

            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }
}
