public class HumanReadableTime {
    public static String time(int inputSeconds) {
        int hours = inputSeconds / 3600;
        int minutes = (inputSeconds % 3600) / 60;
        int seconds = (inputSeconds % 3600) % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        System.out.println(time(0));        // 00:00:00
        System.out.println(time(5));        // 00:00:05
        System.out.println(time(60));       // 00:01:00
        System.out.println(time(86399));    // 23:59:59
        System.out.println(time(359999));   // 99:59:59
    }
}
