package com.itwillbs.dao;

import java.util.List;

import com.itwillbs.domain.BoardDTO;

public interface BoardDAO {
	//추상메서드
	void insertBoard(BoardDTO boardDTO);
	
	Integer getMaxNum();

	List<BoardDTO> getBoardList(PageDTO pageDTO);

	int getBoardCount();

	BoardDTO getBoard(int num);

	BoardDTO numCheck(BoardDTO boardDTO);

	void updateBoard(BoardDTO boardDTO);

	void deleteBoard(BoardDTO boardDTO);
	
}
