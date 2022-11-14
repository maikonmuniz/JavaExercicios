import java.util.Scanner;
import java.util.ArrayList;

public class jogoDaForca {
    public static void main(String[] args){

        Scanner letters = new Scanner(System.in);

        System.out.println("Digite a palavra");


        String forca = letters.nextLine();
        String[] forcaArrayLetter = forca.split("");


        String letterHiden = listHideLetter(forca.length());

        Boolean game = true;
        int count    = 0;

        do{

            System.out.println("Digite uma Letra:");
            char c = letters.next().charAt(0);

            count += 1;
            System.out.println(c);

            if(count == 6){
                game = false;
            }

        } while(game);
    }

    public static String listHideLetter(int qtdChar){

        ArrayList<String> ArrayHide = new ArrayList<>();

        for(int i = 1; i <= qtdChar; i++){
            ArrayHide.add("_");
        }

        return String.join(" ", ArrayHide);
    }

    // public static String checkLetter(String letter, String[] word){
        
    // }
}
