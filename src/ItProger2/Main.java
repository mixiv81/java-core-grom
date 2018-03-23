package ItProger2;

public class Main {
   protected String variable;


}



class SomeMain extends Main {

    protected void printVariable(String string){
        this.variable = string;
        System.out.println(string);
    }

    public static void main(String[] args) {
        SomeMain someMain = new SomeMain();
        someMain.printVariable("ghgh");
    }
}