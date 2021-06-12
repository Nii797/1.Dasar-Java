package Training1;

class Karakter extends Game {
    private int health;

    public int getHealth() {
        return this.health;
    }

    public int setHealthy(int health) {
        return this.health = health;
    }

    public void statusHealth(int healthy) {
        if (healthy >= 101) {
            System.out.println("Healthy terlalu penuh");
        } else if (healthy == 100) {
            System.out.println("Darah penuh");
        } else if (healthy >= 50) {
            System.out.println("Healthy medium");
        } else if (healthy >= 6) {
            System.out.println("Status kritis");
        } else if (healthy <= 0) {
            System.out.println("GAME OVER.");
        }
    }
}
