package com.app.myspring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class MySecurityDataBaseConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public DataSource getDataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setUsername("root");
        ds.setPassword("11111111");
        ds.setUrl("jdbc:mysql://localhost:3307/spring_security?useSSL=false");
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        return ds;
    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().
                usersByUsernameQuery("SELECT username, password, active FROM user_role where username=?")
                .authoritiesByUsernameQuery("SELECT username, role FROM user_role where username=?")
                .dataSource(getDataSource());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/PermitAllEndpoint").permitAll()
                .antMatchers("/ProtectedEndpoint").hasAuthority("ADMIN")
                // .antMatchers("/api/user").hasAuthority("USER")
                // .antMatchers("/api/user-admin").hasAnyAuthority("USER", "ADMIN")
                .anyRequest()
                .authenticated().and().csrf().disable().formLogin();
    }


    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/OpenEndpoint");
    }

}

