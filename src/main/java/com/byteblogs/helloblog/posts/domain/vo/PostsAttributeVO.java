package com.byteblogs.helloblog.posts.domain.vo;

import lombok.Data;
import lombok.experimental.Accessors;


@Data
@Accessors(chain = true)
public class PostsAttributeVO {

    private Long id;

    private String content;

}
