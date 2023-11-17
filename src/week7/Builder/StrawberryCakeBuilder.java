package week7.Builder;

public class StrawberryCakeBuilder extends CakeBuilder {


    @Override
    void addBread() {
        cake.setBread("white breead");

    }

    @Override
    void addButter() {
        cake.setButter("Normal Butter");

    }

    @Override
    void addDryIngredients() {
        cake.setDryIngredients("Strawberry");

    }
}
