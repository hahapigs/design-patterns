package org.example.pattern;

/**
 * 执行 main
 *
 * @author zhaohongliang 2023-07-18 17:01
 * @since 1.0
 */
public class TestMain {

    public static void main(String[] args) {
        Car car = new Car.Builder()
                .setBrandName("BMW")
                .setModel("5X")
                .setColor(ColorEnum.BLACK.getColor())
                .setInstructions("BMW")
                .build();

        System.out.println(car);
    }
}
