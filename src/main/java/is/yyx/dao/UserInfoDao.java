package is.yyx.dao;

import is.yyx.entity.UserInfo;
import org.springframework.data.repository.Repository;

public interface UserInfoDao extends Repository<UserInfo, Long> {
    
}
