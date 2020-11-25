package F.I.N.A.L.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mysql {
    public static final ResultSet NULL = null;

    public static void main(String[] args) throws SQLException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e){}
        String dbURL = "jdbc:mysql://localhost/gcdb";
        try {
            String userName="root";
            String userPwd="aa082603";
            Connection con;
            con=DriverManager.getConnection(dbURL,userName,userPwd);
            ResultSet rs = NULL;
            Statement smt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = smt.executeQuery("select * from gc");
            while (rs.next()) {
                System.out.println(rs.getString(1) + rs.getString(3));
            }
            String sqlinsert = "insert into gc(gch, mc, gcdz)values('030013', '悦达110','安徽省合肥市经济开发区')";
            smt.executeUpdate(sqlinsert);
            rs.close();
            smt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
