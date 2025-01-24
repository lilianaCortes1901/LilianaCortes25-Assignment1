import java.util.Scanner;

public class WhereInSequence {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer to search for: ");
        int targetNum = scanner.nextInt();

        long [] notFibbSeq = {0, 1};
        for (int i = 2; i < notFibbSeq.length; i++){
            notFibbSeq[i] =  (notFibbSeq[i-1] * 3) + (notFibbSeq[i-2] * 2);
            if (targetNum == notFibbSeq[i]){
                System.out.println(notFibbSeq[i]);
            } else if(targetNum != notFibbSeq[i] && notFibbSeq[i] < targetNum){
                System.out.println(notFibbSeq[i]);
            }
        }

    }
}
