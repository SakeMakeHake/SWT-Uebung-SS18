import java.util.Scanner;

/**
 * Created by Tung on 09.04.2018.
 */
public class HelloLibrary
{
        // Simulation durch main()
        public static void main(String[] args) {

            // Erzeugung eines Library-Objektes

            Library library = new Library();

            // Erzeugung von zwei Book-Objekten

            Book Buch1 = new Book("HdR_1");
            Book Buch2 = new Book("HdR_2");

            // Nachricht an die Library, dass die Books aufgenommen werden sollen

            library.register(Buch1);
            library.register(Buch2);

            // Suchfunktion

            String searchbook = searchreader();

            library.search(searchbook);


            System.out.println("you want lend it? ");
            Scanner scan2 = new Scanner(System.in);
            String lending = scan2.next();
            String Yes =  "Yes";

            if(lending.equals(Yes))
            {
                library.loan(searchbook);
            }

            System.out.println("you give something back? ");
            Scanner scan3 = new Scanner(System.in);
            String givingback  = scan2.next();

            if(givingback.equals(Yes)){
                System.out.println("Which Book? ");
                Scanner scan4 = new Scanner(System.in);
                String bookback  = scan2.next();
                library.giveback(bookback);
            }


        }

        public static String searchreader(){
            System.out.println("Which u are looking ?: ");
            Scanner scan = new Scanner(System.in);
            String searchbook = scan.next();

            return searchbook;



        }
    }

