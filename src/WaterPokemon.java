import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private final List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "water");
    }

    List<String> getAttacks() {
        return attacks;
    }

    void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with surf");
        switch (enemy.getType()) {
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 45);
                System.out.println(enemy.getName() + " loses 45 HP");
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 15);
                System.out.println(enemy.getName() + " loses 15 HP");
            }
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 25);
                System.out.println(enemy.getName() + " loses 25 HP");
            }
            default -> {
                enemy.setHp(enemy.getHp() - 35);
                System.out.println(enemy.getName() + " loses 35 HP");
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydroPump");
        switch (enemy.getType()) {
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 20);
                System.out.println(enemy.getName() + " loses 20 HP");
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 5);
                System.out.println(enemy.getName() + " loses 5 HP");
            }
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 10);
                System.out.println(enemy.getName() + " loses 10 HP");
            }
            default -> {
                enemy.setHp(enemy.getHp() - 15);
                System.out.println(enemy.getName() + " loses 15 HP");
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydroCanon");
        switch (enemy.getType()) {
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 28);
                System.out.println(enemy.getName() + " loses 28 HP");
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 7);
                System.out.println(enemy.getName() + " loses 7 HP");
            }
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 14);
                System.out.println(enemy.getName() + " loses 14 HP");
            }
            default -> {
                enemy.setHp(enemy.getHp() - 21);
                System.out.println(enemy.getName() + " loses 21 HP");
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with rainDance");
        switch (enemy.getType()) {
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 50);
                System.out.println(enemy.getName() + " loses 50 HP");
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 10);
                System.out.println(enemy.getName() + " loses 10 HP");
            }
            case "grass" -> {
                enemy.setHp(enemy.getHp() + 50);
                System.out.println(enemy.getName() + " gains a 50 HP boost");
            }
            default -> {
                System.out.println("Has no effect on " + enemy.getName());
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
    }

}
