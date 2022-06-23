public class DecimalComparator {
    // The Method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.

    public static boolean areEqualByThreeDecimalPlaces(double x, double y) {

        x = (int) (x * 1000);
        y = (int) (y * 1000);

        if (x == y) {
            return true;
        }else {
            return false;
        }
    }
}
