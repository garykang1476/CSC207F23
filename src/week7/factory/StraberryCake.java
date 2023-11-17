package week7.factory;

import java.util.ArrayList;

public class StraberryCake extends BakingItem {
    @Override
    public void setupItem() {
        base = Base.CHOCOLATE_BREAD;
        toppings = new ArrayList<>();
        toppings.add(Topping.STRAWBERRY);
        toppings.add(Topping.CREAM);
    }
}
