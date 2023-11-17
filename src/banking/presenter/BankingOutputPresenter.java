package banking.presenter;

import banking.usecase.BankingOutputBoundary;

public class BankingOutputPresenter implements BankingOutputBoundary {

    @Override
    public void displayBlanaceAfterDepoisit(int balance) {
        System.out.println("The new balance is" + balance);

    }

    @Override
    public void displayInsufficentFundMessage() {
        System.out.println("地主家也没有余粮呀！");
    }
}
