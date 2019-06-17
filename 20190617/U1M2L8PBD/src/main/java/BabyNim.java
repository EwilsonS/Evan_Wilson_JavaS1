import java.util.Scanner;

public class BabyNim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("~Baby Nim~");
        String userChoice;

        int pileA = 3;
        int pileB = 3;
        int pileC = 3;
        System.out.println(" A : " + pileA + "   B : " + pileB + "   C : " + pileC);
        do {
            System.out.println();
            System.out.printf("Choose a Pile: ");
            userChoice = scan.nextLine().toUpperCase();

            System.out.printf("How many to remove from pile " + userChoice + "? ");

            int userGrab = Integer.parseInt(scan.nextLine());

            if (userChoice.equals("A")) {
                pileA -= userGrab;
            } else if (userChoice.equals("B")) {
                pileB -= userGrab;
            } else if (userChoice.equals("C")) {
                pileC -= userGrab;
            }

            if (pileA < 0) {
                pileA = 0;
            }
            if (pileB < 0) {
                pileB = 0;
            }
            if (pileC < 0) {
                pileC = 0;
            }
            System.out.println(" A : " + pileA + "   B : " + pileB + "   C : " + pileC);
            continue;
        } while (!(pileA == 0 && pileB == 0 && pileC == 0));
        System.out.println("\nAll piles empty DONE");
    }


}
