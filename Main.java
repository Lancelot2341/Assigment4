// Интерфейс для персонажей
interface Character {
    void displayInfo();
}

// Конкретные реализации персонажей
class Warrior implements Character {
    @Override
    public void displayInfo() {
        System.out.println("Воин: сильный и храбрый!");
    }
}

class Mage implements Character {
    @Override
    public void displayInfo() {
        System.out.println("Маг: владеет могущественной магией!");
    }
}

class Archer implements Character {
    @Override
    public void displayInfo() {
        System.out.println("Лучник: меткий стрелок!");
    }
}

// Фабрика для создания персонажей
class CharacterFactory {
    // Метод для создания персонажа
    public Character createCharacter(String type) {
        if (type.equalsIgnoreCase("Воин")) {
            return new Warrior();
        } else if (type.equalsIgnoreCase("Маг")) {
            return new Mage();
        } else if (type.equalsIgnoreCase("Лучник")) {
            return new Archer();
        }
        return null;
    }
}

// Тестирование
public class Main {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();

        // Создаем воина
        Character warrior = characterFactory.createCharacter("Воин");
        warrior.displayInfo();

        // Создаем мага
        Character mage = characterFactory.createCharacter("Маг");
        mage.displayInfo();

        // Создаем лучника
        Character archer = characterFactory.createCharacter("Лучник");
        archer.displayInfo();
    }
}
