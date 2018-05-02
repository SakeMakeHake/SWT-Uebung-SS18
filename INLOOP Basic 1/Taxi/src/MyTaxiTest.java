public class MyTaxiTest
{
    public static void main(String[] args)
    {
        Human driver = new Human("Juergen","Staub");
        Human m1 = new Human("Andrea", "Bora");
        Human m2 = new Human("Franzi","Ada");
        Human m3 = new Human("Leah","Posh");
        Human m4 = new Human("Susi","Fresh");
        Human m5 = new Human("Lucky","Fuke");
        Taxi Taxi1 = new Taxi(driver);
        Taxi1.add(m1);
        Taxi1.add(m2);
        //Taxi1.add(m3);

        System.out.println(Taxi1.toString());

        Taxi1.allGetOut();


    }


}
