import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int apples = 3*sc.nextInt() + 2*sc.nextInt() + sc.nextInt();
        int bananas = 3*sc.nextInt() + 2*sc.nextInt() + sc.nextInt();
        sc.close();

        if (apples > bananas)
            System.out.println('A');
        else if (bananas > apples)
            System.out.println('B');
        else
            System.out.println('T');
    }
    
}
