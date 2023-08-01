/*  Fiby Naya Sari
    227064516076
*/
package Abstract;
//class lamborghini adalah kelas turunan dari car
public class Lamborghini extends Car{
     public Lamborghini(String name, int tahun) {
        super(name, tahun);
    }

    //karna toShow ada di class pegawai juga
    @Override
    public void Suara() {
        System.out.println("Vroom Vroom!!");
    }
}
