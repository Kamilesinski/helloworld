import java.util.Scanner;

public class run {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thuss 0 - english, 1 - spanish or 2 - ruski" );

        int word = scanner.nextInt();
        switch(word){
            case 0:
                System.out.println("hello world");
                break;
            case 1:
                System.out.println("hola mundo");
                break;
            case 2:
                System.out.println("привет население!");
                break;
        }
        if (word > 2 || word<0){
            System.out.println("auć, nie znam tej komendy!");
        }
    }




}
