public class Game {
    private Player player;
    private Ship ship;
    private Obstacles obstacles;
    private PowerUps powerUps;
    private Enemies enemies;

    public Game(Player player, Ship ship, Obstacles obstacles, PowerUps powerUps, Enemies enemies) {
        this.player = player;
        this.ship = ship;
        this.obstacles = obstacles;
        this.powerUps = powerUps;
        this.enemies = enemies;
    }

    public Player getPlayer() {
        return player;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }

    public Ship getShip() {
        return ship;
    }
    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public Obstacles getObstacles() {
        return obstacles;
    }
    public void setObstacles(Obstacles obstacles) {
        this.obstacles = obstacles;
    }

    public PowerUps getPowerUps() {
        return powerUps;
    }
    public void setPowerUps(PowerUps powerUps) {
        this.powerUps = powerUps;
    }

    public Enemies getEnemies() {
        return enemies;
    }
    public void setEnemies(Enemies enemies) {
        this.enemies = enemies;
    }
}
