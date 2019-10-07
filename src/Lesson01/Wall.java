package Lesson01;

public class Wall implements Gradeability {
    private int height;
    public Wall(int height){
        this.height=height;
    }
    public int getHeight(){
        return height;
    }
    @Override
    public void actionChoose(Actionable g) {
    g.action(this);
    }
}
