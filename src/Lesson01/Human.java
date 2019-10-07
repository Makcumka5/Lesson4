package Lesson01;

public class Human implements Actionable {
    private String name;
    private int maxHeight=80; //Максимальная высота прыжка в сантиметрах, начальное значение
    private int maxLength=1000; //Максимальная длина дистанции для бега в метрах, начальное значение
    private boolean status = true; //Переменная, которая сообщает о готовности участника к выполнению следующего препятствия
    public Human(String name){
        this.name = name;
        // Генерация разных возможностей для разных объектов
        maxHeight+= (int)Math.random()*80;
        maxLength+=(int)Math.random()*2000;
    }
    //Перегруженный конструктор, в котором характеристики для объекта задает сам пользователь
    public Human(String name,int maxHeight,int maxLength){
        this.name=name;
        this.maxHeight=maxHeight;
        this.maxLength=maxLength;
    }
    @Override
    public void action(Wall name) {
        if (maxHeight>=name.getHeight()){
            System.out.println("Человек "+this.name+" перепрыгнул "+name.getHeight()+" сантиметров");
        }
        else{
            System.out.println("Человек "+this.name+" не перепрыгнул "+name.getHeight()+" сантиметров");
            this.status=false;}
    }
    @Override
    public void action(Track name) {
        if (maxLength>=name.getLength()){
            System.out.println("Человек "+this.name+" пробежал "+name.getLength()+" метров");
        }
        else{
            System.out.println("Человек "+this.name+" не пробежал "+name.getLength()+" метров");
            this.status=false; }
    }
    @Override
    public void startDistance() {
        System.out.println("Приглашается человек "+name+"!"+"\n"+"Его характеристики:"+"\n"+"Прыжок: "+maxHeight+" сантиметров"+"\n"+"Бег: "+maxLength+" метров");
        System.out.println(" ");
    }

    public boolean getStatus() {
        return status;
    }
}
