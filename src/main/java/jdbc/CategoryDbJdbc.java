package jdbc;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import java.sql.*;

@Repository
public class CategoryDbJdbc implements CategoryDbInterface{
    @Value( "${spring.datasource.url}" )
    private String jdbcUrl;

    @Value( "${spring.datasource.username}" )
    private String userDb;

    @Value( "${spring.datasource.password}" )
    private String passwordDb;

    @Override
    public Category findById(long id) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(
                    jdbcUrl, userDb, passwordDb);
            statement = connection.prepareStatement(
                    "select CategoryID, Name from Categories where CategoryID=?");
            statement.setLong(1, id);
            resultSet = statement.executeQuery();
            Category category = null;
            if (resultSet.next()) {
                category = new Category(
                        (long)resultSet.getInt("CategoryID"),
                        resultSet.getString("Name"));
            }
            return category;
        } catch (SQLException e) {
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                }
            }
        }
        return null;
    }
}
