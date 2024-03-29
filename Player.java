public class Player implements Comparable<Player> {
    public String name;
    public int speed;

    Player(String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int compareTo(Player otherPlayer){
        return (this.getSpeed() - otherPlayer.getSpeed());
    }
}
