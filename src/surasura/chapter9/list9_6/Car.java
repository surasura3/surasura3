package surasura.chapter9.list9_6;

class Car {
    /* スピードを保存するフィールド */
    int speed;

    /* スピードを上げるメソッド */
    void speedUp(int value) {
        this.speed += value;
    }

    /* スピードを下げるメソッド */
    void speedDown(int value) {
        this.speed -= value;
    }
}
