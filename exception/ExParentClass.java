package practice.exception;

import java.io.IOException;

public class ExParentClass {
    public void start() throws IOException{
    }

    public void foo() throws NullPointerException{

    }

}

class ExChildClass extends ExParentClass{
    @Override
    public void start() throws IOException{
    }

    public void foo() throws RuntimeException{

    }




}
