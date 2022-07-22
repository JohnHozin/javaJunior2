package lesson14;

import java.util.Set;
import java.util.TreeSet;

public class SortTovars
 {
    public static TreeSet<Tovar> SortTovarRateDescending(Set<Tovar> tovars){
        TreeSet<Tovar> retTovar =new TreeSet<>(new SortTovarRateDescending());
        for (Tovar t: tovars){
            retTovar.add(t);
        }
        return retTovar;
    }

     public static TreeSet<Tovar> SortTovarRateAscending(Set<Tovar> tovars){
         TreeSet<Tovar> retTovar =new TreeSet<>(new SortTovarRateAscending());
         for (Tovar t: tovars){
             retTovar.add(t);
         }
         return retTovar;
     }

     public static TreeSet<Tovar> SortTovarPriceDescending(Set<Tovar> tovars){
         TreeSet<Tovar> retTovar =new TreeSet<>(new SortTovarPriceDescending());
         for (Tovar t: tovars){
             retTovar.add(t);
         }
         return retTovar;
     }

     public static TreeSet<Tovar> SortTovarOtzivAscending(Set<Tovar> tovars){
         TreeSet<Tovar> retTovar =new TreeSet<>(new SortTovarOtzivAscending());
         for (Tovar t: tovars){
             retTovar.add(t);
         }
         return retTovar;
     }

     public static TreeSet<Tovar> SortTovarOtzivDescending(Set<Tovar> tovars){
         TreeSet<Tovar> retTovar =new TreeSet<>(new SortTovarOtzivDescending());
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
