package com.byteblogs.helloblog.posts.dao;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.byteblogs.helloblog.posts.domain.vo.PostsCommentsVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 11:26 2020/4/11
 * @Modificd By;
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PostsCommentsDaoTest {

    @Autowired
    private PostsCommentsDao postsCommentsDao;

    @Test
    public void selectPostsCommentsByPostsIdList() {
        Page page = new Page(1,5);
        log.info("get data {}",postsCommentsDao.selectPostsCommentsByPostsIdList(page,2L));
    }

    @Test
    public void selectPostsCommentsList() {
        Page page = new Page(1,5);
        PostsCommentsVO postsCommentsVO=new PostsCommentsVO();
        log.info("get data {}",postsCommentsDao.selectPostsCommentsList(page,postsCommentsVO));
    }

    @Test
    public void selectPostsCommentsList1() {
    }
}