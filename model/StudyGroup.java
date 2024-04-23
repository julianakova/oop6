package model;

import java.util.List;

public class StudyGroup {
    private Teacher teacher;
    private List<Student> students;
    public StudyGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    @Override
    public String toString() {
        return "StudyGroup [teacher=" + teacher + ", students=" + students + "]";
    }
}

    /*public StudyGroup(String teacher, String student, List<StudyGroup> studyGroups) {
        this.teacher = teacher;
        this.student = student;
        this.studyGroups = studyGroups;
    }

    protected String teacher;
    protected String student;

    public String getTeacher() {
        return teacher;
    }
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
    public String getStudent() {
        return student;
    }
    public void setStudent(String student) {
        this.student = student;
    }

    public List<StudyGroup> studyGroups = new ArrayList<StudyGroup>();

    private void Print(StringBuilder sb, String indent) {
        sb.append(String.format("%s %s %s\n", indent, student, getTeacher()));

        for (StudyGroup studyGroup : studyGroups)
        studyGroup.Print(sb, indent + "  ");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Print(sb, "");
        return sb.toString();
    }
}*/
