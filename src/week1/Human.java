package week1;

public abstract class Human {

    // instance variable
    private String name;
    private int age;
    private String address;


    //static varaible
    public static int countHuman;

    public Human(String name,  int age, String address){
        System.out.println("Using constructor one");
        this.name = name;
        this.age = age;
        this.address = address;
        countHuman++;
    }

    public Human(String name,  int age){
        System.out.println("Using constructor two");
        this.name = name;
        this.age = age;
        countHuman++;
    }

//
//    public Human(String address, String name,  int age){
//        System.out.println("Using constructor three");
//        this.name = name;
//        this.age = age;
//        this.address = address;
//    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (age != human.age) return false;
        if (!name.equals(human.name)) return false;
        return address.equals(human.address);

    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getCountHuman() {
        return countHuman;
    }

    public abstract void eat(int amount);
}
