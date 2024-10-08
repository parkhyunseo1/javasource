package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertEx1 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement psmt = null;
        // ResultSet rs = null; select 할때만 사용
        try {

            // 1.드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");

            // 2. 연결 문자열 작성
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott ";
            String password = "TIGER";

            // 3. connection 얻기
            con = DriverManager.getConnection(url, user, password);

            // 4. insert 작업
            // 4-1. 실행할 sql 구문 작성
            String sql = "INSERT INTO emp_temp VALUES (7201,'TEST_USER1', 'MANAGER', 7788, '2016-01-02', 4500, NULL, 50)";
            // 4-2. sql 구문 전송
            psmt = con.prepareStatement(sql);
            // 4-3. sql 구문 실행 후 결과 받기
            int result = psmt.executeUpdate();
            if (result > 0) {
                System.out.println("입력성공");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                psmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
