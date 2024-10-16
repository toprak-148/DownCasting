public class Melon extends  Fruit{
    public Melon(String name)
    {
        super(name);
    }
    @Override
    public void eating() {
        System.out.println(super.getName() + " kavun kesilerek yeniyor.");
    }


}
