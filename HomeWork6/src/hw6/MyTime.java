package hw6;

public class MyTime {
    private int hour, minute, second;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        String result = "";
        if (this.hour >= 10) {
            result += this.hour;
        } else {
            result += ("0" + this.hour);
        }
        result += ":";
        if (this.minute >= 10) {
            result += this.minute;
        } else {
            result += ("0" + this.minute);
        }
        result += ":";
        if (this.second >= 10) {
            result += this.second;
        } else {
            result += ("0" + this.second);
        }
        return result;

    }

    public MyTime nextSecond() {
        MyTime newTime;
        if (this.second < 59) {
            newTime = new MyTime(this.hour, this.minute, this.second + 1);
        } else if (this.minute < 59) {
            newTime = new MyTime(this.hour, this.minute + 1, 0);
        } else if (this.hour < 23) {
            newTime = new MyTime(this.hour + 1, 0, 0);
        } else {
            newTime = new MyTime(0, 0, 0);
        }
        return newTime;
    }

    public MyTime nextMinute() {
        MyTime newTime;
        if (this.minute < 59) {
            newTime = new MyTime(this.hour, this.minute + 1, this.second);
        } else if (this.hour < 23) {
            newTime = new MyTime(this.hour + 1, 0, this.second);

        } else {
            newTime = new MyTime(0, 0, this.second);
        }
        return newTime;
    }

    public MyTime nextHour() {
        MyTime newTime;
        if (this.hour < 23) {
            newTime = new MyTime(this.hour + 1, this.minute, this.second);
        } else {
            newTime = new MyTime(0, this.minute, this.second);
        }
        return newTime;
    }

    public MyTime previousSecond() {
        MyTime newTime;
        if (this.second > 0) {
            newTime = new MyTime(this.hour, this.minute, this.second - 1);
        } else if (this.minute > 0) {
            newTime = new MyTime(this.hour, this.minute - 1, 59);
        } else if (this.hour > 0) {
            newTime = new MyTime(this.hour - 1, 59, 59);
        } else {
            newTime = new MyTime(23, 59, 59);
        }
        return newTime;
    }

    public MyTime previousMinute() {
        MyTime newTime;
        if (this.minute > 0) {
            newTime = new MyTime(this.hour, this.minute - 1, this.second);
        } else if (this.hour > 0) {
            newTime = new MyTime(this.hour - 1, 59, this.second);

        } else {
            newTime = new MyTime(23, 59, this.second);
        }
        return newTime;
    }

    public MyTime previousHour() {
        MyTime newTime;
        if (this.hour > 0) {
            newTime = new MyTime(this.hour - 1, this.minute, this.second);
        } else {
            newTime = new MyTime(23, this.minute, this.second);
        }
        return newTime;
    }

}
