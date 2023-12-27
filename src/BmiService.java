public class BmiService {
    public int calculate(int weightInKg, double highInM){
        double BmiService = weightInKg/ (highInM * highInM);
        return (int) BmiService;

    }


}
