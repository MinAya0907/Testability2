public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKg = 55;
        double highInM = 1.60;
        int Bmi = service.calculate(weightInKg, highInM);

        System.out.println("Индекс массы тела: " + Bmi);
    }
}