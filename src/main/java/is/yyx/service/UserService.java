package is.yyx.service;

import is.yyx.entity.UserInfo;

import java.util.List;

public interface UserService {

    UserInfo get(Long id);

    List<UserInfo> list();

    UserInfo create(UserInfo userInfo);

    UserInfo update(UserInfo userInfo);

    void delete(Long id);

    void changePassword(String username, String oldPassword, String newPassword);

}
