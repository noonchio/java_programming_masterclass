package barking;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (hourOfDay < 0){
            return false;
        } else if (hourOfDay > 23){
            return false;
        } else if
        ((hourOfDay > 22 || hourOfDay < 8 && barking)) {
            return true;
        } else if (hourOfDay < 22 || barking) {
            return false;
        } else {
            return false;
        }

    }
}
