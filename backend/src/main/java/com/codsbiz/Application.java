package com.codsbiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    public DataSource dataSource() {
//        SQLServerDataSource dataSource = new SQLServerDataSource();
//        dataSource.setUser("java");
//        dataSource.setPassword("javapass");
//        dataSource.setServerName("localhost");
//        dataSource.setDatabaseName("WritersBlock");
//        dataSource.setTrustServerCertificate(true);
//        dataSource.setEncrypt(true);
//        return dataSource;
//    }
}
