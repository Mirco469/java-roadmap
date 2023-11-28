package net.ielpo.roadmap;

public class Exercise3 {
    public static void asciiArt() {
        Integer totalRows = 10;

        for (Integer row = 0; row < totalRows; row++) {
            // Print @
            for (Integer at = 0; at < row; at++) {
                System.out.print('@');
            }
            // Print brackets
            if (row % 3 == 0 || row % 6 == 0) {
                System.out.print("[]");
            } else {
                System.out.print("][");
            }
            // Print #
            for (Integer hashtag = row; hashtag < totalRows - 1; hashtag++) {
                System.out.print('#');
            }

            // New Line
            System.out.println();
        }
    }
}
