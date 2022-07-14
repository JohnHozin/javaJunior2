package lesson8.dz;

public class Avto extends Transport{

    private String pricep;

//    public Avto(){
//        super();
//    }

    public Avto(int bacObem,String name, String pricep){
        // 1 variant
        super(bacObem, name);
        this.pricep = pricep;

        // 2 variant
//        super.setBacObem(bacObem);
//        super.setName(name);
//        this.pricep=pricep;

        // 3 variant
//        super.bacObem=bacObem;
//        this.pricep=pricep;
    }

//    public void printName(){
//        System.out.println(super.getName);
//    }

}
