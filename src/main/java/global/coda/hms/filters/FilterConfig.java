//package global.coda.hms.filters;
//
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@ConfigurationProperties(prefix = "config.slf4jfilter")
//public class FilterConfig {
//
//
//	@Bean
//	public FilterRegistrationBean<SimpleFilter> servletRegistrationBean() {
//		final FilterRegistrationBean<SimpleFilter> registrationBean = new FilterRegistrationBean<SimpleFilter>();
//		final SimpleFilter log4jMDCFilterFilter = new SimpleFilter("Response_Token", "Slf4jMDCFilter.UUID",null);
//		registrationBean.setFilter(log4jMDCFilterFilter);
//		registrationBean.setOrder(2);
//		return registrationBean;
//	}
//}
