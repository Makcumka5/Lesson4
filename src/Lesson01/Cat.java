package Lesson01;

public class Cat implements Actionable {
    private String name;
    private int maxHeight=100; //Максимальная высота прыжка в сантиметрах, начальное значение
    private int maxLength=500; //Максимальная длина дистанции для бега в метрах, начальное значение
    private boolean status = true; //Переменная, которая сообщает о готовности участника к выполнению следующего препятствия
    public Cat(String name){
    this.name = name;
    // Генерация разных возможностей для разных объектов
    maxHeight+= (int)Math.random()*100;
    maxLength+=(int)Math.random()*500;
    }
    //Перегруженный конструктор, в котором характеристики для объекта задает сам пользователь
    public Cat(String name,int maxHeight,int maxLength){
        this.name=name;
        this.maxHeight=maxHeight;
        this.maxLength=maxLength;
    }
    @Override
    public void action(Wall name) {
    if (maxHeight>=name.getHeight()){
        System.out.println("Кот "+this.name+" перепрыгнул "+name.getHeight()+" сантиметров");
    }
    else{
        System.out.println("Кот "+this.name+" не перепрыгнул "+name.getHeight()+" сантиметров");
        this.status=false;}
    }
    @Override
    public void action(Track name) {
        if (maxLength>=name.getLength()){
            System.out.println("Кот "+this.name+" пробежал "+name.getLength()+" метров");
        }
        else{
            System.out.println("Кот "+this.name+" не пробежал "+name.getLength()+" метров");
            this.status=false; }
    }
    @Override
    public void startDistance() {
        System.out.println("Приглашается кот "+name+"!"+"\n"+"Его характеристики:"+"\n"+"Прыжок: "+maxHeight+" сантиметров"+"\n"+"Бег: "+maxLength+" метров");
        System.out.println(" ");
    }
    public boolean getStatus() {
        return status;
    }
}
