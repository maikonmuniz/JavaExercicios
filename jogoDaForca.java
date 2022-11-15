import java.util.Scanner;
import java.util.ArrayList;
import java.util.Vector;

public class JogoDaForca {
    public static void main(String[] args){

        Scanner letters = new Scanner(System.in);

        ArrayList<String> errLetter = new ArrayList<>();

        System.out.println("Digite a palavra");
        String forca              = letters.nextLine();

        String[] forcaArrayLetter = forca.split("");
        // String[] errLetter        = new String[6];
        String letterHiden        = listHideLetter(forca.length());
        String[] vetorLetterHiden = letterHiden.split(" ");
        Boolean game              = true;
        int err                   = 0;

        do {

            System.out.println("Digite uma Letra:");
            String c = letters.nextLine().substring(0);

            if(checkLetter(c, forca)){
                vetorLetterHiden = countLetterInVetor(c, forcaArrayLetter, vetorLetterHiden);
            }
            else {
                errLetter.add(c);
                err       += 1;
            }
            

            System.out.println("-----------------------------------------------------");

                mistake(err);

            System.out.println("-----------------------------------------------------");

            System.out.println("Letras errados:  "+String.join(" ", errLetter));

            System.out.println("-----------------------------------------------------");
        
            System.out.println("Letras certas: "+String.join(" ", vetorLetterHiden));

            System.out.println("-----------------------------------------------------");

            game = completeLetters(vetorLetterHiden);

            if(err == 6){
                System.out.println("-----------------------------------------------------");
                System.out.println("-----------------------------------------------------");
                System.out.println("-----------------------------------------------------");
                System.out.println("------------------[Game Over!]-----------------------");
                System.out.println("-----------------------------------------------------");
                System.out.println("-----------------------------------------------------");
                System.out.println("-----------------------------------------------------");
                game = false;
            }

        } while(game);
    }

    public static Boolean completeLetters(String[] vetorLetterHiden){

        String LetterExistHiden = String.join(" ", vetorLetterHiden);

        if(LetterExistHiden.contains("_")){
            return true;
        }

        return false;
    }

    public static void mistake(int err){

        String[] errVetor = {" O\n", "/", "I", "\\ \n", "/ ", "\\"};

        if (err == 1){
            System.out.println(errVetor[0]);
        }
        else if (err == 2){
            System.out.println(errVetor[0]+errVetor[1]);
        }
        else if (err == 3){
            System.out.println(errVetor[0]+errVetor[1]+errVetor[2]);
        }
        else if (err == 4){
            System.out.println(errVetor[0]+errVetor[1]+errVetor[2]+errVetor[3]);
        }
        else if (err == 5){
            System.out.println(errVetor[0]+errVetor[1]+errVetor[2]+errVetor[3]+errVetor[4]);
        }
        else if (err == 6){
            System.out.println(errVetor[0]+errVetor[1]+errVetor[2]+errVetor[3]+errVetor[4]+errVetor[5]);
        }
    }

    public static String listHideLetter(int qtdChar){

        ArrayList<String> ArrayHide = new ArrayList<>();

        for(int i = 1; i <= qtdChar; i++){
            ArrayHide.add("_");
        }

        return String.join(" ", ArrayHide);
    }

    public static Boolean checkLetter(String letter, String word){

        if(word.contains(letter)){
            return true;
        }

        return false;
    }

    public static String[] countLetterInVetor(String letter, String[] word, String[] letterHiden){

        int count = 0;

        for(String i: word){
            
            if(i.equals(letter)){

                letterHiden[count] = letter;

            }
            count += 1;
        }

        return letterHiden;
    }
}
