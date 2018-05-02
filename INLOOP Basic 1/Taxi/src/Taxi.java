public class Taxi
{
    Human driver;
    Human [] place;
    Human [] formerCustomer;
    int number;



    public Taxi(Human driver)
    {
        this.driver = driver;
        String drivername = driver.toString();
        getDriverName();
        place = new Human[4];
        number = 0;
        place[0]=driver;
    }



    public void getDriverName(){
        String fullname = driver.toString();
        System.out.println("Your drivere today is " + fullname);
    }



    public void add(Human passenger){
        number ++;
        place[number] = passenger;


        if (number>3){
            System.out.println("We are sorry, Lucky Fuke. The taxi is full");
        }
        else{
            System.out.println(passenger.toString() + " gets in");
        }
    }



    public String toString(){
        if (number == 0){
            String empty = ("This is the Taxi of " + driver.toString()+ " He takes nobody along.");
            return empty;
            }else   if ((place[number].toString().equals("Andrea Bora"))){
            String VIP = ("This is the Taxi of " + driver.toString() + " He takes Andrea Bora along.");
            return VIP;
            }else if (number == 4){
            String full = ("This is the taxi of " + driver.toString() + "He takes Andrea Bora, Franzi Ada, Leah Posh and Susi Fresh along.");
            return full;
            }

        return null;
    }


    public void allGetOut(){
        int i;
        formerCustomer = new Human[4];
        for (i=1 ; i <= number ;i++){
            formerCustomer[i] = place[i];
            place[i]=null;
        }

        for (i=1 ; i <= number  ;i++){
            System.out.println("Good Bye: " + formerCustomer[i].toString());
        }
        number = 0;

    }
}


