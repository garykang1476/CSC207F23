package banking.gateway;

import banking.entity.BankAccount;


import java.io.*;
import java.util.HashMap;

public class FileBankAccountManager implements BankAccountGateway {

    HashMap<Integer, BankAccount> bankAccountHashMap = new HashMap<>();
    private final File csvFile;

    public FileBankAccountManager(String csvPath) {
        csvFile = new File(csvPath);
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

        if (csvFile.length() == 0){
            saveToFile();
        } else {
            try {
                BankAccount bankAccount;
                BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFile));
                String row;
                while((row = bufferedReader.readLine()) != null){
                    String[] data = row.split(",");
                    bankAccount = new BankAccount(Integer.valueOf(data[0]), Integer.valueOf(data[1]));
                    bankAccountHashMap.put(bankAccount.getAccNum(), bankAccount);
                }
            } catch (IOException e){
                throw new RuntimeException(e);
            }
        }

    }

    private void saveToFile(){
        BankAccount bankAccount;
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(csvFile));
            for(int id: bankAccountHashMap.keySet()){
                bankAccount = bankAccountHashMap.get(id);
                String line = bankAccount.getAccNum() + "," + bankAccount.getBalance();
                writer.write(line);
                writer.newLine();
            }

            writer.close();
        } catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}
