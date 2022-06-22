package calculate;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if( kiloBytes <= 0){
            System.out.println("Invalid Input");
        } else {


            int y = kiloBytes / 1024;
            int z = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + y + "MB" + " and " + z + " KB");
        }
    }
}
