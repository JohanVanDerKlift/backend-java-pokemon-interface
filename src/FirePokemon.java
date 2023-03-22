import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    private final List<String> attacks = Arrays.asList("fireLash", "flameThrower", "pyroBall", "inferno");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "fire");
    }

    List<String> getAttacks() {
        return attacks;
    }

    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with fireLash");
        switch (enemy.getType()) {
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 5);
                System.out.println(enemy.getName() + " loses 5 HP");
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 25);
                System.out.println(enemy.getName() + " loses 25 HP");
            }
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 35);
                System.out.println(enemy.getName() + " loses 35 HP");
            }
            default -> {
                enemy.setHp(enemy.getHp() - 15);
                System.out.println(enemy.getName() + " loses 15 HP");
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
    }



    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with flameThrower");
        switch (enemy.getType()) {
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 5);
                System.out.println(enemy.getName() + " loses 5 HP");
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 15);
                System.out.println(enemy.getName() + " loses 15 HP");
            }
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 20);
                System.out.println(enemy.getName() + " loses 20 HP");
            }
            default -> {
                enemy.setHp(enemy.getHp() - 10);
                System.out.println(enemy.getName() + " loses 10 HP");
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
    }

    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with pyroBall");
        switch (enemy.getType()) {
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 7);
                System.out.println(enemy.getName() + " loses 7 HP");
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 21);
                System.out.println(enemy.getName() + " loses 21 HP");
            }
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 28);
                System.out.println(enemy.getName() + " loses 28 HP");
            }
            default -> {
                enemy.setHp(enemy.getHp() - 14);
                System.out.println(enemy.getName() + " loses 14 HP");
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
    }

    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with inferno");
        switch (enemy.getType()) {
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 20);
                System.out.println(enemy.getName() + " loses 20 HP");
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 40);
                System.out.println(enemy.getName() + " loses 40 HP");
            }
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 50);
                System.out.println(enemy.getName() + " loses 50 HP");
            }
            default -> {
                enemy.setHp(enemy.getHp() - 30);
                System.out.println(enemy.getName() + " loses 30 HP");
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
    }
}
