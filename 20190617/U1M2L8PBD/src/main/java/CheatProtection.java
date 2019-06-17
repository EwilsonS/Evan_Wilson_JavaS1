import java.util.Scanner;

public class CheatProtection {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("~Nim Cheat Protection~\n");

        System.out.printf("Player ONE name: ");
        String player1 = scan.nextLine().toUpperCase();

        System.out.printf("Player TWO name: ");
        String player2 = scan.nextLine().toUpperCase();

        String playerOneChoice;
        String playerTwoChoice;

        boolean playerOneTurn = true;

        int pileA = 5;
        int pileB = 5;
        int pileC = 5;

        System.out.println("A : " + pileA + "\nB : " + pileB + "\nC : " + pileC);

        do {
            if (playerOneTurn) {

                System.out.println();
                System.out.printf(player1 + " ,choose a Pile: ");
                playerOneChoice = scan.nextLine().toUpperCase();

                System.out.printf("How many to remove from pile " + playerOneChoice + "? ");

                int userGrab = Integer.parseInt(scan.nextLine());

                // prevent zero or negative input
                if (userGrab == 0) {
                    System.out.println("You must select at least 1.");
                    continue;
                } else if (userGrab < 0) {
                    System.out.println("Uh Oh, no negative numbers!");
                    continue;
                }

                // match player choice to pile and check for non zero entry
                if (playerOneChoice.equals("A") && pileA != 0 && userGrab <= pileA) {
                    pileA -= userGrab;
                } else if (playerOneChoice.equals("B") && pileB != 0 && userGrab <= pileB) {
                    pileB -= userGrab;
                } else if (playerOneChoice.equals("C") && pileC != 0 && userGrab <= pileC) {
                    pileC -= userGrab;
                } else {
                    System.out.println("That is against the rules!!");
                    continue;
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
                System.out.println("A : " + pileA + "\nB : " + pileB + "\nC : " + pileC);
                playerOneTurn = false;
            } else {
                System.out.println();
                System.out.printf(player2 + " ,choose a Pile: ");
                playerTwoChoice = scan.nextLine().toUpperCase();

                System.out.printf("How many to remove from pile " + playerTwoChoice + "? ");

                int userGrab = Integer.parseInt(scan.nextLine());

                // prevent zero or negative input
                if (userGrab == 0) {
                    System.out.println("You must select at least 1.");
                    continue;
                } else if (userGrab < 0) {
                    System.out.println("Uh Oh, no negative numbers!");
                    continue;
                }

                // match player choice to pile and check for non zero entry
                if (playerTwoChoice.equals("A") && pileA != 0 && userGrab <= pileA) {
                    pileA -= userGrab;
                } else if (playerTwoChoice.equals("B") && pileB != 0 && userGrab <= pileB) {
                    pileB -= userGrab;
                } else if (playerTwoChoice.equals("C") && pileC != 0 && userGrab <= pileC) {
                    pileC -= userGrab;
                } else {
                    System.out.println("That is against the rules!!");
                    continue;
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
                System.out.println("A : " + pileA + "\nB : " + pileB + "\nC : " + pileC);
                playerOneTurn = true;
            }


            continue;
        } while (!(pileA == 0 && pileB == 0 && pileC == 0));

        // display winner
        String winner = player2;

        if (playerOneTurn) {
            winner = player1;
        }
        System.out.println("\n" + winner + " wins!!!");

    }

}
