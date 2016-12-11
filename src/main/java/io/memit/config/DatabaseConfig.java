package io.memit.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.memit.model.IdentifiableByLongEntity;

@Configuration
@EnableJpaRepositories
@EntityScan(basePackageClasses = IdentifiableByLongEntity.class)
public class DatabaseConfig {

//	@Bean
//	public DataSource dataSource(Environment env){
//		HikariDataSource ds = new HikariDataSource();
//		ds.setPassword(env.get);
//		return ds;
//	}
}
