package com.smart.injectfun;

public class Boss1 implements MagicBoss {
    public Car getCar() {
        Car car = new Car();
        car.setBrand("宝马z4");
        return car;
    }
}
