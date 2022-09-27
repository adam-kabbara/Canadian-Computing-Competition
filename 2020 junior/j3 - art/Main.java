import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int coord_count = sc.nextInt();
        int[] xs = new int[coord_count];
        int[] ys = new int[coord_count];
        sc.nextLine(); // \n char when we press enter for nextInt()
        for (int i=0; i<coord_count; i++){
            String[] str_lst = sc.nextLine().split(",");
            xs[i] = Integer.parseInt(str_lst[0]);
            ys[i] = Integer.parseInt(str_lst[1]);
        }
        sc.close();
        System.out.printf("%d,%d\n", getMin(xs)-1, getMin(ys)-1);
        System.out.printf("%d,%d\n", getMax(xs)+1, getMax(ys)+1);
    }

    public static int getMin(int[] lst){
        int min = (int) Double.POSITIVE_INFINITY;
        for (int c: lst){
            if (c < min)
                min = c;
        }
        return min;
    }

    public static int getMax(int[] lst){
        int max = (int) Double.NEGATIVE_INFINITY;
        for (int c: lst){
            if (c > max)
                max = c;
        }
        return max;
    }
}
