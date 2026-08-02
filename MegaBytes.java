import java.util.*;
public class MegaBytes {
    public static void printMegaBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid value");
        }
        else {
            int megaBytes=(kiloBytes/1024);
            int kiloRemainder=kiloBytes%1024;
            System.out.println(kiloBytes+"KB  "+megaBytes+"MB  " +kiloRemainder+"KB");
        }
        }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int kiloBytes=sc.nextInt();
        printMegaBytes(kiloBytes);

    }
}

