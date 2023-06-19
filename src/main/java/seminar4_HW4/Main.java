package seminar4_HW4;

import seminar4_HW4.controller.StudentController;
import seminar4_HW4.controller.TeacherController;
import seminar4_HW4.repository.StudentRepository;
import seminar4_HW4.repository.TeacherRepository;
import seminar4_HW4.service.StudentService;
import seminar4_HW4.service.TeacherService;
import seminar4_HW4.view.SortType;
import seminar4_HW4.view.StudentView;
import seminar4_HW4.view.TeacherView;

public class Main {
    public static void main(String[] args) {
        StudentView view_S = getStudentView();
        TeacherView view_T = getTeacherView();
//----------------------------------------------------------------------
        view_S.create("Ivan Morozov", 15, "89125685484");
        view_S.create("Petr Vorobev", 20, "89120000000");
        view_S.create("Anna Morozova", 19, "89046666688");
        view_S.create("Elena Ivanova", 21, "89203333333");
        view_S.create("Sidor Sidorov", 12, "89151111155");
        view_S.sendOnConsole(SortType.NAME);
        view_S.editUser("Petrr Vorobev", 20, "89120000000");
        view_S.editUser("Elena Ivanova", 21, "89203333333");
        view_S.sendOnConsole(SortType.NAME);

//----------------------------------------------------------------------
        view_T.create("Evgenii Krasnov", 55, "81112223344");
        view_T.create("Gleb Alhov", 43, "88002212222");
        view_T.create("Tosya Juk", 38, "0000");
        view_T.create("Elena Letuchaya", 44, "89999999999");
        view_T.sendOnConsole(SortType.NAME);
        view_T.editUser("Elena Letuchaya", 44, "89999999999");
        view_T.sendOnConsole(SortType.NAME);
    }

//----------------------------------------------------------------------

    private static StudentView getStudentView() {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);
        return new StudentView(controller);
    }

    private static TeacherView getTeacherView() {
        TeacherRepository repository = new TeacherRepository();
        TeacherService service = new TeacherService(repository);
        TeacherController controller = new TeacherController(service);
        return new TeacherView(controller);
    }

}
