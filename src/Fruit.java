public class Fruit {

    private String name;

    public Fruit(String name){
        this.name = name;
    }

    public void eating() {
        System.out.println(this.name + " eating");
    }


    public String getName()
    {
        return this.name;
    }

}
