package surasura.chapter9.list9_16;

public class Main {
    public static void main(String[] args) {
        Car car;
        car = new Car();
        car.speedUp(100000);    /* 時速10万km加速しようとしても、180kmにとどまる */
        car.speedDown(-40);     /* マイナスの減速は無視される　*/

        /* 速度 = 180 */
        System.out.println("速度 = " + car.getSpeed());
    }
}
