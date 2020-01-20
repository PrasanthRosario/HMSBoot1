package global.coda.hms;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/**
 * To start Servlet.
 * @author VC
 *
 */
public class ServletInitializer extends SpringBootServletInitializer {
	/**
	 * Application Builder.
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HmsBootApplication.class);
	}
}


