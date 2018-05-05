public class Adel extends Einwohner {
    public Adel() {
    }

    public int steuer() {
        int Steuer = super.steuer();
        if (Steuer <= 20) {
            Steuer = 20;
        } else {
            Steuer = super.steuer();
        }

        return Steuer;
    }
}