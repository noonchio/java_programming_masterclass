public class TeenNumber {
    // Write a method named hasTeen with 3 parameters of type int. The method should return boolean adn it needs to return true if one of the parameters is in range 13-19. Otherwise return false.

    public static boolean hasTeen(int a, int b, int c){
    if (a > 12 && a < 20 || b > 12 && b < 20 || c > 12 && c < 20  ){
        return true;
    }
        return false;
    }

    public static boolean isTeen(int x){
        if (x > 12 && x < 20) {
            return true;
        }else{
            return false;
        }
    }

}
