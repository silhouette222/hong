package com.board.dao;

import java.sql.SQLException;
import java.util.List;

public interface BoardDAO{

	void insertBoard(int board) throws SQLException;
	
	void deleteBoard(String board) throws SQLException;
	
	void updateBoard(String board) throws SQLException;
	
	List<String> getBoardList() throws SQLException;
}
