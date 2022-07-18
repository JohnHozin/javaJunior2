package default2.lesson13;

import java.util.*;

public class SetUtils implements ISetUtils{

    @Override
    public SortedSet<String> orderedSet(Collection<Integer> collection1, Set<String> set2) throws NullPointerException {
        SortedSet <String> sortOrderedSet = new TreeSet<>();

        //sortOrderedSet = collection1.toString();
        for (Integer col:collection1){
            sortOrderedSet.add(col.toString());
        }

        sortOrderedSet.addAll(set2);
        sortOrderedSet.stream().sorted(Comparator.reverseOrder());




        return sortOrderedSet;
    }

    @Override
    public Set<Integer> customOrderSet(int val1, int val2, int val3, int val4, int val5) {
        LinkedHashSet<Integer> someValues= new LinkedHashSet<>();
        someValues.add(val1);
        someValues.add(val2);
        someValues.add(val3);
        someValues.add(val4);
        someValues.add(val5);
        return someValues;
    }
}
