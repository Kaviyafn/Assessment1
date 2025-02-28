public class question_1_sort {
        public static void main(String[] args) {
            int[][] a = {
                    {5, 4, 7},
                    {1, 8, 5},
                    {9, 6, 2}};
            int[] b = new int[9];
            int index = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    b[index++] = a[i][j];
                }
            }
            int thirdMax = -1;
            for (int i = 0; i < b.length; i++) {
                int count = 0;
                for (int j = 0; j < b.length; j++) {
                    if (b[j] > b[i]) {
                        count++;
                    }
                }
                if (count == 2) {
                    thirdMax = b[i];
                    break;
                }
            }

            if (thirdMax == -1) {
                System.out.println("No Third Max");
            } else {
                System.out.println("Third Maximum: " + thirdMax);
            }
        }
    }

