public class Apple extends  Fruit{

    public Apple(String name) {
        super(name);
    }

    @Override
    public void eating() {
        System.out.println(super.getName() + " bıçakla kesilip yeniliyor");
    }
}
