package com.itwillbs.service;

import java.util.List;

import com.itwillbs.dao.PageDTO;
import com.itwillbs.domain.BoardDTO;

public interface BoardService {

	//추상메서드
	void insertBoard(BoardDTO boardDTO);

	List<BoardDTO> getBoardList(PageDTO pageDTO);

	int getBoardCount();

	BoardDTO getBoard(int num);
	
//	BoardDTO boardDTO2 = boardService.numCheck(boardDTO);
	BoardDTO numCheck(BoardDTO boardDTO);
	
//	boardService.updateBoard(boardDTO);
	void updateBoard(BoardDTO boardDTO);

	void deleteBoard(BoardDTO boardDTO);
	
	
}
