public class DateUtil {

    public static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static int[] dayInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {

        System.out.println(printDate(1500, 1, 5));
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year >= 1 && year <= 9999) {
            if (month >= 1 && month <= 12) {
                if (month == 2 && isLeapYear(year) == true && day == 29) {
                    return true;
                } else if (day <= dayInMonths[month - 1] && day >= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            return -1;
        }
        int countLeapYear = 0;
        for (int i = 1; i < year; i++) {
            if (isLeapYear(i)) {
                countLeapYear++;
            }
        }

        int countDay = day + countLeapYear + (year - 1) * 365;

        for (int idxMonth = month - 1; idxMonth > 0; idxMonth--) {
            if (idxMonth == 2 && isLeapYear(year) == true) {
                countDay += 29;
            } else {
                countDay += dayInMonths[idxMonth - 1];
            }
        }

        return (countDay) % 7;

    }

    public static String printDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            return "InValid";
        }
        String result = "";
        switch (getDayOfWeek(year, month, day)) {
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
        result = result + " " + day + " " + strMonths[month - 1] + " " + year;

        return result;
    }

}
