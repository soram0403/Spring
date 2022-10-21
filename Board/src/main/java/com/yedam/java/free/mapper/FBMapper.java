package com.yedam.java.free.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.java.free.service.FBVO;

public interface FBMapper {
	// 전체 조회
	public List<FBVO> getBoardList();
	// 단건 조회 (검색 조건)
	public FBVO getBoardInfo(FBVO fbVO);
	// 등록
	public int insertBoard(FBVO fbVO);
	// 수정
	public int updateBoard(FBVO fbVO);
	// 삭제
	public int deleteBoard(@Param("bno") int boardNo);

	// 입력될 게시글 번호 조회
	public FBVO getBoardNo();
}
