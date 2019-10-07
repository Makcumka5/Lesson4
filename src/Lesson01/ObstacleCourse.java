package Lesson01;

public class ObstacleCourse {
    private Gradeability[] obstacles;
    public ObstacleCourse(){
        obstacles=new Gradeability[5];
        obstacles[0]=new Wall(50);
        obstacles[1]=new Wall(100);
        obstacles[2]=new Track(2000);
        obstacles[3]=new Wall(80);
        obstacles[4]=new Track(4000);
    }
    public void beginningOfCompetitions(Actionable participants[]){
        for (int i=0;i<participants.length;i++){
            participants[i].startDistance();
            for (int j=0;j<obstacles.length;j++){
                obstacles[j].actionChoose(participants[i]);
                if (participants[i].getStatus()==true)
                    continue;
                else
                    break;
                }
            if (participants[i].getStatus()==true){
                System.out.println("Полоса препятствий пройдена!");
                System.out.println(" ");}
            else
                System.out.println("Провал, соревнования окончены!");{
                System.out.println(" ");}
            }
        }
    }
