/*  Fiby Naya Sari
    227064516076
*/
package tunjangan;
//class programmer yg merupakan turunan dari class pegawai 
class Programmer extends Pegawai{
    int lama;
    double gaji;
    //constructor mengguakan paramenter
    Programmer(String nama, String jk, String noPegawai, boolean menikah, int lama, double gaji) {
        super(nama, jk, noPegawai, menikah);
        this.lama = lama;
        this.gaji = gaji; 
    }
    double getBonus(){
                //menggunakan if ele karena untuk menghitung gaji
        if (lama < 5) {
            return gaji * 0.05;
        } else {
            return gaji * 0.1;
        }
    }
    @Override
    //karna toShow ada di class pegawai juga
    void toShow(){
        super.toShow();
        System.out.println("Lama Bekerja : " + lama);
        System.out.println("Gaji :"+ gaji);
    }
}
