import java.util.Scanner;
//Very similar to CommonSubsequence algorithm

public class CommonSubstring {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter sequence 1: ");
        String text1 = scanner.nextLine();

        System.out.println("Enter sequence 2:");
        String text2 = scanner.nextLine();

        int subSeqLen = 0;
        String subStringText = "";

        for(int i = 0; i < text1.length(); i++){
            for(int j = 0; j < text2.length(); j++){
                if(text1.charAt(i) == text2.charAt(j)){
                    subSeqLen++;
                    subStringText = " "+ text1.charAt(i);
                } else if (subStringText == " ") {
                    subStringText = "";
                }
            }
        }

        System.out.println("The longest Common subsequence length is " + subSeqLen);
        System.out.println("The string sequence is " + subStringText);


    }
}
