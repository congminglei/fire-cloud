package cn.fire.user.feign;

import cn.fire.common.web.config.FeignConfig;
import cn.fire.user.api.client.UserFeignClient;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author: wangzc
 * @Date: 2020/7/31 11:44
 */

@FeignClient(name = "${fire.producer-name.user:}",contextId = "userServiceFeign",configuration = FeignConfig.class)
public interface UserServiceFeign extends UserFeignClient {
}
