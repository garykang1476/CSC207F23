package week5.singleton;

public class Trump {

    private static Trump theOnlyInstance;

    private Trump(){

    }

    public static Trump getInstance(){
        if (theOnlyInstance == null){
            theOnlyInstance = new Trump();
        }
        return theOnlyInstance;
    }
}
