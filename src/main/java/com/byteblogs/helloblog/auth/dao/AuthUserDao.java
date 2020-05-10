package com.byteblogs.helloblog.auth.dao;

import com.byteblogs.common.base.dao.BaseDao;
import com.byteblogs.helloblog.auth.domain.po.AuthUser;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *

 */
public interface AuthUserDao extends BaseDao<AuthUser> {

    String selectAvatar();
    AuthUser selectAdmin();

}
