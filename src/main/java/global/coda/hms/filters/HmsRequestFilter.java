package global.coda.hms.filters;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
@Component
public class HmsRequestFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("INSIDE FILTER");
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		HttpServletRequest httpRequest =(HttpServletRequest) request;
		String randomId = UUID.randomUUID().toString();
		httpRequest.setAttribute("requestId",randomId);
		httpServletResponse.setHeader("requestid", randomId);
		chain.doFilter(request, response);
	}
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void destroy() {

	}

}
