import java.util.Scanner;

public class NotFibbonacci {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); //T(1), S(1)
        System.out.println("Enter the number of terms in the sequence: ");

        int numOfTerms = userInput.nextInt(); //T(1), S(1)
        long [] notFibbSeq = new long[numOfTerms]; //sets the size of array to numOfTerms; T(1), S(1)
        notFibbSeq[0] = 0; //s(1)
        notFibbSeq[1] = 1; //s(1)

        System.out.println("Not Fibbonacci Sequence with " + numOfTerms + " sequence size: ");

        //n is equal to numOfTerms set by the user input with i being set to index 2 since both 0 and 1 are declared
        for(int i = 2; i < numOfTerms; i++){ //o(n)
            notFibbSeq[i] =  (notFibbSeq[i-1] * 3) + (notFibbSeq[i-2] * 2);
        }

        //For loop to print out sequence, bc a nested for loop would print out each notFibbSeq numOfTerms times
        for(int i = 0; i < numOfTerms; i++){
            System.out.println(notFibbSeq[i]);
        }
    }
}

//alternate cases: negative input (-1), 0 input, no input at all


//time complexity:
//space complexity:
