package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateEx1 {
    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement psmt = null;
        try {

            // 1.드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");

            // 2. 연결 문자열 작성
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott ";
            String password = "TIGER";

            // 3. connection 얻기
            con = DriverManager.getConnection(url, user, password);
            // 자바에서 auto commit 상태임
            con.setAutoCommit(false);

            // 4. update 작업
            String sql = "UPDATE emp_temp SET COMM = 50 WHERE EMPNO = 7900";
            psmt = con.prepareStatement(sql);
            int result = psmt.executeUpdate();

            if (result > 0) {
                System.out.println("성공");
                con.commit();
            } else {
                con.rollback();
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
