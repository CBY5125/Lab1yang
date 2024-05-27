public class Main {
    public static <Player> void main(String[] args) {
        Player player = new Player("kate",50,5, 32456);
        Ship ship = new Ship("Sigma-x","small");
        Obstacles obstacles = new Obstacles(-5, "Aliens");
        PowerUps powerUps = new PowerUps(10,"Lazer");
        Enemies enemies = new Enemies("Aliens",7);

        Game game = new Game(player, ship, obstacles, powerUps, enemies);

    }
}

