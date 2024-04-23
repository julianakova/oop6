import controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createTeacher("0", "1", "1");
        controller.getAllTeacher();
        controller.createStudent("1", "1", "1");
        controller.createStudent("2", "2", "2");
        controller.getAllStudent();
        controller.createStudent("3", "3", "3");
        controller.createStudent("4", "4", "4");
        controller.getAllStudent();
        System.out.println("-----------------------------------------------------------------");
        controller.getStudyGroup(1, controller.getAllStudentGroup());
    }
}