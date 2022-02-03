package com.song.yygh.user.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.song.yygh.user.mapper")
public class UserConfig {
}
