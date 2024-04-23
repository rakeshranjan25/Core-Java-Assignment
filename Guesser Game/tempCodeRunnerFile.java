import java.util.*;

class guesser{
    int guessNum;

    int guessingNum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser : Please guesse the number");
        guessNum = scan.nextInt();
        return guessNum;
    }
}

class player1{
    int guessNum;

    int guessingNum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Player 1 : Please guesse the number");
        guessNum = scan.nextInt();
        return guessNum;
    }
}

class player2{
    int guessNum;

    int guessingNum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Player 2 : Please guesse the number");
        guessNum = scan.nextInt();
        return guessNum;
    }
}

class player3{
    int guessNum;

    int guessingNum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Player 3 : Please guesse the number");
        guessNum = scan.nextInt();
        return guessNum;
    }
}

class umpire{

    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser(){
        guesser g = new guesser();
        numFromGuesser = g.guessingNum();
    }

    void collectNumFromPlayer1(){
        player1 p1 = new player1();
        numFromPlayer1 = p1.guessingNum();
    }

    void collectNumFromPlayer2(){
        player2 p2 = new player2();
        numFromPlayer2 = p2.guessingNum();
    }

    void collectNumFromPlayer3(){
        player3 p3 = new player3();
        numFromPlayer3 = p3.guessingNum();
    }

    //compare 

    void compare(){

        if(numFromGuesser == numFromPlayer1){

            if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                System.out.println("All are winners");
            }
            else if ( numFromGuesser == numFromPlayer2){
                System.out.println("Player 1 and Player 2 are winners");
            }
            else if ( numFromGuesser == numFromPlayer3){
                System.out.println("Player 1 and Player 3 are winners");
            }
            else{
                System.out.println("Player 1 won the game");
            }
        }

        else if(numFromGuesser == numFromPlayer2){
            if (numFromGuesser == numFromPlayer3){
                System.out.println("Player 2 and Player 3 are winners");
            }
            else{
                System.out.println("Player 2 won the game");
            }
        }

        else if(numFromGuesser == numFromPlayer3){
            System.out.println("Player 3 won the game");
        }

        else{
            System.out.println("Game Lost ! all player answers are wrong");
        }
    }
    
}

public class Game {
    
    public static void main(String[] args) {

        System.out.println("Game Started");

        umpire u = new umpire();

        u.collectNumFromGuesser();
        u.collectNumFromPlayer1();
        u.collectNumFromPlayer2();
        u.collectNumFromPlayer3();

        u.compare();
    }
}
