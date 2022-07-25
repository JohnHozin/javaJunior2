package lesson14;

import java.util.Comparator;
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

     public static TreeSet<Tovar> SortTovarNameFromTo(Set<Tovar> tovars) {
        TreeSet<Tovar> retTovar = new TreeSet<>((o1, o2) -> {
            if (o1.getOtzivs().size() != o2.getOtzivs().size()) {
                return Integer.compare(o1.getOtzivs().size(), o2.getOtzivs().size());
            }
            if (o1.getPrice() != o2.getPrice()) {
                return Integer.compare(o1.getPrice(), o2.getPrice());
            }
            if (o1.midRate() != o2.midRate()) {
                return Double.compare(o1.midRate(), o2.midRate());
            }
            if (!o1.getName().equals(o2.getName())) {
                return o1.getName().compareTo(o2.getName());
            }
            if (o1.getObzors().size() != o2.getObzors().size()) {
                return Integer.compare(o1.getObzors().size(), o2.getObzors().size());
            }
            return 0;
        });
        return retTovar;
    }

     //     public static TreeSet<Tovar> SortTovarOtzivFromTo(Set<Tovar> tovars) {
//
//        //return
//    }



}
