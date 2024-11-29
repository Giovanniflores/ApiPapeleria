package camrod.papeleriaboli.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    protected OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info().title("API de Papelería Boli")
                            .description("Documentación de la API para el proyecto Papelería Boli")
                            .version("1.0")
                            .contact(new Contact().name("Giovanni Flores").email("gio082015@gmail.com")))
            .externalDocs(new ExternalDocumentation()
                            .description("Documentación Externa")
                            .url("https://example.com"));
    }
}
