package com.jyq.utils;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import javax.sql.DataSource;
@Configuration
@MapperScan(basePackages = "com.jyq.dao.oracle",sqlSessionFactoryRef = "OracleSqlSessionFactory")
public class OracleDataSourceConfig {
    //@Primary // 表示这个数据源是默认数据源, 这个注解必须要加，因为不加的话spring将分不清楚那个为主数据源（默认数据源）////
    @Bean("OracleDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.oracle")
    // 读取application.yml中的配置参数映射成为一个对象
    public DataSource getOracleDataSource() {
        return DataSourceBuilder.create().build();
    }

   //@Primary
   @Bean("OracleSqlSessionFactory")
   public SqlSessionFactory OracleSqlSessionFactory(@Qualifier("OracleDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        // mapper的xml形式文件位置必须要配置，不然将报错：no statement （这种错误也可能是mapper的xml中，namespace与项目的路径不一致导致）
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:com/jyq/dao/oracle/*.xml"));
        // 持久化.xml文件的地址
       return bean.getObject();
    }
    //@Primary
    @Bean("OracleSqlSessionTemplate")
    public SqlSessionTemplate OracleSqlSessionTemplate(@Qualifier("OracleSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}