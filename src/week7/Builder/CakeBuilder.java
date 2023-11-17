package week7.Builder;

abstract class CakeBuilder{
    protected Cake cake;
    public Cake getCake() {
        return cake;
    }
    public void ceateNewCake() {
        cake = new Cake();
    }

    abstract void addBread();
    abstract void addButter();
    abstract void addDryIngredients();
}