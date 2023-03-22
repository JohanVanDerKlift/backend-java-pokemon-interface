import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    private final List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leafBlade");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "grass");
    }

    List<String> getAttacks() {
        return attacks;
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leafStorm");
        switch (enemy.getType()) {
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 15);
                System.out.println(enemy.getName() + " loses 15 HP");
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 25);
                System.out.println(enemy.getName() + " loses 25 HP");
            }
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 5);
                System.out.println(enemy.getName() + " loses 5 HP");
            }
            default -> {
                enemy.setHp(enemy.getHp() - 35);
                System.out.println(enemy.getName() + " loses 35 HP");
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
    }

    public void solarBeam(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with solarBeam");
        switch (enemy.getType()) {
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 10);
                System.out.println(enemy.getName() + " loses 10 HP");
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 15);
                System.out.println(enemy.getName() + " loses 15 HP");
            }
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 5);
                System.out.println(enemy.getName() + " loses 5 HP");
            }
            default -> {
                enemy.setHp(enemy.getHp() - 20);
                System.out.println(enemy.getName() + " loses 20 HP");
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leechSeed");
        switch (enemy.getType()) {
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 14);
                name.setHp(name.getHp() + 14);
                System.out.println(enemy.getName() + " loses 14 HP and " + name.getName() + " gains 14 HP");
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 21);
                name.setHp(name.getHp() + 21);
                System.out.println(enemy.getName() + " loses 21 HP and " + name.getName() + " gains 21 HP");
            }
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 7);
                name.setHp(name.getHp() + 7);
                System.out.println(enemy.getName() + " loses 7 HP and " + name.getName() + " gains 7 HP");
            }
            default -> {
                enemy.setHp(enemy.getHp() - 28);
                name.setHp(name.getHp() + 28);
                System.out.println(enemy.getName() + " loses 28 HP and " + name.getName() + " gains 28 HP");
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leaveBlade");
        switch (enemy.getType()) {
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 30);
                System.out.println(enemy.getName() + " loses 30 HP");
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 40);
                System.out.println(enemy.getName() + " loses 40 HP");
            }
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 20);
                System.out.println(enemy.getName() + " loses 20 HP");
            }
            default -> {
                enemy.setHp(enemy.getHp() - 50);
                System.out.println(enemy.getName() + " loses 50 HP");
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
    }


}
