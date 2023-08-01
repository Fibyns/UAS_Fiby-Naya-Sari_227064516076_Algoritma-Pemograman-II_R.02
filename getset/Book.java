/*  Fiby Naya Sari
    227064516076
*/
package getset;
class Book {
    private String title, author, price, isbn, year;
    
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPrice(String price){
        this.price = price;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public void setYear(String year){
        this.year = year;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getPrice(){
        return this.price;
    }
    public String getIsbn(){
        return this.isbn;
    }
    public String getYear(){
        return this.year;
    }
}
