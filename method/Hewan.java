/*  Fiby Naya Sari
    227064516076
*/
package method;
class Hewan {
    //method constructor
    Hewan(){
        System.out.println("membuat objek hewan");
    }
    
    //method constructor
    Hewan(String namahewan){
        System.out.println("membuat objek" + namahewan);
    }
    
    //method overloading
    public void suara(){
        System.out.println("hewan membuat suara ... ");
    }
    
    //method overloading
    public void suara(String suarahewan){
        System.out.println("hewan membuat suara" + suarahewan);
    }
}
class Kucing extends Hewan{
    Kucing(){
        System.out.println("membuat objek kucing");
    }
    
    // method overriding
    @Override
    public void suara(){
        System.out.println("Meong!");
    }
}
