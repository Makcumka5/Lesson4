package Lesson01;

public interface Actionable {
    void action(Wall name); //Метод, позволяющий участникам прыгать через стены
    void action(Track name); //Метод, позволяющий участникам бегать по дорожкам
    void startDistance(); //Метод объявления участника сорвенований перед забегом
    boolean getStatus(); //Проверка статуса пройденных этапов
}
