package Lesson01;

import Homework01.ObstacleCourse;
import Homework01.Team;

public class Main {
    public static void main(String[] args){
    Team team = new Team();
    ObstacleCourse obstacleCourse = new ObstacleCourse();
    obstacleCourse.beginningOfCompetitions(team.getParticipants());
    }
}
