package com.byteblogs.helloblog.posts.domain.vo;

import lombok.Data;
import lombok.experimental.Accessors;
import us.codecraft.webmagic.model.annotation.ExtractBy;

import java.util.List;



@Data
@Accessors(chain = true)
public class JueJinVO {

    @ExtractBy("//*[@id='juejin']/div[2]/main/div/div[1]/article/h1/text()")
    private String title;

    @ExtractBy("//*[@class='article-content']")
    private List<String> content;

}
