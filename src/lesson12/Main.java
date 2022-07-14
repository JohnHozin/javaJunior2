package lesson12;

public class Main {
    public static void main(String[] args) {
//        String login = null;
//        login.equals("a");
//
//
//        System.out.println("Сработало");

        //1) создался объект
        //2) метод напечатать ошибку
        //3) закрыти программы

        Person p = new Person();
        try {
            p.setAge(1234);
            p.setName("");
            System.out.println("Пытаемся установить");
        } catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("Name");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Age");
        }
        System.out.println("Закончили");



    }
}
