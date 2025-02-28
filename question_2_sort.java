public class question_2_sort {

        public static void main(String[] args) {
            int[][] a = {
                    {5, 4, 7},
                    {1, 8, 3},
                    {9, 6, 2}
            };
            int[] b = new int[9];
            int index = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    b[index++] = a[i][j];
                }
            }
            for (int i = 0; i < b.length - 1; i++) {
                for (int j = i + 1; j < b.length; j++) {
                    if (b[i] > b[j]) {
                        int temp = b[i];
                        b[i] = b[j];
                        b[j] = temp;
                    }
                }
            }
            index = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    a[i][j] = b[index++];
                }
            }
            System.out.println("Sorted Matrix:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }







