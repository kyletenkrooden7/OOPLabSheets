package labsheet5.exercise1;

//Book.java
/*An instantiable class which defines a Book, this version is based on exercise 5 which
* includes additional code in the mutators to do some basic input validation*/

/*Instantiable class*/public class Book {
    String title;
    double price;
    String ISBN;
    int pages;

    /*no-argument constructor*/  public Book(){
        this("Title Not Available",0.00,"ISBN Not Available",0);
    }

  /*multi-argument constructor*/  public Book(String title, double price, String ISBN, int pages) {
        setTitle(title);
        setPrice(price);
        setISBN(ISBN);
        setPages(pages);
    }

    public String getTitle() {
        return title;
    }

   /*Mutator method*/ public void setTitle(String title) {
            if(title == null || title.equals(""))
                this.title = "No Valid Title Supplied";
            else
                this.title = title;
            //.this differentiates between an argument and a attribute
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0 || price>50000)
            this.price = 0;
        else
            this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        if(ISBN == null || ISBN.equals(""))
            this.ISBN = "No Valid ISBN Supplied";
        else
            this.ISBN = ISBN;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if(pages<0 || pages>4000)
            this.pages = 0;
        else
            this.pages = pages;
    }

    public String toString() {
        return "Title: " + getTitle() + "  Price: " + getPrice() +
                "  ISBN: " + getISBN() + "  Number of Pages: " + getPages();
    }


}
