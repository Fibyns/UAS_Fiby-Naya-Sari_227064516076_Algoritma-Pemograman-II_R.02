/*  Fiby Naya Sari
    227064516076
*/
package Abstract;
abstract class Car {
    String name;
    int tahun;

    public Car(String name, int tahun) {
        this.name = name;
        this.tahun = tahun;
    }
    // Metode abstrak untuk mengeluarkan suara hewan
    public abstract void Suara();

    // Metode non-abstrak untuk menampilkan informasi hewan
    public void Jenis() {
        System.out.println("Nama: " + name);
        System.out.println("Tahun: " + tahun);
    }
}
