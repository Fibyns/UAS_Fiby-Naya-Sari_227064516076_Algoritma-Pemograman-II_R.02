/*  Fiby Naya Sari
    227064516076
*/
package Abstract;
public class Main {
    public static void main(String[] args) {
        Lamborghini lamborghini = new Lamborghini("Red", 2022);
        Ferrari ferrari = new Ferrari("mcqueen", 2006);
        
        // memanggil class lamogini
        System.out.println("Informasi Lamborghini:");
        lamborghini.Jenis();
        lamborghini.Suara();
        
        System.out.println();
        
        // memanggil class ferrari
        System.out.println("Informasi ferrari:");
        ferrari.Jenis();
        ferrari.Suara();
    }
}
