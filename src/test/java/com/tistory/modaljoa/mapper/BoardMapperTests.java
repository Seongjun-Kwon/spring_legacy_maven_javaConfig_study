package com.tistory.modaljoa.mapper;

import com.tistory.modaljoa.domain.BoardVO;
import com.tistory.modaljoa.domain.Criteria;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {com.tistory.modaljoa.config.RootConfig.class})
@Log4j
public class BoardMapperTests {

    @Setter(onMethod = @__({@Autowired}))
    private BoardMapper mapper;

    @Test
    public void testGetList() {

        for (BoardVO board : mapper.getList()) {
            log.info(board);
        }
    }

    @Test
    public void testPaging() {

        Criteria cri = new Criteria();
        cri.setPageNum(3);
        cri.setAmount(10);

        List<BoardVO> list = mapper.getListWithPaging(cri);

        for (BoardVO board : list) {
            log.info(board);
        }
    }
}
