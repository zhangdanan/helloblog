package com.byteblogs.helloblog.auth.domain.vo;

import lombok.Data;
import lombok.experimental.Accessors;


@Data
@Accessors(chain = true)
public class GithubVO {
    private String login;
    private String avatar_url;
    private String email;
    private String name;
    private String html_url;

}
