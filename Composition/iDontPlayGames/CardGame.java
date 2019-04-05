public class CardGame {
  public String name_of_game;
  public int number_players;
  public boolean is_fun;

  public void gameInfo() {
    System.out.println(
        "Game Name= " + name_of_game + " Number of Players= " + number_players + " Is this game is fun? " + is_fun);
  }

  public void setCardGameName(String name_of_game) {
    this.name_of_game = name_of_game;
  }

  public void setNumberOfPlayers(int number_players) {
    this.number_players = number_players;
  }

  public void setIsFun(boolean is_fun) {
    this.is_fun = is_fun;
  }

  public String getCardGameName(String name_of_game) {
    return name_of_game;
  }

  public int getNumberOfPlayers(int number_players) {
    return number_players;
  }

  public boolean getIsFun(boolean is_fun) {
    return is_fun;
  }
}
