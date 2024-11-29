package camrod.papeleriaboli.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults; // Importación para withDefaults()
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig {

    @Bean
    protected  SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
            .csrf(csrf -> csrf.disable())  // Desactivar CSRF
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/productos/**").authenticated()
                .anyRequest().permitAll()
            )
            .httpBasic(withDefaults())  // Configurar autenticación básica
            .build();
    }
    

    @Bean
    protected UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
        UserDetails user = User.builder()
                .username("papeleriaboli")
                .password(passwordEncoder.encode("losrorosmandan"))  // Codifica la contraseña
                .roles("admin")
                .build();
        return new InMemoryUserDetailsManager(user);
    }

    @Bean
    protected PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();  // Codificador de contraseña seguro
    }
}