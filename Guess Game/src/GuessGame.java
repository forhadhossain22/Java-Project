public class GuessGame
{
    /*
        * GuessGame has three instance variable for the player objects
    */
    Player p1;
    Player p2;
    Player p3;
    /*
        * Create three Player objects and assign them to the three Player instance variable
     */
    public void startGame()
    {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
    /*
        * declare three variable to hold the three guesses the players make
    */
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;
    /*
        * declare three variable to hold a ture or false based on the player's answer
    */
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
    /*
        * make a target number that the player have to guess
    */
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while(true)
        {
            System.out.println("Number to guess is "+targetNumber);

            //call each player's guess() method
            p1.guess();
            p2.guess();
            p3.guess();

            //get each player's guess (the result of their guess() method running) bt accessing the number variable of each player
            guessp1 = p1.number;
            System.out.println("Player one Guessed "+guessp1);
            guessp2 = p2.number;
            System.out.println("Player two Guessed "+guessp2);
            guessp3 = p3.number;
            System.out.println("Player three Guessed "+guessp3);

            System.out.println();

            //check each player's guess to see if it matches the target number. if a player is right, then set that player's variable to be true (remember, we set it false default)
            if(guessp1 == targetNumber)
            {
                p1isRight = true;
            }
            if(guessp2 == targetNumber)
            {
                p2isRight = true;
            }
            if (guessp3 == targetNumber)
            {
                p3isRight = true;
            }

            //if player one OR two OR player three is right...
            if (p1isRight || p2isRight || p3isRight)
            {
                System.out.println("We have a Winner!!!");
                System.out.println("Player one got it right? "+p1isRight);
                System.out.println("Player two got it right? "+p2isRight);
                System.out.println("Player three got it right? "+p3isRight);
                System.out.println("Game is over.");
                break;
            }

            //otherwise, stay in the loop and ask the players for another guess.
            else
            {
                System.out.println("Player will have to try again.");
            }
        }
    }
}
