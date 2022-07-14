package lesson3;

public class Main1 {
    public static void main(String[] args) {

//        int [][] mass = new int[5][6];
//        int i = mass.length;
//        int j = mass[i].length;

        int[][] nums = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
