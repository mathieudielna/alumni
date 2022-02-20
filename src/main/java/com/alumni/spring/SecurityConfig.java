package com.alumni.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Qualifier("utilisateurDetailsServiceImpl")
    @Autowired
    private UserDetailsService userDetailsService;
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
        // authentication manager (see below)
        auth.inMemoryAuthentication()
                .withUser("user1").password(bCryptPasswordEncoder().encode("user1Pass")).roles("USER")
                .and()
                .withUser("user2").password(bCryptPasswordEncoder().encode("user2Pass")).roles("USER")
                .and()
                .withUser("admin").password(bCryptPasswordEncoder().encode("adminPass")).roles("ADMIN");
        auth.
                userDetailsService(userDetailsService).
                passwordEncoder(bCryptPasswordEncoder());
    }

    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        // http builder configurations for authorize requests and form login (see below)
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/admin**").hasAuthority("ROLE_ADMIN")
                .antMatchers("/anonymous**").anonymous()
                .antMatchers("/js/**", "/css/**", "/demo", "/", "/connexion", "/inscription", "/ajoutuser", "/info").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/connexion").loginProcessingUrl("/connexion").failureUrl("/connexion?error=true")
                .usernameParameter("login").passwordParameter("password").permitAll()
                    .defaultSuccessUrl("/validinscription", true)
                    .and()
                .logout()
                .logoutUrl("/deconnexion").logoutSuccessUrl("/connexion?logout")
                .deleteCookies("JSESSIONID");
    }

    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

}
