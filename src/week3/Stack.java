package week3;

import javafx.scene.control.ScrollBar;

import java.util.ArrayList;

public class Stack<E extends Comparable<E>> {  // T  E  K  V

    private ArrayList<E> items;

    public Stack() {
        items = new ArrayList<>();
    }

    public boolean isEmpty(){
        return items.isEmpty();
    }

    public void push(E item){
        items.add(item);
    }

    public E pop(){
        return items.remove(items.size() - 1);
    }

    public static void main(String[] args) {

        // list[string]   list[int]
        Stack<String> s = new Stack<>();
//        s.push(123);
        s.push("String");
        Stack<Integer> s2 = new Stack<>();
        s2.push(123);

//        s.push(1.232343f);
    }
}
