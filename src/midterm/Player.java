package midterm;

import java.util.ArrayList;

public abstract class Player implements Restartable {

    private String name;  // null
    private int id;  // 0
    private ArrayList<Double> scores;  // null
    protected String level = "Noob";


    static int count;


    Player(String name){    // (String)
        this.name = name;
        this.id = count ++;
        scores = new ArrayList<>();
    }

    Player(String name, ArrayList<Double> scores){  // (String, ArrayList<Double>)
        this.name = name;
        this.id = count ++;
        this.scores = new ArrayList<>(scores);
    }

    public abstract void play();




}
