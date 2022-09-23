package Test5_23rdSeptember;

import java.sql.*;

public class JDBCTest {
    Connection connection;
    Statement statement;
    ResultSet resultSet;


    void create() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "varansi2011");
        statement = connection.createStatement();
        String query = "CREATE TABLE Teacher(id int , firstName varchar(20), lastName varchar(25), salary int, flatNo varchar(10)," +
                "HouseName varchar(90), pincode int, city varchar(1000),primary key(id));";
        statement.execute(query);

    }
    void insert() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "varansi2011");
        statement = connection.createStatement();
        statement.execute(" INSERT into Teacher values(1,'Aman','Agrawal',10000,'D64','Aman house',221010,'Varanasi')");
//        statement.execute(" INSERT into Teacher values(2,'Ramesh','Pawar',23546,'S76','Ramesh House',23433,'Mumbai')");
//        statement.execute(" INSERT into Teacher values(4,'Aarti','RT',244544,'K87','Aarti House',45453,'Pune')");
//        statement.execute(" INSERT into Teacher values(3,'Rahul','pandey',35444,'G65','Rahul house',45432,'Delhi');");
    }
    void update() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "varansi2011");
        statement = connection.createStatement();
        String query3="UPDATE TEACHER set salary=salary+5000 ";
        statement.execute(query3);
    }
    void delete() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "varansi2011");
        statement = connection.createStatement();
        String query4=" Delete  from teacher where id=1;";
        statement.execute(query4);
    }
    void SortByLastName() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "varansi2011");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("Select * from teacher Order By lastName desc");
        while (resultSet.next()) {
            System.out.println((" Id " + resultSet.getInt(1) + " FirstName " + resultSet.getString(2) + " Lastname "
                    + resultSet.getString(3) + " salary " + resultSet.getInt(4) +
                    " flatNo " + resultSet.getString(5) + " HouseName " + resultSet.getString(6) +
                    "pincode" + resultSet.getInt(7) + "city" + resultSet.getString(8)));
        }

    }
    void specificDisplay() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "varansi2011");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from teacher where salary>=10000 && city='Varanasi';");
        while (resultSet.next())
        {
            System.out.println((" Id " + resultSet.getInt(1) + " FirstName " + resultSet.getString(2) + " Lastname "
                    + resultSet.getString(3) + " salary " + resultSet.getInt(4) +
                    " flatNo " + resultSet.getString(5) + " HouseName " + resultSet.getString(6) +
                    "pincode" + resultSet.getInt(7) + "city" + resultSet.getString(8)));
        }
    }
}

