package is.yyx.service.impl;

import is.yyx.dao.UserInfoDao;
import is.yyx.entity.UserInfo;
import is.yyx.enums.RestStatus;
import is.yyx.exception.RestAssert;
import is.yyx.service.RoleService;
import is.yyx.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private final RoleService roleService;
    private final UserInfoDao userInfoDao;

    @Autowired
    public UserServiceImpl(RoleService roleService, UserInfoDao userInfoDao) {
        this.roleService = roleService;
        this.userInfoDao = userInfoDao;
    }

    @Override
    public UserInfo get(Long id) {
        RestAssert.notNull(id, RestStatus.USER_PARAM_ID_IS_NULL);

        UserInfo userInfo = userInfoDao.findById(id);
        RestAssert.notNull(userInfo, RestStatus.USER_STATE_ID_NOT_FOUND, id);
        return null;
    }

    @Override
    public List<UserInfo> list() {
        return null;
    }

    @Override
    public UserInfo create(UserInfo userInfo) {
        return null;
    }

    @Override
    public UserInfo update(UserInfo userInfo) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void changePassword(String username, String oldPassword, String newPassword) {

    }
}
