import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String str = sc.nextLine();
        boolean found = false;
        String cycle;
        sc.close();

        for (int i=0; i<str.length(); i++){
            cycle = (str.substring(i)+str.substring(0, i));
            if (text.indexOf(cycle) != -1){
                found = true;
                break;
            }
        }
        
        if (found){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
