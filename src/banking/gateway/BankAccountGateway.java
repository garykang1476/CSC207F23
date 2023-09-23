package banking.gateway;

import banking.entity.BankAccount;

public interface BankAccountGateway {


    boolean isBankAccountExist(int id);
    BankAccount getBankAcountById(int id);
    void updateAccount(BankAccount bankAccount);


}
