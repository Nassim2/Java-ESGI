package ExoCompare;

public interface Operators<T> extends Comparable<T> {
    default boolean isLess(T t){
        return compareTo(t) < 0;
    }

    default boolean isGreatOrEqual(T t){
        return !isLess(t);
    }
}
