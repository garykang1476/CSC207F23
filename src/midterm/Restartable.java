package midterm;


// Interface focus on behavior, classes that implements this interface do not necessarily share any attributes.
// Abstract classes defines a type or a category of classes, where there are common attributes and behaviors.

public interface Restartable {

    int RESTART_FEE = 10; // constants

    void restart();
}
