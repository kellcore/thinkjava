public class Date {

    public static void main(String[] args) {
        String day = "Thursday";
        int date = 9;
        String month = "June";
        int year = 2022;

        String american = "American format: " + day + ", " + month + " " + date + ", " + year;
        String european = "European format: " + day + " " + date + " " + month + " " + year;

        System.out.println(american);
        System.out.println(european);
    }
}