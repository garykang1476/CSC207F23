package banking.usecase;

import banking.data.BankingInputRequestModel;

public interface BankingInputBoundary {

    void saveMoney(BankingInputRequestModel bankingInputRequestModel);
}
