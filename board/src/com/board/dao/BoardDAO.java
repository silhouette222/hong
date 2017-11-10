package com.board.dao;

import java.sql.SQLException;

public interface BoardDAO{

	void insertBoard(int board) throws SQLException;
	
	void deleteBoard(String board) throws SQLException;
	
	void updateBoard(String board) throws SQLException;
}
