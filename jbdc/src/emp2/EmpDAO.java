package emp2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
    // CRUD 작업을 위한 메소드 작성
    private Connection con;
    private PreparedStatement psmt;
    private ResultSet rs;

    // static 블럭 : 클래스 로드되면 인스턴스 생성 여부와 상관없이 실행
    static {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException {

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott ";
        String password = "TIGER";

        // con = DriverManager.getConnection(url, user, password);
        // return con;
        return DriverManager.getConnection(url, user, password);

    }

    public void close(Connection con, PreparedStatement psmt) {
        try {
            psmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close(Connection con, PreparedStatement psmt, ResultSet rs) {
        try {
            psmt.close();
            con.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // CRUD 메소드 작성
    public boolean insert(EmpDTO dto) {
        boolean flag = false;
        try {
            con = getConnection();

            // 4-1. 실행할 sql 구문 작성
            String sql = "INSERT INTO emp_temp(empno, ename, job, mgr, hiredate, sal, comm, deptno) ";
            sql += "VALUES(?,?,?,?,?,?,?,?)";
            // 4-2. sql 구문 전송
            psmt = con.prepareStatement(sql);
            // ? 해결
            psmt.setInt(1, dto.getEmpno());
            psmt.setString(2, dto.getEname());
            psmt.setString(3, dto.getJob());
            psmt.setInt(4, dto.getMgr());
            psmt.setString(5, dto.getHiredate());
            psmt.setInt(6, dto.getSal());
            psmt.setInt(7, dto.getComm());
            // java.sql.SQLException: 인덱스에서 누락된 IN 또는 OUT 매개변수:: 8
            psmt.setInt(8, dto.getDeptno());

            int result = psmt.executeUpdate();
            if (result > 0)
                flag = true;

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            close(con, psmt);
        }
        return flag;
    }

    // 특정사원정보
    public EmpDTO getEmp(int empno) {
        EmpDTO dto = null;
        try {

            con = getConnection();

            String sql = "SELECT * FROM emp_temp WHERE empno = ?";
            psmt = con.prepareStatement(sql);
            // ? 해결
            psmt.setInt(1, empno);
            rs = psmt.executeQuery();
            if (rs.next()) {
                dto = new EmpDTO();
                dto.setEmpno(rs.getInt("empno"));
                dto.setEname(rs.getString("ename"));
                dto.setJob(rs.getString("job"));
                dto.setMgr(rs.getInt("mgr"));
                dto.setHiredate(rs.getString("hiredate"));
                dto.setSal(rs.getInt("sal"));
                dto.setComm(rs.getInt("comm"));
                dto.setDeptno(rs.getInt("deptno"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, psmt, rs);
        }
        return dto;
    }

    // 전체사원 조회
    public List<EmpDTO> getList() {
        List<EmpDTO> list = new ArrayList<>();
        try {
            con = getConnection();
            String sql = "SELECT * FROM emp_temp";
            psmt = con.prepareStatement(sql);
            rs = psmt.executeQuery();

            while (rs.next()) {
                EmpDTO dto = new EmpDTO();
                // 레코드 => dto 로 생성 후 = > list 에 추가
                dto.setEmpno(rs.getInt("empno"));
                dto.setEname(rs.getString("ename"));
                dto.setJob(rs.getString("job"));
                dto.setMgr(rs.getInt("mgr"));
                dto.setHiredate(rs.getString("hiredate"));
                dto.setSal(rs.getInt("sal"));
                dto.setComm(rs.getInt("comm"));
                dto.setDeptno(rs.getInt("deptno"));

                list.add(dto);
                // list.add(new EmpDTO(rs.getInt("empno"), sql, sql, 0, sql, 0, 0, 0))
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, psmt, rs);
        }
        return list;
    }

    // 특정 사원 정보 수정
    public boolean empUpdate(EmpDTO dto) {
        boolean flag = false;
        try {
            con = getConnection();

            String sql = "UPDATE EMP_TEMP SET COMM = ?, SAL = ? WHERE EMPNO = ?";
            psmt = con.prepareStatement(sql);
            psmt.setInt(1, dto.getComm());
            psmt.setInt(2, dto.getSal());
            psmt.setInt(3, dto.getEmpno());

            int result = psmt.executeUpdate();
            if (result > 0) {
                flag = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, psmt);
        }
        return flag;
    }

    // 특정 사원 정보 삭제
    public boolean empDelete(int empno) {
        boolean flag = false;
        String sql = "delete from emp_temp where empno=?";
        try {
            con = getConnection();
            // 4-2 sql 구문전송
            psmt = con.prepareStatement(sql);
            // ? 해결
            psmt.setInt(1, empno);

            // 4-3. sql 구문 실행 후 결과 받기
            int result = psmt.executeUpdate();
            if (result > 0) {
                System.out.println("삭제성공");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
        return flag;
    }
}
