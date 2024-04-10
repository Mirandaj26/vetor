public class Main {
    public static void main(String[] args) {
        
        int[] vetor = new int[10];

        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1; 
        }

        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição " + (i + 1) + ": " + vetor[i]);
        }
    }
}