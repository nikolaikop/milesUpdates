import java.util.Scanner;

public class BonusMilesService {
    public int calculate() {
        System.out.println("Введите стоимость билета");
        Scanner console = new Scanner(System.in);
        int cost = console.nextInt();
        int miles = cost / 20;
        return miles;
    }
}
