package com.example.demotransaction;

import com.example.demotransaction.model.Student;
import com.example.demotransaction.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.scheduling.annotation.EnableAsync;

import javax.transaction.Transactional;
import java.util.Arrays;

@SpringBootApplication
@EnableAsync
@EnableCaching
public class DemoTransactionApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(DemoTransactionApplication.class, args);

	}
}
