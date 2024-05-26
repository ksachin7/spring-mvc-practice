package com.example.springmvc.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Enables Spring's annotation-driven transaction management capability.
 */
@EnableTransactionManagement

/**
 * Indicates that this class contains Spring configuration.
 */
@Configuration
public class PersistenceConfig {

    /**
     * Defines the DataSource bean, which provides database connection information.
     *
     * @return a DriverManagerDataSource object configured with MySQL database connection details.
     */
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/springmvc");
        dataSource.setUsername("root");
        dataSource.setPassword("mysqls01)");
        return dataSource;
    }

    /**
     * Defines the LocalSessionFactoryBean bean, which sets up a Hibernate SessionFactory.
     *
     * @return a LocalSessionFactoryBean object configured with the data source and Hibernate properties.
     */
    @Bean
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan("com.example.springmvc.model");
        sessionFactory.setHibernateProperties(hibernateProperties());
        return sessionFactory;
    }

    /**
     * Defines the HibernateTransactionManager bean, which manages transaction boundaries.
     *
     * @return a HibernateTransactionManager object configured with the SessionFactory.
     */
    @Bean
    public HibernateTransactionManager transactionManager() {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactory().getObject());
        return transactionManager;
    }

    /**
     * Sets Hibernate properties for the SessionFactory.
     *
     * @return a Properties object with Hibernate configurations.
     */
    private Properties hibernateProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect"); // Specifies the SQL dialect for MySQL.
        properties.put("hibernate.show_sql", "true"); // Enables logging of SQL statements.
        properties.put("hibernate.use_sql_comments", "true"); // Enables SQL comments.
        properties.put("hibernate.format_sql", "true"); // Formats the SQL statements.
        properties.put("hibernate.hbm2ddl.auto", "create"); // Automatically creates the database schema.
//        properties.put("hibernate.connection.provider_disables_autocommit", "true"); // Disables autocommit for connections.
        properties.put("hibernate.generate_statistics", "true"); // Enables the generation of statistics.
        properties.put("hibernate.type", "trace"); // Enables detailed logging of type handling.
        return properties;
    }
}
