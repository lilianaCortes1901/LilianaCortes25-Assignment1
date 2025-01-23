import java.util.Scanner;

public class CommonSubsequence {
    public static void main(String[] args) {
        System.out.println("Enter sequence 1: ");
        Scanner userInput1 = new Scanner(System.in); //T(1), S(1)
        System.out.println("Enter sequence 2: ");
        Scanner userInput2 = new Scanner(System.in);

        String [] text1 = [userInput1];
        String [] text2 = new String[userInput2];
        int subSeqLen = 0;

        for (int i = 0; i < text1.length; i++) {
            for (int j = 0; j < text2.length; j++){
                if (text1[i] == text2[j]){
                    subSeqLen++;
                }
            }
        }

        System.out.println("The longest common subsequence length is " + subSeqLen);

    }
}