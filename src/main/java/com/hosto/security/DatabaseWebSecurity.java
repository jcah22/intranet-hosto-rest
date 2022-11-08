package com.hosto.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class DatabaseWebSecurity extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {

        String consulta = "select username ,password ,status from usuario where username=?";
        String consulta2 = "select u.username , p.perfil from usuario u join perfil p on u.id_usuario = p.id where u.username=?";

        auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery(consulta)
                .authoritiesByUsernameQuery(consulta2);
    }

}
