package https.github.com.Wellingtonjose.produtosapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProdutosapiApplication {
	
	@GetMapping("/helloworld")
	public String hello() {
		return "Hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(ProdutosapiApplication.class, args);
	}

}
