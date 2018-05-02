public class Koenigreich {
    public Koenigreich() {
    }

    public static void main(String[] args) {
        steuerbescheid(new Koenig(), 100);
        steuerbescheid(new Adel(), 20);
        steuerbescheid(new Bauer(), 20);
        steuerbescheid(new Leibeigener(), 100);
    }

    static void steuerbescheid(Einwohner einwohner, int einkommen) {
        einwohner.setEinkommen(einkommen);
        System.out.println(einwohner.getClass().getName() + ": Einkommen " + einkommen + ", zu versteuerndes Einkommen " + einwohner.zuVersteuerndesEinkommen() + ", Steuer " + einwohner.steuer());
    }
}