package service;

import java.util.ArrayList;
import java.util.List;
import model.Student;
import model.StudyGroup;
import model.Teacher;
import model.Type;
import model.User;

public class StudyGroupService extends DataService{
    private List<StudyGroup> userList;

    public StudyGroupService() {
        this.userList = new ArrayList<>();
    }

    public List<StudyGroup> createStudyGroup(Teacher teacher, List<Student> students) {
        StudyGroup user = new StudyGroup(teacher, students);
        userList.add(user);
        return userList;
    }

    @Override
    public List<User> getAllStudent() {
        return super.getAllStudent();
    }

    @Override
    public User getUserById(Type type, int id) {
        // TODO Auto-generated method stub
        return super.getUserById(type, id);
    }
}