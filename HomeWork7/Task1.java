import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static <T> Set<T> union (Set<T> setA, Set<T> setB) {
        Set<T> union = new HashSet<T>();
        union.addAll(setA);
        union.addAll(setB);
        
        return union;
    }
    
    public static <T> Set<T> intersect (Set<T> setA, Set<T> setB) {
        Set<T> union = new HashSet<T>();
        Set<T> intersect = new HashSet<T>();
        
        union.addAll(setA);
        
        for (T element : setB) {
            if (!union.add(element)) {
                intersect.add(element);
            }
        }
        
        return intersect;
    }
    
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<Integer>();
        Set<Integer> setB = new HashSet<Integer>();
        
        setA.addAll(Arrays.asList(new Integer[] {1, 2, 3, 4, 5}));
        setB.addAll(Arrays.asList(new Integer[] {1, 2, 3, 5, 8}));
        
        Set<Integer> union = union(setA, setB);
        Set<Integer> intersect = intersect(setA, setB);
        
        System.out.print("Union: ");
        for (Integer x : union) {
            System.out.print(x + " ");
        }
        
        System.out.print("\nIntersect: ");
        for (Integer x : intersect) {
            System.out.print(x + " ");
        }
    }
}
