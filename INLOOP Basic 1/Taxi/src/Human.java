public class Human
{
    String forename;
    String name;

    public Human(String forename, String name){
        this.forename = forename;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getForename(){
        return forename;
    }

    @Override
    public String toString()
    {
        String fullname = forename + " " + name;
        return fullname;
    }



}
