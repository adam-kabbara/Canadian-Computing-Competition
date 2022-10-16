import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static int m;
    public static int n;
    public static boolean[] visited;
    public static List<List<Integer>> grid;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        m = Integer.parseInt(reader.readLine()); //sc.nextLine(); // read in the \n
        n = Integer.parseInt(reader.readLine()); //sc.nextLine(); // read in the \n
        grid = new ArrayList<List<Integer>>();

        // need to initialize lists within the lists
        for (int i=0; i <= 1000005; i++) { // 1000005 is largest possible val by question - cannot set it to m*n aince if theres
            grid.add(i, new ArrayList<Integer>()); // a number larger than m*n within the grid, an index out of range error will be thrown 
          }

        // build optimized grid
        for (int i=1; i<=m; i++){
            String[] row = reader.readLine().split(" ");
            for (int j=1; j<=n; j++){
                grid.get(i*j).add(Integer.parseInt(row[j-1]));
            }
        }

        visited = new boolean[1000005]; // 1000005 is larges possible val by question
        pathFound(1);
        System.out.println("no");
        
    }

    public static void pathFound(int x){
        if (!visited[x]){
            if (x == n*m){
                System.out.println("yes");
                System.exit(0);
            }
            visited[x] = true;
            for (Integer coord: grid.get(x))
                pathFound(coord);
        }
    }

    public static int[] arrStringToInt(String[] string_arr){
        int[] return_arr = new int[string_arr.length];
        for (int i=0; i<string_arr.length; i++){
            return_arr[i] = Integer.parseInt(string_arr[i]);
        }
        return return_arr;
    }
}