/*  Fiby Naya Sari
    227064516076
*/
package tunjangan;
public class Main {
    public static void main(String[] args) {
        System.out.println("===P E G A W A I===");
        Pegawai pegawai2 = new Pegawai("boy", "lakilaki", "123", true);
        pegawai2.toShow();
        System.out.println("Tunjangan : " +  pegawai2.getTunjangan());
        System.out.println();
        
        Pegawai pegawai1 = new Pegawai("fiby naya sari", "perempuan", "227064516076", false);
        pegawai1.toShow();
        System.out.println("Tunjangan : " +  pegawai1.getTunjangan());
        System.out.println();
        
        System.out.println("===P R O G A M M E R===");
        Programmer programmer1 = new Programmer("bro", "lakilaki", "456", true, 5, 4500000);
        programmer1.toShow();
        System.out.println("Tunjangan : " + programmer1.getTunjangan());
        System.out.println("Bonus : " + programmer1.getBonus());
        System.out.println();
        
        Programmer programmer2 = new Programmer("girl", "perempuan", "789", true, 2, 5000000);
        programmer2.toShow();
        System.out.println("Tunjangan : " + programmer2.getTunjangan());
        System.out.println("Bonus : " + programmer2.getBonus());
        System.out.println();
        
        Programmer programmer3 = new Programmer("brodi", "lakilaki", "012", true, 10, 6500000);
        programmer3.toShow();
        System.out.println("Tunjangan : " + programmer3.getTunjangan());
        System.out.println("Bonus : " + programmer3.getBonus());
        System.out.println();
    }
}
