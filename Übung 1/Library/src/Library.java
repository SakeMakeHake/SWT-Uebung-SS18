/**
 * Created by Tung on 09.04.2018.
 */
public class Library
{
    private Book[] myBooks;

    private int number;

    public Library()
    {
        myBooks = new Book[10];
        number = 0;
        System.out.println("Hello, I am a small library for at most 10 books.");
    }

    public void register(Book book)
    {
        myBooks[number] = book;
        number += 1;
        System.out.println("A new book is registered: " + book);
    }


    public void search(String Search)
    {
        int number = 0;
        while (number < myBooks.length)
        {
            if (myBooks[number].toString().equals(Search))
            {
                System.out.println("Book founded in Array " + number);
                break;
            } else
            {
                number++;
            }


        }
    }

    public void loan(String Loan)
    {
        int number = 0;
        while (number < myBooks.length)
        {
            if (myBooks[number].toString().equals(Loan))
            {
                myBooks[number].lend();
                break;
            } else
            {
                number++;
            }
        }


    }

    public void giveback(String bookback){
        int number = 0;
        while (number < myBooks.length)
        {
            if (myBooks[number].toString().equals(bookback))
            {
                myBooks[number].back(myBooks[number].toString());
                break;
            } else
            {
                number++;
            }
        }

    }
}


