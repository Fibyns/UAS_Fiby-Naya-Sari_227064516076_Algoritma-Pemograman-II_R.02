/*  Fiby Naya Sari
    227064516076
*/
package getset;
public class Main {
    public static void main(String[] args) {
        Book fiby = new Book();
        
        fiby.setTitle("MeloDylan");
        fiby.setAuthor("Asriaci");
        fiby.setPrice("90000");
        fiby.setIsbn("978-602-6940-67-4");
        fiby.setYear("2017");
        
        System.out.println("Title   : " + fiby.getTitle());
        System.out.println("Author  : " + fiby.getAuthor());
        System.out.println("Price   : " + fiby.getPrice());
        System.out.println("Isbn    : " + fiby.getIsbn());
        System.out.println("Year    : " + fiby.getYear());
    }   
}
