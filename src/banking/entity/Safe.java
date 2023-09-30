package banking.entity;

import java.util.ArrayList;

public class Safe {

    private int amount;
    private ArrayList<Integer> transcationHistory = new ArrayList<>();

    public void moveMoney(int amount){
        this.amount  += amount;
        transcationHistory.add(amount);
    }
}
