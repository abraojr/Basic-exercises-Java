public class Main {
    public static void main(String[] args) {
         /*  Constructing A Diagonal Star Pattern With Loops
         Write a method named printSquareStar with one parameter of type int named number.
         If number is < 5, the method should print "Invalid Value".
         The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops (see examples below).

         printSquareStar(5); should print the following:
            *****
            ** **
            * * *
            ** **
            *****

         Explanation:
            *****   5 stars
            ** **   2 stars space 2 stars
            * * *   1 star space 1 star space 1 star
            ** **   2 stars space 2 stars
            *****   5 stars

         These patterns consist of a number of rows and columns (where number is the number of rows to print). For each row or column, stars are printed based on four
         conditions (Read them carefully):
         -> In the first or last row
         -> In the first or last column
         -> When the row number equals the column number
         -> When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)
        */

        printSquareStar(5);
        System.out.println();
        printSquareStar(8);
    }

    private static final String STAR = "*";
    private static final String SPACE = " ";

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int row = 1; row <= number; row++) {
            for (int column = 1; column <= number; column++) {

                boolean isFirstRowOrColumn = row == 1 || column == 1;
                boolean isLastRowOrColumn = row == number || column == number;
                boolean isDiagonal = row == column || (column == (number - row + 1));

                if (isFirstRowOrColumn || isLastRowOrColumn || isDiagonal) {
                    System.out.print(STAR);
                } else {
                    System.out.print(SPACE);
                }
            }

            System.out.println();
        }
    }
}