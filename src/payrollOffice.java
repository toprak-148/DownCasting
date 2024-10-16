import java.util.Random;

public class payrollOffice {

    public Fruit getFruit()
    {
        Fruit fruit = null;
        int sayi =(int) (Math.random()*3);

        if(sayi == 0)
        {
            fruit = new Banana("Muz");
        }
        else if(sayi == 1)
        {
            fruit = new Fruit("Meyve");
        }
        else if(sayi == 2)
        {
            fruit = new Apple("Elma");
        }
        else if(sayi == 3)
        {
            fruit = new Melon("Kavun");
        }

        return fruit;

    }
}
