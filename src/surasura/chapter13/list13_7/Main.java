package surasura.chapter13.list13_7;

public class Main {
    public static void main(String[] args) {
        /* パソコンを倉庫に預ける */
        Warehouse<Computer> computerWarehouse = new Warehouse<>();
        Computer computer = new Computer();
        computerWarehouse.stock(computer);

        /* 自動車を倉庫に預ける */
        Warehouse<Car> carWarehouse = new Warehouse<>();
        Car car = new Car();
        carWarehouse.stock(car);
    }
}
