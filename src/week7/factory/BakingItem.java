package week7.factory;

import java.util.ArrayList;

public abstract class BakingItem {
    protected Base base;
    protected ArrayList<Topping> toppings;

    public BakingItem() {
        setupItem();
    }

    public abstract void setupItem();
}
