package com.byteblogs.helloblog.posts.dao;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.byteblogs.common.base.dao.BaseDao;
import com.byteblogs.helloblog.posts.domain.po.PostsComments;
import com.byteblogs.helloblog.posts.domain.vo.PostsCommentsVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 评论表 Mapper 接口
 * </p>
 */

@Repository
public interface PostsCommentsDao extends BaseDao<PostsComments> {

    /**
     * 查询评论列表
     * @param page
     * @param postsId
     * @return
     */
    List<PostsCommentsVO> selectPostsCommentsByPostsIdList(Page<PostsCommentsVO> page, @Param("postsId") Long postsId);

    /**
     * 查询评论后台评论管理列表
     */
    List<PostsCommentsVO> selectPostsCommentsList(Page<PostsCommentsVO> page, @Param("postsComments") PostsCommentsVO postsCommentsVO);
    List<PostsCommentsVO> selectPostsCommentsList(@Param("postsComments") PostsCommentsVO postsCommentsVO);
}
