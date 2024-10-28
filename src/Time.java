
// Задание 1.4 и 4.4 и 5.4
public class Time {
    // поля
    private int seconds;

    // свойства
    public int getSeconds() {
        return seconds;
    }
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    // вычисляю кол-во часов
    public int getHour() {
        return seconds / 3600;
    }

    // вычисляю кол-во минут
    public int getMinute() {
        return (seconds % 3600) / 60;
    }

    // вычисляю кол-во секунд
    public int getSecond() {
        return seconds % 60;
    }

    // конструкторы
    public Time() {
        this.seconds = 0;
    }

    public Time(int seconds) {
        this.seconds = seconds % 86400;
    }

    public Time(int hour, int minute, int second) {
        this.seconds = (hour * 3600 + minute * 60 + second) % 86400;
    }

    // методы
    public String toString() {
        return String.format("%d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
}