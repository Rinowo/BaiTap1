import java.sql.*;
import java.sql.Connection;

public class Methodd {

    public Connection getConnection() throws SQLException {
        String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=Bai Tap 1";
        String username = "Rinowo";
        String password = "Rinochan205.";
        return DriverManager.getConnection(dbURL, username, password);
    }

    public void A() throws SQLException {
        String query = "SELECT GV.maGV AS \"Mã Giáo Viên\", GV.hotenGV AS \"Họ Tên\", K.tenKhoa AS \"Khoa\"\n" +
                "FROM [Giang Vien] GV INNER JOIN Khoa K \n" +
                "ON GV.maKhoa = K.maKhoa\n";
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            int maGV = resultSet.getInt("Mã Giáo Viên");
            String hotenGV = resultSet.getString("Họ Tên");
            String tenKhoa = resultSet.getString("Khoa");
            System.out.println(maGV + " " + hotenGV + " " + tenKhoa);
        }
    }

    public void B() throws SQLException {
        String query = "SELECT GV.maGV AS \"Mã Giáo Viên\", GV.hotenGV AS \"Họ Tên\", K.tenKhoa AS \"Khoa\" \n" +
                "FROM [Giang Vien] GV INNER JOIN Khoa K\n" +
                "ON GV.maKhoa = K.maKhoa\n" +
                "WHERE K.tenKhoa = 'Dia ly' OR K.tenKhoa = 'QLTN'\n";
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            int maGV = resultSet.getInt("Mã Giáo Viên");
            String hotenGV = resultSet.getString("Họ Tên");
            String tenKhoa = resultSet.getString("Khoa");
            System.out.println(maGV + " " + hotenGV + " " + tenKhoa);
        }
    }

    public void C() throws SQLException {
        String query = "SELECT COUNT(SV.maSV) AS [Số Sinh Viên]\n" +
                "FROM [Sinh Vien] SV INNER JOIN Khoa K\n" +
                "ON SV.maKhoa = K.maKhoa\n" +
                "WHERE K.tenKhoa = 'Cong Nghe Sinh Hoc'\n";
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            int soSV = resultSet.getInt("Số Sinh Viên");
            System.out.println("Số lượng sinh viên: " + soSV);
        }
    }

    public void D() throws SQLException {
        String query = "SELECT SV.maSV, SV.hotenSV\n" +
                "FROM [Sinh Vien] SV INNER JOIN [Huong Dan] HD \n" +
                "ON SV.maSV = HD.maSV\n" +
                "WHERE HD.maDT IS NULL";
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            int maSV = resultSet.getInt("maSV");
            String hotenSV = resultSet.getString("hotenSV");
            System.out.println("ID SV: " + maSV + " Họ tên: " + hotenSV);
        }
    }

    public void E() throws SQLException {
        String query = "SELECT K.maKhoa, COUNT(GV.maGV) AS [So Giang Vien] ,K.tenKhoa\n" +
                "FROM [Giang Vien] GV INNER JOIN Khoa K \n" +
                "ON GV.maKhoa = K.maKhoa\n" +
                "GROUP BY  K.tenKhoa, K.maKhoa";
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            String maKhoa = resultSet.getString("maKhoa");
            int soGV = resultSet.getInt("So Giang Vien");
            String tenKhoa = resultSet.getString("tenKhoa");
            System.out.println("Mã khoa: " + maKhoa + " Số GV: " + soGV + " Tên Khoa: " + tenKhoa);
        }
    }

    public void F() throws SQLException {
        String query = "SELECT K.dienthoai\n" +
                "FROM [Sinh Vien] SV INNER JOIN Khoa K\n" +
                "ON SV.maKhoa = K.maKhoa\n" +
                "WHERE SV.hotenSV = 'Sinh Vien D'";
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            String dienthoai = resultSet.getString("dienthoai");
            System.out.println("Điện thoại: " + dienthoai);
        }
    }

    public void G() throws SQLException {
        String query = "SELECT DT.tenDT \n" +
                "FROM [De Tai] DT INNER JOIN [Huong Dan] HD \n" +
                "ON DT.maDT = HD.maDT \n" +
                "WHERE HD.maSV IS NULL";
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            String tenDT = resultSet.getString("tenDT");
            System.out.println("Tên đề tài: " + tenDT);
        }
    }

    public void H() throws SQLException {
        String query = "SELECT DT.maDT, DT.tenDT \n" +
                "FROM [Huong Dan] HD INNER JOIN [De Tai] DT \n" +
                "ON HD.maDT = DT.maDT\n" +
                "GROUP BY DT.tenDT, DT.maDT\n" +
                "HAVING COUNT(HD.maSV) = 0";
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            String maDT = resultSet.getString("maDT");
            String tenDT = resultSet.getString("tenDT");
            System.out.println("Mã đề tài: " + maDT + " Tên đề tài: " + tenDT);
        }
    }

    public void I() throws SQLException {
        String query = "SELECT GV.maGV, GV.hotenGV, K.tenKhoa\n" +
                "FROM Khoa K INNER JOIN [Giang Vien] GV \n" +
                "ON GV.maKhoa = K.maKhoa INNER JOIN [Huong Dan] HD\n" +
                "ON GV.maGV = HD.maGV\n" +
                "GROUP BY GV.hotenGV, GV.maGV, K.tenKhoa\n" +
                "HAVING COUNT(HD.maGV) > 3 ";
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            int maGV = resultSet.getInt("maGV");
            String hotenGV = resultSet.getString("hotenGV");
            String tenKhoa = resultSet.getString("tenKhoa");
            System.out.println("Mã GV: " + maGV + "Họ tên: " + hotenGV + "Tên Khoa: " + tenKhoa);
        }
    }

    public void J() throws SQLException {
        String query = "SELECT DT.maDT, DT.tenDT \n" +
                "FROM [Giang Vien] GV INNER JOIN [Huong Dan] HD \n" +
                "ON GV.maGV = HD.maGV INNER JOIN [De Tai] DT \n" +
                "ON HD.maDT = DT.maDT\n" +
                "WHERE GV.hotenGV = 'Giang Vien B'\n" +
                "GROUP BY DT.maDT, DT.tenDT";
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            String maDT = resultSet.getString("maDT");
            String tenDT = resultSet.getString("tenDT");
            System.out.println("Mã Đề Tài: " + maDT + " Tên Đề Tài: " + tenDT);
        }
    }

    public void K() throws SQLException {
        String query = "SELECT TOP 1 * \n" +
                "FROM [De Tai] DT \n" +
                "ORDER BY DT.kinhPhi DESC  ";
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            String maDT = resultSet.getString("maDT");
            String tenDT = resultSet.getString("tenDT");
            int kinhphi = resultSet.getInt("kinhphi");
            String noiThucTap = resultSet.getString("noiThucTap");
            System.out.println("Mã Đề Tài: " + maDT + " Tên Đề Tài: " + tenDT + " Kinh Phí: " + kinhphi + " Nơi Thực Tập: " + noiThucTap);
        }
    }

    public void L() throws SQLException {
        String query = "SELECT DT.maDT, DT.tenDT \n" +
                "FROM [Huong Dan] HD INNER JOIN [De Tai] DT \n" +
                "ON HD.maDT = DT.maDT\n" +
                "GROUP BY DT.maDT, DT.tenDT\n" +
                "HAVING COUNT(HD.maSV) > 2";
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            String maDT = resultSet.getString("maDT");
            String tenDT = resultSet.getString("tenDT");
            System.out.println("Mã Đề Tài: " + maDT + " Tên Đề Tài: " + tenDT);
        }
    }

    public void M() throws SQLException {
        String query = "SELECT SV.maSV, SV.hotenSV \n" +
                "FROM [Sinh Vien] SV INNER JOIN Khoa K \n" +
                "ON SV.maKhoa = K.maKhoa \n" +
                "WHERE K.tenKhoa = 'Dia ly' OR K.tenKhoa = 'QLTN'";
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            int maSV = resultSet.getInt("maSV");
            String hotenSV = resultSet.getString("hotenSV");
            System.out.println("Mã Sinh viên: " + maSV + " Họ Tên Sinh Vên: " + hotenSV);
        }
    }

    public void N() throws SQLException {
        String query = "SELECT K.tenKhoa, COUNT(SV.maSV) AS [So Luong Sinh Vien] \n" +
                "FROM Khoa K INNER JOIN [Sinh Vien] SV \n" +
                "ON K.maKhoa = SV.maKhoa\n" +
                "GROUP BY K.tenKhoa";
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            String tenKhoa = resultSet.getString("tenKhoa");
            int soSV = resultSet.getInt("So Luong Sinh Vien");
            System.out.println("Tên Khoa: " + tenKhoa + " Số lượng sinh viên: " + soSV);
        }
    }

    public void O() throws SQLException {
        String query = "SELECT SV.maSV, SV.hotenSV, SV.maKhoa \n" +
                "FROM [Sinh Vien] SV INNER JOIN [Huong Dan] HD\n" +
                "ON SV.maSV = HD.maSV INNER JOIN [De Tai] DT\n" +
                "ON HD.maDT = DT.maDT\n" +
                "WHERE DT.noiThucTap = 'Noi Thuc Tap C'";
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            int maSV = resultSet.getInt("maSV");
            String hotenSV = resultSet.getString("hotenSV");
            int maKhoa = resultSet.getInt("maKhoa");
            System.out.println("Mã sinh viên: " + maSV + " Họ tên sinh viên: " + hotenSV + " Mã khoa: " + maKhoa);
        }
    }

    public void P() throws SQLException {
        String query = "SELECT SV.maSV, SV.hotenSV, SV.maKhoa, SV.namSinh \n" +
                "FROM [Sinh Vien] SV INNER JOIN [Huong Dan] HD \n" +
                "ON SV.maSV = HD.maSV \n" +
                "WHERE HD.ketQua IS NULL\n" +
                "GO";
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            int maSV = resultSet.getInt("maSV");
            String hotenSV = resultSet.getString("hotenSV");
            int maKhoa = resultSet.getInt("maKhoa");
            int namSinh = resultSet.getInt("namSinh");
            System.out.println("Mã sinh viên: " + maSV + " Họ tên sinh viên: " + hotenSV + " Mã Khoa: " +
                    maKhoa + " Năm Sinh: " + namSinh);
        }
    }

    public void Q() throws SQLException {
        String query = "SELECT * \n" +
                "FROM [Sinh Vien] SV INNER JOIN [Huong Dan] HD \n" +
                "ON SV.maSV = HD.maSV \n" +
                "WHERE HD.ketQua = 0";
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            int maSV = resultSet.getInt("maSV");
            String hotenSV = resultSet.getString("hotenSV");
            int maKhoa = resultSet.getInt("maKhoa");
            int namSinh = resultSet.getInt("namSinh");
            System.out.println("Mã sinh viên: " + maSV + " Họ tên sinh viên: " + hotenSV + " Mã Khoa: " +
                    maKhoa + " Năm Sinh: " + namSinh);
        }
    }
}
