/**
 * Created by Tung on 09.04.2018.
 */
public class Book {
    private String title;
    private String state;

    public Book(String title) {

        this.title = title;
        this.state = "avaible";
    }

    public String toString()
    {
        return title;
    }

    //public void lend (Book Lend){
    //    Lend.state = "unavaible";
    //    System.out.println("Book " + Lend.title + " is " + Lend.state);
    //}

    public void lend(){
        this.state = "unavaible";
        System.out.println("Book " + this.title + " is now " + this.state);
    }

    public void back(String givedbackBook)
    {
        if (givedbackBook.equals(this.title)&& this.state.equals("avaible"))
        {
            System.out.println("this Book is still avaible");
        } else
        {
            this.state = "avaible";
            System.out.println("Book " + this.title + " is now " + this.state);
        }
    }
}
