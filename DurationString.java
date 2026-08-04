public class DurationString {
    public static void main(String[] args) {
        System.out.println(getDurationString(65, 55));
        System.out.println(getDurationString(3055));
    }
    public static String getDurationString ( long min, long sec)
        {
            if ((min < 0) || (sec < 0 || sec > 59)) {
                return "Invalid Value";
            }
            long hr = min / 60;
            long remaningMin = min % 60;
            return hr + "h  " + remaningMin + "m  " + sec + "s";}
    public static String getDurationString ( long sec)
        {
            if (sec < 0) {
                return "Invalid Value";
            }
            long min = sec / 60;
            long remaningSec = sec % 60;
            return getDurationString(min, remaningSec);
        }
}
