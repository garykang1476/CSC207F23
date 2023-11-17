package banking.usecase;

public interface BankingOutputBoundary {

    void displayBlanaceAfterDepoisit(int balance);
    void displayInsufficentFundMessage();
}
