package com.lec.exercise;

public class DriveMycar {

    public static void main(String[] args) {
        Car myCar = new Car();

        Car.Tire tire = myCar.new Tire(); // 처음보는 형태지만 이게 맞다.

        Car.Engine engine = new Car.Engine(); // 스태틱이라 바깥객체(myCar)없이 바로 됨.
    }
}
