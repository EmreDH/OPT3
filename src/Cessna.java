public class Cessna {

    private boolean toestemmingtoren;
    private static double gewicht;
    private double snelheid;

    public Cessna(boolean toestemmingtoren, double gewicht, double snelheid) {
        this.toestemmingtoren = toestemmingtoren;
        this.gewicht = gewicht;
        this.snelheid = snelheid;
    }

    public boolean Opstijgen(boolean toestemming, double gewicht, double snelheid) {
        return toestemming && snelheid > 50 || gewicht < 1000;
    }
}
