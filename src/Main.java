import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        System.out.println("Введите стоимость билета");
        Scanner console = new Scanner(System.in);
        service.cost = console.nextInt();
        System.out.println("Количество начисленных миль составит: " + service.calculate());

    }
}