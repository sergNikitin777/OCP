package assessment_test.q6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by snikitin on 28.10.19.
 */
public final class Duck {
    private String name;
    private final List<Duck> ducklings;
    public Duck(String name, List<Duck> ducklings) {
        this.name = name;
        this.ducklings = new ArrayList<Duck>(ducklings);
    }
    public String getName() { return name; }
    public List<Duck> getDucklings() { return new ArrayList<>(ducklings); }
    public String hasDucklings(Predicate<Duck> p) {
        return p.test(this) ? "Quack Quack": "";
    }
}

/*
A. None, the immutable object pattern is properly implemented.
B. Mark name and ducklings final.
C. Mark the Duck class final.
D. Have Duck implement the Immutable interface.
E. Remove the hasDucklings() method since any lambda expressions passed to it could
modify the Duck object.
F. Replace the getDucklings() with a method (or methods) that do not give the caller
direct access to the List<Duck> ducklings.
G. Change the type of List<Duck> to be List<Object>.
 */