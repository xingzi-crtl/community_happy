package com.comm.community_happy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.comm.community_happy.mapper")
@SpringBootApplication
public class CommunityHappyApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommunityHappyApplication.class, args);
    }

}
