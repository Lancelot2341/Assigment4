import java.util.Random;

// Пример класса персонажа
class Character {
    private String name;
    private int hitPoints;
    private int attackBonus;
    private int defense;

    public Character(String name, int hitPoints, int attackBonus, int defense) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.attackBonus = attackBonus;
        this.defense = defense;
    }

    // Геттер и сеттер для hitPoints
    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    // Метод для атаки другого персонажа
    public void attack(Character target) {
        Random random = new Random();
        int roll = random.nextInt(20) + 1; // Бросок кубика d20
        int attackRoll = roll + attackBonus;

        if (attackRoll > target.defense) {
            int damage = random.nextInt(6) + 1; // Бросок кубика d6 для урона
            target.takeDamage(damage);
            System.out.println(name + " hits " + target.name + " for " + damage + " damage!");
        } else {
            System.out.println(name + " misses " + target.name + "!");
        }
    }

    // Метод для получения урона
    public void takeDamage(int damage) {
        hitPoints -= damage;
        if (hitPoints <= 0) {
            System.out.println(name + " has been defeated!");
        }
    }
}

// Пример класса приложения для тестирования системы D&D
public class DnDSystem {
    public static void main(String[] args) {
        // Создание персонажей
        Character player = new Character("Player", 20, 5, 10);
        Character enemy = new Character("Enemy", 15, 3, 8);

        // Бой между персонажами
        while (player.getHitPoints() > 0 && enemy.getHitPoints() > 0) {
            player.attack(enemy);
            if (enemy.getHitPoints() > 0) {
                enemy.attack(player);
            }
        }
    }
}
