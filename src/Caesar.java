import java.util.Scanner;

public class Caesar {
    public static String msg;
    public static int key;
    public static int choice;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your text for Encrypting or Decrypting: ");
        msg = (sc.nextLine()).toUpperCase();
        System.out.println("Inout 0 for encryption , 1 for decrypting the text");
        choice = sc.nextInt();
        System.out.println("Please input the shift amount : ");
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
