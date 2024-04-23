package controller;

import model.Type;
import model.User;
import model.Student;
import model.StudyGroup;
import model.Teacher;
import service.DataService;
import service.StudyGroupService;
import view.StudentView;
import view.StudyGroupView;
import view.TeacherView;

import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudyGroupService serviceStudyGroup = new StudyGroupService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();
    private final StudyGroupView studyGroupView = new StudyGroupView();

    public void createStudent(String firstName, String secondName,
                              String lastName){
        service.create(firstName, secondName, lastName, Type.STUDENT);
    }

    public void getAllStudent(){
        List<User> userList = service.getAllStudent();
        for (User user: userList){
            studentView.printOnConsole((Student) user);
        }
    }
    public void createTeacher(String firstName, String secondName,
                              String lastName){
        service.create(firstName, secondName, lastName, Type.TEACHER);
    }

    public void getAllTeacher(){
        List<User> userList = service.getAllTeacher();
        for (User user: userList){
            teacherView.printTeacherOnConsole((Teacher) user);
        }
    }

    public List<Student> getAllStudentGroup() {
        List<User> students = serviceStudyGroup.getAllStudent();
        for (User user: students){
            students.add(user);
        }
        return null;
    }

    public void getStudyGroup(Integer teacherId, List<Student> students){
        List<StudyGroup> userList = serviceStudyGroup.createStudyGroup((Teacher) service.getUserById(Type.TEACHER, teacherId), getAllStudentGroup());
        for (StudyGroup user: userList){
            studyGroupView.printStudyGroupOnConsole((StudyGroup) user);
        }
    }
}