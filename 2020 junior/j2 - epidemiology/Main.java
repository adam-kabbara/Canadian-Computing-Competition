import java.util.Scanner; 

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int threshold = sc.nextInt(); // P value
        int infected_count = sc.nextInt(); // N value / new ppl infected
        int disease_jump = sc.nextInt(); // R value
        int total_infected = infected_count;
        int days = 0;
        sc.close();

        while (total_infected <= threshold){
            infected_count = infected_count * disease_jump;
            total_infected += infected_count;
            days++;
        }
        
        System.out.println(days);
    }
}
