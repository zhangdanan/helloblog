package com.byteblogs.common.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.byteblogs.common.constant.Constants;
import com.byteblogs.helloblog.auth.domain.vo.AuthUserVO;

import java.util.Date;

public class JwtUtil {

    /**
     * 生成Token
     * @param authUserVO
     * @return
     */
    public static String getToken(AuthUserVO authUserVO) {
        String sign = authUserVO.getPassword();
        return JWT.create().withExpiresAt(new Date(System.currentTimeMillis()+ Constants.EXPIRE_TIME)).withAudience(JsonUtil.toJsonString(authUserVO.setPassword(null)))
                .sign(Algorithm.HMAC256(sign));
    }
}
