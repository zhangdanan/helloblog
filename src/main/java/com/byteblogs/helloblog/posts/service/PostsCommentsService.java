package com.byteblogs.helloblog.posts.service;

import com.byteblogs.common.base.domain.Result;
import com.byteblogs.common.base.service.BaseService;
import com.byteblogs.helloblog.posts.domain.po.PostsComments;
import com.byteblogs.helloblog.posts.domain.vo.PostsCommentsVO;

/**
 * <p>
 * 评论表 服务类
 * </p>
 */
public interface PostsCommentsService extends BaseService<PostsComments> {

    /**
     * 新增评论
     */
    Result savePostsComments(PostsCommentsVO postsCommentsVO);

    /**
     * 根据文章的主键查询评论列表
     */
    Result getPostsCommentsByPostsIdList(PostsCommentsVO postsCommentsVO);

    /**
     * 查询评论列表
     */
    Result getPostsCommentsList(PostsCommentsVO postsCommentsVO);

    /**
     * 删除评论
     */
    Result deletePostsComments(Long id);


    Result getPostsComment(Long id);

    Result replyComments(PostsCommentsVO postsCommentsVO);

}
