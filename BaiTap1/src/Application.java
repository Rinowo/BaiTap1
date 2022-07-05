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
                case 1 -> methodd.m1();
                case 2 -> methodd.m2();
                case 3 -> methodd.m3();
                case 4 -> methodd.m4();
                case 5 -> methodd.m5();
                case 6 -> methodd.m6();
                case 7 -> methodd.m7();
                case 8 -> methodd.m8();
                case 9 -> methodd.m9();
                case 10 -> methodd.m10();
                case 11 -> methodd.m11();
                case 12 -> methodd.m12();
                case 13 -> methodd.m13();
                case 14 -> methodd.m14();
                case 15 -> methodd.m15();
                case 16 -> methodd.m16();
                case 17 -> methodd.m17();
            }
        }
    }

    public static void menu() {
        System.out.println();
        System.out.println("1. Đưa ra thông tin gồm mã số, họ tênvà tên khoa của tất cả các giảng viên");
        System.out.println("2. Đưa ra thông tin gồm mã số, tên khoa của các giảng viên của khoa \"Dia ly và QLTN\"");
        System.out.println("3. Cho biết số sinh viên của khoa \"Cong Nghe Sinh Hoc\"");
        System.out.println("4. Đưa ra danh sách gồm mã số, họ tên và tuổi của các sinh viên khoa ‘TOAN’");
        System.out.println("5. Cho biết số giảng viên của khoa ‘CONG NGHE SINH HOC’");
        System.out.println("6. Cho biết thông tin về sinh viên không tham gia thực tập");
        System.out.println("7. Đưa ra mã khoa, tên khoa và số giảng viên của mỗi khoa");
        System.out.println("8. Cho biết số điện thoại của khoa mà sinh viên có tên 'Sinh Vien D' đang theo học");
        System.out.println("9. Cho biết tên đề tài không có sinh viên nào thực tập");
        System.out.println("10. Cho biết mã số, họ tên, tên khoa của các giảng viên hướng dẫn từ 3 sinh viên trở lên");
        System.out.println("11. Cho biết mã số và tên của các đề tài do giảng viên 'Giang Vien B' hướng dẫn");
        System.out.println("12. Cho biết mã số, tên đề tài của đề tài có kinh phí cao nhất");
        System.out.println("13. Cho biết mã số và tên các đề tài có nhiều hơn 2 sinh viên tham gia thực tập");
        System.out.println("14. Đưa ra mã số, họ tên và điểm của các sinh viên khoa 'Dia ly và QLTN'");
        System.out.println("15. Đưa ra tên khoa, số lượng sinh viên của mỗi khoa");
        System.out.println("16. Cho biết thông tin về các sinh viên thực tập tại quê nhà");
        System.out.println("17. Hãy cho biết thông tin về những sinh viên chưa có điểm thực tập");
        System.out.println("18. Đưa ra danh sách gồm mã số, họ tên các sinh viên có điểm thực tập bằng 0");
        System.out.print("Choose: ");
    }
}
