import java.sql.SQLException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws SQLException {
        Methodd methodd = new Methodd();
        Scanner sc = new Scanner(System.in);

        while (true) {
            menu();
            int choose = sc.nextInt();

            switch (choose) {
                case 1 -> methodd.A();
                case 2 -> methodd.B();
                case 3 -> methodd.C();
                case 4 -> methodd.D();
                case 5 -> methodd.E();
                case 6 -> methodd.F();
                case 7 -> methodd.G();
                case 8 -> methodd.H();
                case 9 -> methodd.I();
                case 10 -> methodd.J();
                case 11 -> methodd.K();
                case 12 -> methodd.L();
                case 13 -> methodd.M();
                case 14 -> methodd.N();
                case 15 -> methodd.O();
                case 16 -> methodd.P();
                case 17 -> methodd.Q();
            }
        }
    }

    public static void menu() {
        System.out.println();
        System.out.println("1. Đưa ra thông tin gồm mã số, họ tên và tên khoa của tất cả các giảng viên");
        System.out.println("2. Đưa ra thông tin gồm mã số, tên khoa của các giảng viên của khoa \"Dia ly và QLTN\"");
        System.out.println("3. Cho biết số sinh viên của khoa \"Cong Nghe Sinh Hoc\"");
        System.out.println("4. Cho biết thông tin về sinh viên không tham gia thực tập");
        System.out.println("5. Đưa ra mã khoa, tên khoa và số giảng viên của mỗi khoa");
        System.out.println("6. Cho biết số điện thoại của khoa mà sinh viên có tên 'Sinh Vien D' đang theo học");
        System.out.println("7. Cho biết tên đề tài không có sinh viên nào thực tập");
        System.out.println("8. Cho biết mã số, họ tên, tên khoa của các giảng viên hướng dẫn từ 3 sinh viên trở lên");
        System.out.println("9. Cho biết mã số và tên của các đề tài do giảng viên 'Giang Vien B' hướng dẫn");
        System.out.println("10. Cho biết mã số, tên đề tài của đề tài có kinh phí cao nhất");
        System.out.println("11. Cho biết mã số và tên các đề tài có nhiều hơn 2 sinh viên tham gia thực tập");
        System.out.println("12. Đưa ra mã số, họ tên và điểm của các sinh viên khoa 'Dia ly và QLTN'");
        System.out.println("13. Đưa ra tên khoa, số lượng sinh viên của mỗi khoa");
        System.out.println("14. Cho biết thông tin về các sinh viên thực tập tại quê nhà");
        System.out.println("15. Hãy cho biết thông tin về những sinh viên chưa có điểm thực tập");
        System.out.println("16. Đưa ra danh sách gồm mã số, họ tên các sinh viên có điểm thực tập bằng 0");
        System.out.print("Choose: ");
    }
}
