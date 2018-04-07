package lesson13;

import lesson7.DemoHomeWork;

public class L7 {
    public static void main(String[] args) {


        DemoHomeWork demoHomeWork = new DemoHomeWork();

        System.out.println(demoHomeWork.createOrder().toString());
        System.out.println(demoHomeWork.createOrderAndCallMethods().toString());

    }
}