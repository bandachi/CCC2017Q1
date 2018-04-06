import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int answer = 0;
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine();
        String swifts = input.nextLine();
        String sephamores = input.nextLine();
        String swiftsAry[] = swifts.split(" ");
        String sephamoresAry[] = sephamores.split(" ");
        int swiftsTotal = 0;
        int sephamoresTotal = 0;
        for (int i = 0;i<N;i++){
            swiftsTotal += Integer.parseInt(swiftsAry[i]);
            sephamoresTotal += Integer.parseInt(sephamoresAry[i]);
            if (sephamoresTotal == swiftsTotal){

                answer = i+1;
            }
        }
        System.out.println(answer);
    }
    
}