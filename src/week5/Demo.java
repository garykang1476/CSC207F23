package week5;

import banking.entity.BankAccount;
import week5.iterator.BankAccountsCollection;
import week5.singleton.Trump;

import java.util.Iterator;
import java.util.MissingFormatArgumentException;

public class Demo {

    static void foo(int a) throws MyException{
        if (a > 5){
            throw new MyException("This is an error message");
        }
        if (a == -1){
            throw new MyRuntimeException();
        }
    }

    public static void main(String[] args) {
//        try {
//            foo(-1);
//        }
//        catch (MyException e){
//            e.printStackTrace();
//        }
//        catch (MissingFormatArgumentException e){
//            System.out.println("something else.");
//        }
//        finally {
//            System.out.println("This line always run!!");
//        }
//        System.out.println("this line will run");

//        BankAccountsCollection bankAccountsCollection = new BankAccountsCollection();
//        bankAccountsCollection.addAccount(new BankAccount(1, 100));
//        bankAccountsCollection.addAccount(new BankAccount(2, 200));
//        bankAccountsCollection.addAccount(new BankAccount(3, 300));
//
//        for (BankAccount ba : bankAccountsCollection){
//            System.out.println(ba);
//        }
//
//
//        Iterator<BankAccount> iterator = bankAccountsCollection.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        Trump trump1 = Trump.getInstance();
        Trump trump2 = Trump.getInstance();
        Trump trump3 = Trump.getInstance();

        System.out.println(trump1 == trump2);
    }

}
