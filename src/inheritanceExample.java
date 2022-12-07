interface Jelly{
    public void cook();
    public void addPreservatives();
    public void packaging();

}
class fruit{
    String foodtype="edible";
}
class Apple extends fruit{
    String pulptype="crunchy";
    void eatskin()
    {
        this.foodtype="edible";
    }
}
class Redapple extends Apple{
    String skincolor="Red";
}
class Greenapple extends Apple
{
    String skincolor="Green";
}



class Mango extends fruit{
    String pulptype="soft";
    void removeSkin() {
        String removal="must";
    }
}
class  Langra extends Mango
{
    String shape="oval";
    String sweetness="sweet";
}
class  Amropali extends Mango implements Jelly  {
    String shape="Elongated Shape";
    String sweetness="sweeter";
    public void cook()
    {
        System.out.println("Needs to be cooked");
    }
    public void addPreservatives() {
        System.out.println("Adding Preservatives");
    }
    public void packaging() {
        System.out.println("packaging done");
    }
}





public class inheritanceExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Apple m1=new Apple();
        Amropali a1=new Amropali();
        System.out.println(m1.foodtype);
        System.out.println(m1.pulptype);

        a1.cook();
        a1.addPreservatives();
        a1.packaging();
    }

}