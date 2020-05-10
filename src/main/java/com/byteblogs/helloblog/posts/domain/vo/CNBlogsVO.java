package com.byteblogs.helloblog.posts.domain.vo;

import lombok.Data;
import lombok.experimental.Accessors;
import us.codecraft.webmagic.model.annotation.ExtractBy;

import java.util.List;


@Data
@Accessors(chain = true)
public class CNBlogsVO {

    @ExtractBy("//*[@id=\"cb_post_title_url\"]/text()")
    private String title;

    @ExtractBy("//*[@id=\"cnblogs_post_body\"]")
    private List<String> content;
}
