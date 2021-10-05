public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        System.out.println("Количество начисленных миль составит: " + service.calculate());

    }
}