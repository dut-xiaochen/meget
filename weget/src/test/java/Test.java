
import com.kuaidian.weget.tool.BilibiliTools;
import com.kuaidian.weget.tool.RedisTools;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

/**
 * Created by Alan on 15/8/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml", "classpath:spring-mvc.xml"})
public class Test {
    private BilibiliTools bilibiliTools;

    @Autowired
    public void setBilibiliTools(BilibiliTools bilibiliTools) {
        this.bilibiliTools = bilibiliTools;
    }

    @org.junit.Test
    public void testGetRealUrl() {
        String url = "http://www.bilibili.com/video/av8073247";
        String url2 = "http://www.bilibili.com/video/av4672381/";
        String url3 = "http://www.bilibili.com/video/av4672381/index_2";

        try {
            List<Map> result1 = bilibiliTools.getRealkUrlByUrl(url);
            List<Map> result2 = bilibiliTools.getRealkUrlByUrl(url2);
            List<Map> result3 = bilibiliTools.getRealkUrlByUrl(url3);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
    @org.junit.Test
    public void testRedis() {
        RedisTools.getRedisClient().sAdd("1", "111");
    }
}
