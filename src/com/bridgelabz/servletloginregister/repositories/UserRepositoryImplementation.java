package com.bridgelabz.servletloginregister.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bridgelabz.servletloginservlet.model.User;


public class UserRepositoryImplementation implements UserRepository {

	public Connection getConnection() {
		Connection connection = null;

		String url = "jdbc:mysql://localhost:3306/user_database?user=root&password=root";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			connection = DriverManager.getConnection(url);
			
		} catch (Exception e) {
			System.out.println("failed to establish connection");
		}
		return connection;
	}

	public void closeconnection(Connection connection, PreparedStatement preparesStmt, ResultSet rs) {
		if (rs != null) {
			try {
				preparesStmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (preparesStmt != null) {
			try {
				preparesStmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}

	public void registerUser(User user) throws SQLException {
		ResultSet resultset = null;
		Connection connection = getConnection();
		PreparedStatement preparesStmt = null;
		String str = "insert into user1 values(?,?,?,?,?)";
		preparesStmt = getConnection().prepareStatement(str);
		preparesStmt.setInt(1, 1);
		preparesStmt.setString(2, user.getUsername());
		preparesStmt.setString(3, user.getEmail());
		preparesStmt.setString(4, user.getPhone());
		preparesStmt.setString(5, user.getPassward());
		preparesStmt.executeUpdate();
		closeconnection(connection, preparesStmt, resultset);

	}

	@Override
	public User getUserByUserName(String username) {
		Connection connection=null;
		PreparedStatement preparesStm = null;
		ResultSet resultset = null;
		User user = new User();
		try {
			String query = "select * from user where username=?";
			preparesStm = getConnection().prepareStatement(query);
			preparesStm.setString(1, username);
			resultset = preparesStm.executeQuery();
			if (resultset.next()) {
				user.setUsername(resultset.getString(1));
				user.setPassward(resultset.getString(4));
               closeconnection(connection, preparesStm, resultset);
				return user;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}



	
	
}
