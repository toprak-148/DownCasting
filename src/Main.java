public class Main {
    public static void main(String[] args) {
        Fruit fruit = new Fruit("Fruit");
        //!** Banana banana = fruit; // derleyici hatası
 //       Banana banana1 = ( Banana) fruit;//classCastException(CCE) ama engellemenin yolu vardır : instanceOf

   //     Fruit fruit1 = new Banana("Muz");
     //   fruit1.eating();
        payrollOffice payrollOffice = new payrollOffice();
        Fruit fruit1 = payrollOffice.getFruit();
        if( fruit1 instanceof Banana){
            Banana banana1 = (Banana) fruit1;
            banana1.eating();
        }
        else if(fruit1 instanceof Melon)
        {

            Melon melon = (Melon) fruit1;
            melon.eating();
         }
        else if(fruit1 instanceof Apple)
        {
            Apple apple = (Apple) fruit1;
            apple.eating();
        }
        else if(fruit1 instanceof  Fruit){
            Fruit fruit2 = (Fruit) fruit1;
            fruit2.eating();
        }



    }
}