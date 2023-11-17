package banking.entity;

import java.util.ArrayList;

public class Safe {

    private int amount;
    private ArrayList<Integer> transcationHistory = new ArrayList<>();

    public void moveMoney(int amount) throws InsufficientFundException{
        if ((this.amount + amount) < 0){
            throw new InsufficientFundException();
        }

        this.amount  += amount;
        transcationHistory.add(amount);
    }
}
