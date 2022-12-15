import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String commands = sc.nextLine();
        sc.close();
        int[][] grid = {{1,2},
                        {3,4}};
        int v = (commands.length() - commands.replace("V", "").length())%2;
        int h = (commands.length() - commands.replace("H", "").length())%2;

        if (h==1 & v==1){
            grid = new int[][] {{4,3},
                                {2,1}};
        }
        else if (v==1){
            grid = new int[][] {{2, 1},
                                {4, 3}};
        }
        else if (h==1){
            grid = new int[][] {{3, 4},
                                {1, 2}};
        }
        for (int[] r: grid){
            System.out.print(r[0]);
            System.out.print(' ');
            System.out.println(r[1]);
        }
    }
}
