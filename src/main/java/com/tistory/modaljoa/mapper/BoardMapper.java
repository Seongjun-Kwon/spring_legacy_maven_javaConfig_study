package com.tistory.modaljoa.mapper;

import com.tistory.modaljoa.domain.BoardVO;
import com.tistory.modaljoa.domain.Criteria;

import java.util.List;

public interface BoardMapper {

//    @Select("SELECT * FROM tbl_board WHERE bno > 0")
    public List<BoardVO> getList();

    public List<BoardVO> getListWithPaging(Criteria cri);

    public void insert(BoardVO board);

    public void insertSelectKey(BoardVO board);

    public BoardVO read(Long bno);

    public int delete(Long bno);

    public int update(BoardVO board);

    public int getTotalCount(Criteria cri);
}
