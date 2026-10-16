import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_codingrecipe",
                "user_codingrecipe", "1234");

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM MEMBER WHERE ID = ?");
        preparedStatement.setLong(1,2L);
        ResultSet resultSet = preparedStatement.executeQuery();
      /*
        while (resultSet.next()) {
            JdbcApplication.Member member = new JdbcApplication.Member(
                    resultSet.getLong("id"),
                    resultSet.getString("name"),
                    resultSet.getString("email"),
                    resultSet.getInt("age"));
            System.out.println(member);
        }
*/

        connection.close();

    }
}
