package default2.lesson11;

public class Employee extends Person implements IEmployee{

    @Override
    protected String test(){
        return "Hello";
    }

}
