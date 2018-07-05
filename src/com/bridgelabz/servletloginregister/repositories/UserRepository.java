package com.bridgelabz.servletloginregister.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bridgelabz.servletloginservlet.model.User;


public interface UserRepository {
	public Connection getConnection();
	public void closeconnection(Connection connection, PreparedStatement preparesStmt, ResultSet rs);
	public void registerUser(User user) throws SQLException;
	public User getUserByUserName(String username);

}
