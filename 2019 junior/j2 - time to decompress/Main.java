import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int line_count = sc.nextInt();
        sc.nextLine(); // read the new line char
        String[][] encoded = new String[line_count][2];
        
        for (int i=0; i<line_count; i++){
            encoded[i] = sc.nextLine().split(" ");
        }
        sc.close();

        for (int i=0; i<line_count; i++){
            int count = Integer.parseInt(encoded[i][0]);
            for (int j=0; j<count ;j++){
                System.out.print(encoded[i][1]);
            }
            if (i<line_count-1)
                System.out.print("\n");
        }
    }
}
