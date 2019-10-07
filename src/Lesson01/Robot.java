package Lesson01;

public class Robot implements Actionable {
    private String name;
    private int maxHeight; //Максимальная высота прыжка в сантиметрах
    private int maxLength; //Максимальная длина дистанции для бега в метрах
    private boolean status = true; //Переменная, которая сообщает о готовности участника к выполнению следующего препятствия
    //Представим, что для робота будет только один вид конструктора, так как характеристики робота определяем исключительно мы при его создании
    public Robot(String name,int maxHeight,int maxLength){
        this.name = name;
        this.maxHeight=maxHeight;
        this.maxLength=maxLength;
    }
    @Override
    public void action(Wall name) {
        if (maxHeight>=name.getHeight()){
            System.out.println("Робот "+this.name+" перепрыгнул "+name.getHeight()+" сантиметров");
        }
        else{
            System.out.println("Робот "+this.name+" не перепрыгнул "+name.getHeight()+" сантиметров");
            this.status=false;}
    }
    @Override
    public void action(Track name) {
        if (maxLength>=name.getLength()){
            System.out.println("Робот "+this.name+" пробежал "+name.getLength()+" метров");
        }
        else{
            System.out.println("Робот "+this.name+" не пробежал "+name.getLength()+" метров");
            this.status=false;}
    }
    @Override
    public void startDistance() {
        System.out.println("Приглашается робот "+name+"!"+"\n"+"Его характеристики:"+"\n"+"Прыжок: "+maxHeight+" сантиметров"+"\n"+"Бег: "+maxLength+" метров");
        System.out.println(" ");
    }
    public boolean getStatus() {
        return status;
    }
}
