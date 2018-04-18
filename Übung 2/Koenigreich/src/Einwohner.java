public class Einwohner {
    int einkommen;

    public Einwohner() {
    }

    public void setEinkommen(int einkommen) {
        this.einkommen = einkommen;
    }

    public int zuVersteuerndesEinkommen() {
        int zuVersteuerndesEinkommen = this.einkommen;
        return zuVersteuerndesEinkommen;
    }

    public int steuer() {
        double zuZahlendesSteuer = (double)this.zuVersteuerndesEinkommen() * 0.1D;
        int Steuer = (int)zuZahlendesSteuer;
        if (Steuer < 1) {
            Steuer = 1;
        }

        return Steuer;
    }
}
