public class Game {
    public static String player1,player2;
    public String whoWin(String player1,String player2){

        if(player1.equals(player2))
            return "Draw!";
        else if(player1.equals("paper"))
            if(player2.equals("rock"))
                return "Player 1 win!";
            else
                return "Player 2 win!";
        else if(player1.equals("rock"))
            if(player2.equals("scissors"))
                return "Player 1 win!";
            else
                return "Player 2 win!";
        else if(player1.equals("scissors"))
            if(player2.equals("paper"))
                return "Player 1 win!";
            else
                return "Player 2 win!";
        return "";
    }

    public void check(String str){
        if(str.equals("paper"))
            return;
        else if (str.equals("rock"))
            return;
        else if (str.equals("scissors"))
            return;
        else {
            throw new IllegalArgumentException("Bad Choice!");
        }

    }
    public void getPlayer1(String choice){
        player1 = choice;
        check(player1);
    }
    public void getPlayer2(String choice){
        player2 = choice;
        check(player2);
        System.out.print(whoWin(player1,player2));

    }

}
