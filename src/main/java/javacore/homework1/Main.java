package javacore.homework1;

import javacore.homework1.obstacleCourse.Course;
import javacore.homework1.obstacleCourse.Cross;
import javacore.homework1.obstacleCourse.Fight;
import javacore.homework1.obstacleCourse.Swimming;
import javacore.homework1.team.Team;
import javacore.homework1.team.TeamMember;

public class Main {

    public static void main(String[] args) {
        Team dreamTeam = new Team("Dreamteam",
                new TeamMember("A", 6),
                new TeamMember("B", 6),
                new TeamMember("C", 6),
                new TeamMember("D" ,6));

        Course course = new Course(new Cross(5), new Swimming(5), new Fight(7));
        course.doIt(dreamTeam);
    }
}