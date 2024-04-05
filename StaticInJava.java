class Game {
  String name;
  int players;
  static int score;

  // Non-static method
  void print() {
    System.out.println(name + " : " + players + " : " + score);
  }

  // static method
  public static void print1(Game o) {
    // we cannot access non-static variables inside of static method ❌
    // System.out.println(name + " : " + players + " : " + score);
    // we can access only static variabels inside of static method ✅
    System.out.println(score);

    // we can indirectly access the non static variables inside the static print1
    // method
    System.out.println(o.name + " : " + o.players + " : " + score);
  }

}

public class StaticInJava {
  public static void main(String[] args) {
    // Creating Objects of class Game for various sports
    Game football = new Game();
    football.name = "football";
    football.players = 11;
    // Game.score = 3;

    Game basketBall = new Game();
    basketBall.name = "basketBall";
    basketBall.players = 7;
    Game.score = 25;

    football.print();
    basketBall.print();

    // Calling the non-static method using class name ❌
    // Game.print();
    // Calling the static method using class name ✅
    // Game.print1();

    // we can indirectly use the non-static varibales of Game class buy providing
    // the correct reference object the the static method
    Game.print1(basketBall);
  }
}
