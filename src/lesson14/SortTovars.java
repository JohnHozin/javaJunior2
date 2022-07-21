package lesson14;

import java.util.Set;
import java.util.TreeSet;

public class SortTovars
 {
    public static TreeSet<Tovar> SortTovarRateFromTo(Set<Tovar> tovars){
        TreeSet<Tovar> retTovar =new TreeSet<>(new SortTovarRateFromTo());
        for (Tovar t: tovars){
            retTovar.add(t);
        }
        return retTovar;
    }

//     public static TreeSet<Tovar> SortTovarNameFromTo(Set<Tovar> tovars) {
//
//        //return
//    }

     //     public static TreeSet<Tovar> SortTovarOtzivFromTo(Set<Tovar> tovars) {
//
//        //return
//    }



}
