package week7.Builder;

public class ChocoCakeBuilder extends CakeBuilder{

    @Override
    void addBread() {
        cake.setBread("ChocoBread");
    }

    @Override
    void addButter() {
        cake.setButter("ChocoButter");

    }

    @Override
    void addDryIngredients() {
        cake.setDryIngredients("Chocolate Chips");

    }
}
