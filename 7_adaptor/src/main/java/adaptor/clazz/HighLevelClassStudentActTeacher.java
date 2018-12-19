package adaptor.clazz;

import adaptor.HighLevelClassStudent;
import adaptor.Teacher;

/**
 * @author lei.liu
 * @since 18-12-19
 */
public class HighLevelClassStudentActTeacher extends HighLevelClassStudent implements Teacher {
    public String teacherLessonList() {
        return recallLessonList();
    }


    public static void main(String[] args) {
        Teacher teacher = new HighLevelClassStudentActTeacher();
        System.out.println(teacher.teacherLessonList());
    }
}
