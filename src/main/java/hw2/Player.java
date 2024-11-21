package hw2;

/**
 Задача 11. Класс "Игрок"
 Создайте класс Player с полями:
 nickname (никнейм, тип String),
 level (уровень, тип int),
 score (очки, тип int).
 Реализуйте:
 Конструктор с параметрами для всех полей.
 Геттеры и сеттеры.
 Метод levelUp(), который увеличивает уровень на 1.
 Метод addScore(int points), который добавляет очки.
 Метод printPlayerInfo(), который выводит:
 Игрок: <nickname>, Уровень: <level>, Очки: <score>

 В методе main создайте игрока, поднимите уровень, добавьте очки и выведите данные.
 */
public class Player {
    private String nickname;
    private int level;
    private int score;

    public Player(String nickname, int level, int score) {
        this.nickname = nickname;
        this.level = level;
        this.score = score;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void levelUp() {
        this.level++;
    }

    public void addScore(int points) {
        this.score += points;
    }

    public void printPlayerInfo() {
        System.out.printf(" Игрок: %s, Уровень: %d, Очки: %d\n",
                this.nickname, this.level, this.score);
    }

    public static void main(String[] args) {
        Player player = new Player("Dimon", 4, 34);
        player.printPlayerInfo();
        player.levelUp();
        player.addScore(9);
        player.printPlayerInfo();
    }
}
