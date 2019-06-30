package is.yyx;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import is.yyx.model.DataResponse;
import is.yyx.model.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Type;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class ApplicationTest {

    @Test
    public void jsonParse() throws Exception {
        DataResponse<UserDTO> response = new DataResponse<>();
        UserDTO userDTO = new UserDTO();
        userDTO.setName("123");
        response.setErrorCode(0);
        response.setData(userDTO);
        log.info(response.toString());
        String json = JSON.toJSONString(response);
        log.info(json);
        Type type = new TypeReference<DataResponse<UserDTO>>(){}.getType();
        DataResponse response1 = JSON.parseObject(json, type);
        log.info(response1.toString());
    }
}
