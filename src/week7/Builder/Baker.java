package week7.Builder;

class Baker { // director

    private CakeBuilder cakeBuilder;
    public void setCakeBuilder(CakeBuilder cakeBuilder) {
        this.cakeBuilder = cakeBuilder;
    }
    public Cake getCake() {
        return cakeBuilder.getCake();
    }
    public void constructCake() {
        cakeBuilder.ceateNewCake();
        cakeBuilder.addBread();
        cakeBuilder.addButter();
        cakeBuilder.addDryIngredients();
    }

    public static void main(String[] args) {
        Baker baker = new Baker();
        baker.setCakeBuilder(new StrawberryCakeBuilder());
        baker.constructCake();
        Cake strawberryCake = baker.getCake();

        baker.setCakeBuilder(new ChocoCakeBuilder());
        baker.constructCake();
        Cake chocoCake = baker.getCake();


    }
}

