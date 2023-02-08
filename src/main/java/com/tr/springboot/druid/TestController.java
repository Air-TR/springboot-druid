package com.tr.springboot.druid;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author taorun
 * @date 2023/2/8 11:28
 */
@RestController
public class TestController {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/user/count")
    public Integer userCount() {
        return jdbcTemplate.queryForObject("select count(*) from user", Integer.class);
    }

    @GetMapping("/user/all")
    public List<Map<String, Object>> userAll() {
        return jdbcTemplate.queryForList("select * from user");
    }

}
