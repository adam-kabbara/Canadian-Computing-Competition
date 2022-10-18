import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data_entries = sc.nextInt();
        double[][] data = new double[data_entries][2];
        double max_speed = 0;
        sc.nextLine();

        for (int i=0; i<data_entries; i++){
            String[] entry = sc.nextLine().split(" ");
            data[i][0] = Integer.parseInt(entry[0]);
            data[i][1] = Integer.parseInt(entry[1]);
        }
        sc.close();

        Arrays.sort(data, new java.util.Comparator<double[]>() { // comparator arg is similar to the lambda key arg for the sort method in python
            public int compare(double[] a, double[] b) {
                return Double.compare(a[0], b[0]);
            }
        });

        for (int i=0; i<data.length-1; i++){
            double speed = Math.abs(data[i+1][1] - data[i][1]) / Math.abs(data[i+1][0] - data[i][0]);
            if (speed > max_speed)
                max_speed = speed;
        }
        System.out.println(max_speed);
    }
}
