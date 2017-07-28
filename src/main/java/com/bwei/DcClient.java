package com.bwei;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by 染熙 on 2017/7/21.
 */
@FeignClient("eureka-client")
public interface DcClient  {
    @GetMapping("/dc")
    String consumer();
}
