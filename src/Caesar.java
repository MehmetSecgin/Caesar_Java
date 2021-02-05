import java.util.Scanner;

public class Caesar {
    public static String msg;
    public static int key;
    public static int choice;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aga gir mesaj: ");
        msg = (sc.nextLine()).toUpperCase();
        System.out.println("Aga encrypt icin 0, descrpyt icin 1'e bas");
        choice = sc.nextInt();
        System.out.println("Aga soyle ne kadar kaydırmak: ");
        key = sc.nextInt();

        circle();
    }
    public static void circle()
    {
        if(choice ==0){
            for (int a = 0; a< msg.length(); a++){

            char result = msg.charAt(a);
                int sonuc = result;
            if((int)result == 32)
                System.out.print(" ");
            else if ((int)result +key >90)
            {
                sonuc = 65 + ((int)result + key - 65)%26;
                System.out.print((char)sonuc);
            }else{
                System.out.print((char)(sonuc+key));
            }
        }
        }else{
            key = 26 - key;
            for (int a = 0; a< msg.length(); a++) {

                char result = msg.charAt(a);
                int sonuc = result;
                if ((int) result == 32)
                    System.out.print(" ");
                else if ((int) result + key > 90) {
                    sonuc = 65 + ((int) result + key - 65) % 26;
                    System.out.print((char) sonuc);
                } else {
                    System.out.print((char) (sonuc + key));
                }
            }

        }
    }

}