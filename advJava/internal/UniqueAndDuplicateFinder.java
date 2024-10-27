import java.util.*;

public class UniqueAndDuplicateFinder {
    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 1, 1, 4, 2, 5, 3, 2, 1, 4, 6, 7, 5, 3, 2, 4, 7, 8, 3, 1, 10, 21, 11, 10, 17, 18, 17, 19, 21, 16, 17, 19, 21);
        
        Set<Integer> uniqueSet = new HashSet<>();
        Set<Integer> duplicateSet = new HashSet<>();
        
        for (int num : inputList) {
            if (uniqueSet.add(num)==false) {
                duplicateSet.add(num);
            }
        }
        
        uniqueSet.removeAll(duplicateSet);
        
        List<Integer> uniqueList = new ArrayList<>(uniqueSet);
        List<Integer> duplicateList = new ArrayList<>(duplicateSet);
        
        Collections.sort(uniqueList);
        Collections.sort(duplicateList);
        
        System.out.println("Unique = " + uniqueList);
        System.out.println("Duplicate = " + duplicateList);
    }
}