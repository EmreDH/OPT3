public class getPrijs {

    private static double gewicht;

    public getPrijs(double gewicht) {
        this.gewicht = gewicht;
    }

    public static double GetPrijs() {
        if (gewicht<1000){
            return 100.0;
        }
        else if (gewicht<5000){
            return 500.0;
        }
        else{
            return 2500.0;
        }
    }
}
