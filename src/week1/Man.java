package week1;


public class Man extends Human implements Damagable, Hurtable{

    private int height;

    public Man(String name,  int age, String address, int height){
        super(name, age, address);
        this.height = height;
    }

    public void foo(){
        System.out.println(getName());
    }

    @Override
    public void eat(int amount) {
        height += amount;
    }

    @Override
    public void makeDamage() {

    }

    @Override
    public void getHurt() {

    }
}
