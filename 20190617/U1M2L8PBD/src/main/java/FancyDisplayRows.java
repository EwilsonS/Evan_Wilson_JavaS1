import java.util.Scanner;

public class FancyDisplayRows {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("~Nim Fancy Display Rows~\n");

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

        do {
            //Turn pile ints into asterisks
            StringBuilder starA = new StringBuilder();
            StringBuilder starB = new StringBuilder();
            StringBuilder starC = new StringBuilder();

            for (int i = 0; i < pileA; ++i) {
                starA.append("*");
            }
            for (int i = 0; i < pileB; ++i) {
                starB.append("*");
            }
            for (int i = 0; i < pileC; ++i) {
                starC.append("*");
            }

            System.out.println("A : " + starA + "\nB : " + starB + "\nC : " + starC);

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
                playerOneTurn = true;
            }

            // exit game with 1 counter left
            if ((pileA == 0 && pileB == 0 && pileC == 1) || (pileA == 0 && pileB == 1 && pileC == 0) || (pileA == 1 && pileB == 0 && pileC == 0)) {
                break;
            }
            continue;
        } while (!(pileA == 0 && pileB == 0 && pileC == 0));

        // display winner
        String winner = player1;
        String loser = player2;

        if (playerOneTurn) {
            winner = player2;
            loser = player1;
        }
        System.out.println("\n"+loser+" is forced to take the last counter  \n" + winner + " wins!!!");

    }
}