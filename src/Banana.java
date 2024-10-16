import javax.swing.plaf.basic.BasicMenuBarUI;

public class Banana extends Fruit{

    public Banana(String name)
    {
        super(name);
    }

    @Override
    public void eating() {
        System.out.println(super.getName() + " soyulup yeniliyor.");
    }


}
