package banking.data;

public class BankingInputRequestModel {
    private int id;
    private int amount;

    public BankingInputRequestModel(int id, int amount) {
        this.id = id;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }
}
