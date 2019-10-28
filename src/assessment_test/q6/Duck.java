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
