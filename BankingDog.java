package Hello;

public class BankingDog {
    public static void main(String[] args)
    {
        boolean responce=shouldWakeUp(false,4);
        System.out.println(responce);
    }
    public static boolean shouldWakeUp(boolean banking,int houreOfDay) {
        if (houreOfDay >= 1 && houreOfDay <= 23) {
            if ((banking == true) && (houreOfDay < 8 || houreOfDay > 22)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

