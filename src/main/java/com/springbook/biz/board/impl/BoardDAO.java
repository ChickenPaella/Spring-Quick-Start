package com.springbook.biz.board.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;

@Repository("BoardDAO")
public class BoardDAO {
	@PersistenceContext
	private EntityManager em;
	
	public void insertBoard(BoardVO vo) {
		System.out.println("insertBoard() 기능 처리");
		em.persist(vo);
	}

	public void updateBoard(BoardVO vo) {
		System.out.println("updateBoard() 기능 처리");
		em.merge(vo);
	}
	
	public void deleteBoard(BoardVO vo) {
		System.out.println("deleteBoard() 기능 처리");
		em.remove(vo);
	}

	public BoardVO getBoard(BoardVO vo) {
		System.out.println("getBoard() 기능 처리");
		return em.find(BoardVO.class, vo.getSeq());
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("getBoardList() 기능 처리");
		return em.createQuery("from BoardVO b order by b.seq desc").getResultList();
	}
}