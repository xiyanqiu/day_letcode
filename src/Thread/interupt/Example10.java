package Thread.interupt;

/**
 * @Auther:leeling
 * @Date:2020/2/14 Description:Thread
 */
public class Example10 {
    public static void main(String[] args) {

        Classroom classroom = new Classroom();
        classroom.student.start();
        classroom.teacher.start();



    }
}
