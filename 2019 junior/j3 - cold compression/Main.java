import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // cause java is stupid
        String[] str_arr = new String[n];

        for (int i=0; i<n; i++){
            char[] line = sc.nextLine().toCharArray();
            char chr = line[0];
            int count = 0;
            String str = "";

            for (char c: line){
                if (c == chr)
                    count++;
                else{
                    str = str +count + " " +chr+" ";
                    chr = c;
                    count = 1;
                }
            }
            str = str +count + " " +chr;
            str_arr[i] = str;

        }
        sc.close();

        for (String s: str_arr)
            System.out.println(s);
    }
}