package hw6;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime myTime1 = new MyTime(3, 0, 4);
        System.out.println(myTime1);
        System.out.println(myTime1.nextSecond());
        System.out.println(myTime1.nextMinute());
        System.out.println(myTime1.nextHour());
        System.out.println(myTime1.previousSecond());
        System.out.println(myTime1.previousMinute());
        System.out.println(myTime1.previousHour());
    }
}
