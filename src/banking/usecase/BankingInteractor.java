package banking.usecase;
import banking.data.BankingInputRequestModel;
import banking.entity.BankAccount;
import banking.entity.InsufficientFundException;
import banking.entity.Safe;
import banking.gateway.BankAccountGateway;

public class BankingInteractor implements BankingInputBoundary {

    private BankingOutputBoundary bankingOutputBoundary;
    private BankAccountGateway bankAccountGateway;
    private Safe safe = new Safe();

    public BankingInteractor(BankingOutputBoundary bankingOutputBoundary, BankAccountGateway bankAccountGateway) {
        this.bankingOutputBoundary = bankingOutputBoundary;
        this.bankAccountGateway = bankAccountGateway;
    }

    @Override
    public void saveMoney(BankingInputRequestModel bankingInputRequestModel) {
        BankAccount bankAccount = bankAccountGateway.getBankAcountById(bankingInputRequestModel.getId());

        try{
            safe.moveMoney(bankingInputRequestModel.getAmount());
            bankAccount.deposit(bankingInputRequestModel.getAmount());
            bankAccountGateway.updateAccount(bankAccount);
            bankingOutputBoundary.displayBlanaceAfterDepoisit(bankAccount.getBalance());
        }
        catch (InsufficientFundException e){
            bankingOutputBoundary.displayInsufficentFundMessage();
        }



    }
}
