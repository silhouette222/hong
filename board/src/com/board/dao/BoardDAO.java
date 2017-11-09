package com.board.dao;

import java.sql.SQLException;

public interface BoardDAO{

	void insertBoard(String board) throws SQLException;
}
