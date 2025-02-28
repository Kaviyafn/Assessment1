public class question_3_sort {
    public static void main(String[] args) {
            int[][] a = {
                    {5, 4, 7},
                    {1, 8, 3},
                    {9, 6, 2}
            };
            a[1][0] = a[0][1];
            a[1][2] = a[1][2];
            a[2][0] = a[0][2];
            a[2][1]=a[1][2];
            a[2][2] = a[2][2];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


