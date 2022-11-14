public class exercicio{
    public static void main(String[] args){

        int[] numVetor = new int[20];

        System.out.println(numVetor[0]);
        int num1 = 0;

        for(int i = 0;i < 19;i++){
            numVetor[i] = num1;
            num1 += 1;
            System.out.println(numVetor[i]);
        }
    }
}
