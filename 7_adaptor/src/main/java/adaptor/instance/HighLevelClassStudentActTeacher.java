package adaptor.instance;

import adaptor.HighLevelClassStudent;
import adaptor.Teacher;

/**
 * @author lei.liu
 * @since 18-12-19
 */
public class HighLevelClassStudentActTeacher implements Teacher {

    private HighLevelClassStudent highLevelClassStudent;

    private HighLevelClassStudentActTeacher() {
        highLevelClassStudent = new HighLevelClassStudent();
    }

    public String teacherLessonList() {
        return highLevelClassStudent.recallLessonList();
    }

    public static void main(String[] args) {
        Teacher teacher = new HighLevelClassStudentActTeacher();
        System.out.println(teacher.teacherLessonList());
    }
}
