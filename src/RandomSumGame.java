public class RandomSumGame {

    boolean start;
    int d1, d2;
    int sum;
    int valuePoint;
    String status;

    public void play(int d1, int d2) {

    }

    public RandomSumGame() {
        status = "";
        valuePoint = 0;
    }

    public boolean play() {
        System.out.println("\nStarting game");
        rollDice();
        return won();

    }


    private boolean won() {

        switch (sum) {
            case 2:
            case 3:
            case 12:
                System.out.println("You rolled " + d1 + " + " + d2 + " = " + sum + "; You lose");
                return false;
            case 7:
            case 11:
                System.out.println("You rolled " + d1 + " + " + d2 + " = " + sum + "; You win");
                return true;
            default:
                if (valuePoint == 0) {
                    valuePoint = sum;

                    System.out.println("You rolled " + d1 + " + " + d2 + " = " + sum + "; You established a value point " + valuePoint + ";");
                    do {
                        rollDice();
                        if (sum == valuePoint) {
                            System.out.println("- Roll again " + d1 + " + " + d2 + " = " + sum + "; you win");
                            return true;
                        }
                        if (sum == 7) {
                            System.out.println("- Roll again " + d1 + " + " + d2 + " = " + sum + "; you lose");
                            return false;
                        }

                        System.out.println("- Roll again " +  d1 + " + " + d2 + " = " + sum + "; roll");

                    } while (true);
                }

                return (sum == valuePoint);
            }
    }


    public void rollDice() {
        d1 = (int) (Math.random() * 6) + 1;
        d2 = (int) (Math.random() * 6) + 1;
        sum = d1 + d2;
    }

}
