package global.coda.hms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Main Application.
 * @author VC
 *
 */
@SpringBootApplication
@MapperScan("global.coda.hms")
public  class HmsBootApplication {

	/**
	 * Main Function.
	 * @param args arguments
	 */
	public static void main(String[] args) {

		SpringApplication.run(HmsBootApplication.class, args);
	}

}


