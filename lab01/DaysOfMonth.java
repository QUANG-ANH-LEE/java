import java.util.Scanner;

public class DaysOfMonth {

    // Hàm kiểm tra năm nhuận
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Hàm chuyển tháng từ String sang số
    public static int parseMonth(String input) {
        input = input.trim().toLowerCase();

        switch (input) {
            case "1":
            case "january":
            case "jan":
            case "jan.":
                return 1;
            case "2":
            case "february":
            case "feb":
            case "feb.":
                return 2;
            case "3":
            case "march":
            case "mar":
            case "mar.":
                return 3;
            case "4":
            case "april":
            case "apr":
            case "apr.":
                return 4;
            case "5":
            case "may":
                return 5;
            case "6":
            case "june":
            case "jun":
            case "jun.":
                return 6;
            case "7":
            case "july":
            case "jul":
            case "jul.":
                return 7;
            case "8":
            case "august":
            case "aug":
            case "aug.":
                return 8;
            case "9":
            case "september":
            case "sep":
            case "sep.":
                return 9;
            case "10":
            case "october":
            case "oct":
            case "oct.":
                return 10;
            case "11":
            case "november":
            case "nov":
            case "nov.":
                return 11;
            case "12":
            case "december":
            case "dec":
            case "dec.":
                return 12;
            default:
                return -1; // tháng không hợp lệ
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month;
        int year;

        while (true) {
            System.out.print("Enter month: ");
            String monthInput = scanner.nextLine();
            month = parseMonth(monthInput);

            System.out.print("Enter year: ");
            String yearInput = scanner.nextLine();

            // Kiểm tra năm hợp lệ (chỉ gồm chữ số)
            if (!yearInput.matches("\\d+")) {
                System.out.println("Invalid year. Please enter again.\n");
                continue;
            }

            year = Integer.parseInt(yearInput);

            if (month == -1) {
                System.out.println("Invalid month. Please enter again.\n");
                continue;
            }

            break; // hợp lệ thì thoát vòng lặp
        }

        int days;
        switch (month) {
            case 2:
                days = isLeapYear(year) ? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 31;
        }

        System.out.println("Number of days: " + days);
        scanner.close();
    }
}
