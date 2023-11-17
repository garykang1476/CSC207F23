package banking.gateway;

import banking.entity.BankAccount;

import java.io.*;
import java.util.HashMap;

public class SerializedBankAccountManager implements BankAccountGateway {


    HashMap<Integer, BankAccount> bankAccountHashMap;
    private final File serFile;

    public SerializedBankAccountManager(String serFilePath) {
        serFile = new File(serFilePath);
        readFile();

    }

    @Override
    public boolean isBankAccountExist(int id) {
        return bankAccountHashMap.containsKey(id);
    }

    @Override
    public BankAccount getBankAcountById(int id) {
        return bankAccountHashMap.get(id);
    }

    @Override
    public void updateAccount(BankAccount bankAccount) {
        int id = bankAccount.getAccNum();
        bankAccountHashMap.put(id, bankAccount);
        saveToFile();
    }

    private void readFile(){
        try{
            FileInputStream fileInputStream = new FileInputStream(serFile);
            ObjectInputStream in = new ObjectInputStream(fileInputStream);
            bankAccountHashMap = (HashMap<Integer, BankAccount>) in.readObject();

            in.close();
            fileInputStream.close();
        }
        catch (IOException e) {
            bankAccountHashMap = new HashMap<>();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private void saveToFile(){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(serFile);
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
            out.writeObject(bankAccountHashMap);

            out.close();
            fileOutputStream.close();
        }
        catch (IOException e) {
            System.out.println("No history found...");
        }



    }
}
