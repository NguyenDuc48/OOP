package hw6;

public class MyDate {
    public static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public static final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private int year, month, day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate(int year) {
        this.year = year;
    }

    public static int getMonthLastDay(int year, int month) {
        MyDate newDate = new MyDate(year);
        return DAYS_IN_MONTHS[month - 1] + (newDate.isLeapYear() && month == 2 ? 1 : 0);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public boolean isLeapYear() {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public boolean isValidDate() {
        if (year >= 1 && year <= 9999) {
            if (month >= 1 && month <= 12) {
                if (month == 2 && isLeapYear() == true && day == 29) {
                    return true;

                } else if (day <= DAYS_IN_MONTHS[month - 1] && day >= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public int getDayOfWeek() {
        if (!isValidDate()) {
            return -1;
        }
        int countLeapYear = 0;
        for (int i = 1; i < year; i++) {
            MyDate newDate = new MyDate(i);
            if (newDate.isLeapYear()) {
                countLeapYear++;
            }
        }

        int countDay = day + countLeapYear + (year - 1) * 365;

        for (int idxMonth = month - 1; idxMonth > 0; idxMonth--) {
            if (idxMonth == 2 && isLeapYear() == true) {
                countDay += 29;
            } else {
                countDay += DAYS_IN_MONTHS[idxMonth - 1];
            }
        }

        return (countDay) % 7;

    }

    @Override
    public String toString() {
        if (!isValidDate()) {
            return "InValid";
        }
        String result = "";
        switch (getDayOfWeek()) {
            case 0:
                result += "Sunday";
                break;
            case 1:
                result += "Monday";

                break;
            case 2:
                result += "Tuesday";
                break;
            case 3:
                result += "Wednesday";
                break;
            case 4:
                result += "Thursday";
                break;
            case 5:
                result += "Friday";
                break;
            default:
                result += "Saturday";
                break;
        }
        result = result + " " + day + " " + MONTHS[month - 1] + " " + year;

        return result;
    }

    //    public MyDate nextDay() {
//        if (this.day  < DAYS_IN_MONTHS[this.month - 1]) {
//            this.setDay(this.day + 1);
//        }
//        else if (this.month < 12) {
//            if (this.month == 2 && this.isLeapYear()) {
//                this.setDay(this.day + 1);
//            }
//            else {
//                this.setDay(1);
//                this.setMonth(this.month + 1);
//            }
//        }
//        else {
//            int newYear = this.year + 1;
//            if ( newYear > 9999) {
//                System.out.println("Year out of range!");
//                return this;
//            }
//            else {
//                this.setYear(newYear);
//                this.setDay(1);
//                this.setMonth(1);
//            }
//        }
//        return this;
//    }
//    public MyDate nextMonth() {
//        int newDay = 30 - (DAYS_IN_MONTHS[this.month - 1] - this.day);
//
//    }
//}
    public MyDate nextDay() {
        int lastDay = DAYS_IN_MONTHS[this.month - 1];
        if (isLeapYear() && this.month == 2) {
            lastDay++;
        }
        if (lastDay == day && 12 == month && 9999 == year) {
            return this;
        }

        if (lastDay == day && 12 == month) {
            setDate(year + 1, 1, 1);
            return this;
        }

        if (lastDay == day) {
            setDate(year, month + 1, 1);
            return this;
        }

        setDate(year, month, day + 1);
        return this;
    }

    public MyDate nextMonth() {
        if (12 == month && 9999 == year) {
            return this;
        }

        int maxDay = (12 == month)
                ? getMonthLastDay(year + 1, 1)
                : getMonthLastDay(year, month + 1);

        if (day == getMonthLastDay(year, month)) {
            maxDay = maxDay;
        } else if (day > maxDay) {
            maxDay = maxDay;
        } else if (day < maxDay) {
            maxDay = day;
        }

        if (12 == month) {
            setDate(year + 1, 1, maxDay);
            return this;
        }

        setDate(year, month + 1, maxDay);
        return this;
    }

    public MyDate nextYear() {
        if (9999 == year) {
            return this;
        }

        int maxDay = getMonthLastDay(year + 1, month);

        if (day == getMonthLastDay(year, month)) {
            maxDay = maxDay;
        } else if (day > maxDay) {
            maxDay = maxDay;
        } else if (day < maxDay) {
            maxDay = day;
        }

        setDate(year + 1, month, maxDay);
        return this;
    }

    public MyDate previousDay() {
        if (1 == day && 1 == month && 1 == year) {
            return this;
        }

        if (1 == day && 1 == month) {
            setDate(year - 1, 12, getMonthLastDay(year - 1, 12));
            return this;
        }

        if (1 == day) {
            setDate(year, month - 1, getMonthLastDay(year, month - 1));
            return this;
        }

        setDate(year, month, --day);
        return this;
    }

    public MyDate previousMonth() {
        if (1 == month && 1 == year) {
            return this;
        }

        int maxDay = (1 == month)
                ? getMonthLastDay(year - 1, 12)
                : getMonthLastDay(year, month - 1);

        if (day == getMonthLastDay(year, month)) {
            maxDay = maxDay;
        } else if (day > maxDay) {
            maxDay = maxDay;
        } else if (day < maxDay) {
            maxDay = day;
        }

        if (1 == month) {
            setDate(year - 1, 12, maxDay);
            return this;
        }

        setDate(year, month - 1, maxDay);
        return this;
    }

    public MyDate previousYear() {
        if (1 == year) {
            return this;
        }

        int maxDay = getMonthLastDay(year - 1, month);

        if (day == getMonthLastDay(year, month)) {
            maxDay = maxDay;
        } else if (day > maxDay) {
            maxDay = maxDay;
        } else if (day < maxDay) {
            maxDay = day;
        }

        setDate(year - 1, month, maxDay);
        return this;
    }
}