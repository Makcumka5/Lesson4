package Lesson01;

public class Team {
    private Actionable[] participants;
    public Team(){
    participants=new Actionable[5];
    participants[0]= new Cat("Рыжик");
    participants[1]= new Robot("r2d2",150,50000);
    participants[2]= new Human("Майкл");
    participants[3]= new Cat("Бестыжик",200,400);
    participants[4]= new Human("Джон",110,7000);
    }
    public Actionable[] getParticipants(){
        return participants;
    }
}
