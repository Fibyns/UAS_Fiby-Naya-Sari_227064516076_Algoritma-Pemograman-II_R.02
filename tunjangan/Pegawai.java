/*  Fiby Naya Sari
    227064516076
*/
package tunjangan;
//bikin class pegawai
public class Pegawai {
    //deklarasi varariable 
    String nama, jk, noPegawai;
    boolean menikah;
    int getTunjangan(){
        //menggunakan if ele karena jk ada 2 perempuan dan laki laki
        if (menikah) {
            return (jk.equalsIgnoreCase("lakilaki")) ? 200000 : 150000;
        } else {
            return 100000;
        }
    }
    //constructor mengguakan paramenter
    Pegawai(String nama, String jk, String noPegawai, boolean menikah){
        this.nama = nama;
        this.jk = jk;
        this.noPegawai = noPegawai;
        this.menikah = menikah;
    }
    
    void toShow(){
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jk);
        System.out.println("No Pegawai: " + noPegawai);
        System.out.println("Status Menikah: " + (menikah ? "Sudah Menikah" : "Belum Menikah"));
    }
}
