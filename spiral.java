package exercises;


public class spiral {
    public static void main(String[] args) {
        int[][] spiral =
                {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};
        int row = spiral[0].length;
        int column = spiral.length;
        int columnStart = 0, columnEnd = column - 1, rowStart = 0, rowEnd = row - 1;
        while (columnStart < columnEnd && rowStart < rowEnd) {
            for (int i = columnStart; i < columnEnd; i++) {
                System.out.print(spiral[columnStart][i] + " ");
            }
            for (int i = rowStart; i < rowEnd; i++) {
                System.out.print(spiral[i][columnEnd] + " ");
            }
            for (int i = columnEnd; i > rowStart; i--) {
                System.out.print(spiral[columnEnd][i] + " ");
            }
            for (int i = columnEnd; i > columnStart; i--) {
                System.out.print(spiral[i][rowStart] + " ");
            }
            columnStart++;
            columnEnd--;
            rowStart++;
            rowEnd--;
        }
    }
}

