package is.yyx.dao;

import is.yyx.entity.UserInfo;
import org.springframework.data.repository.Repository;

import javax.transaction.Transactional;
import java.util.List;

public interface UserInfoDao extends Repository<UserInfo, Long> {

    UserInfo findById(Long id);

    List<UserInfo> findAll();

    UserInfo findByUsername(String username);

    @Transactional
    UserInfo save(UserInfo userInfo);

    @Transactional
    void deleteById(Long id);

}
