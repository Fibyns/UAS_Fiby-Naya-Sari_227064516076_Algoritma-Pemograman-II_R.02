/*  Fiby Naya Sari
    227064516076
*/
package Abstract;
//class ferari adalah kelas turunan dari car
public class Ferrari extends Car{
     public Ferrari(String name, int tahun) {
        super(name, tahun);
    }
     
    //karna toShow ada di class pegawai juga
    @Override
    public void Suara() {
        System.out.println("Rengggg!");
    }
}
