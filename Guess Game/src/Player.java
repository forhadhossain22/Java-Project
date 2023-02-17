public class Player {
    //where the guess goes
    int number = 0;

    public void guess()
    {
        number = (int) (Math.random() * 10);
        System.out.println("i'm guessing "+number);
    }
}
