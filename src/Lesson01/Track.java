package Lesson01;

public class Track implements Gradeability {
    private int length;
    public Track(int length){
        this.length=length;
    }
    public int getLength(){
        return length;
    }
    @Override
    public void actionChoose(Actionable g) {
    g.action(this);
    }
}
