import java.util.*;

public class UniqueAndDuplicateFinderCustom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in the list: ");
        int n = in.nextInt();

        List<Integer> inputList = new ArrayList<>();
        System.out.print("Enter the elements of the list: ");
        for (int i = 0; i < n; i++) {
            inputList.add(in.nextInt());
        }
        in.close();
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