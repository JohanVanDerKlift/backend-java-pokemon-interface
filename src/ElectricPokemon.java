import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private final List<String> attacks = Arrays.asList("voltTackle", "thunder", "electroBall", "thunderPunch");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "electric");
    }

    List<String> getAttacks() {
        return attacks;
    }

    void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with voltTackle");
        switch (enemy.getType()) {
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 15);
                System.out.println(enemy.getName() + " loses 15 HP");
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 35);
                System.out.println(enemy.getName() + " loses 35 HP");
            }
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 25);
                System.out.println(enemy.getName() + " loses 25 HP");
            }
            default -> {
                enemy.setHp(enemy.getHp() - 5);
                System.out.println(enemy.getName() + " loses 5 HP");
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
    }

    void thunder(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunder");
        switch (enemy.getType()) {
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 5);
                System.out.println(enemy.getName() + " loses 5 HP");
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 20);
                System.out.println(enemy.getName() + " loses 20 HP");
            }
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 15);
                System.out.println(enemy.getName() + " loses 15 HP");
            }
            default -> {
                enemy.setHp(enemy.getHp() + 20);
                System.out.println(enemy.getName() + " gains a 20 HP boost");
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
    }

    void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with electroBall");
        switch (enemy.getType()) {
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 14);
                System.out.println(enemy.getName() + " loses 14 HP");
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 28);
                System.out.println(enemy.getName() + " loses 28 HP");
            }
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 21);
                System.out.println(enemy.getName() + " loses 21 HP");
            }
            default -> {
                enemy.setHp(enemy.getHp() - 7);
                System.out.println(enemy.getName() + " loses 7 HP");
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
    }

    void thunderPunch(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunderPunch");
        switch (enemy.getType()) {
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 30);
                System.out.println(enemy.getName() + " loses 30 HP");
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 50);
                System.out.println(enemy.getName() + " loses 50 HP");
            }
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 40);
                System.out.println(enemy.getName() + " loses 40 HP");
            }
            default -> {
                enemy.setHp(enemy.getHp() - 20);
                System.out.println(enemy.getName() + " loses 20 HP");
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
    }

}
