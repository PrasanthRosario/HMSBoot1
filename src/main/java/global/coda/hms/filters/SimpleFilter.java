//package global.coda.hms.filters;
//
//import java.util.UUID;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.slf4j.MDC;
//import org.springframework.stereotype.Component;
////@Component
////public class SimpleFilter implements Filter {
////
////	@Override
////	public void destroy() {}
////	@Override
////	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
////			throws IOException, ServletException {
////		System.out.println("Remote Host:"+request.getRemoteHost());
////		System.out.println("Remote Address:"+request.getRemoteAddr());
////		System.out.println("FILTER IS ON");
////		chain.doFilter(request, response);
////
////
////	}
////	@Override
////	public void init(FilterConfig filterconfig) throws ServletException {}
////
////}
//import org.springframework.util.StringUtils;
//import org.springframework.web.filter.OncePerRequestFilter;
////
////@Data
////@EqualsAndHashCode(callSuper = false)
//@Component
//public class SimpleFilter extends OncePerRequestFilter {
//
//	private final String responseHeader;
//	private final String mdcTokenKey ;
//	private final String requestHeader ;
//	public SimpleFilter(String responseHeader2, String mdcTokenKey2, String requestHeader2) {
//		this.responseHeader = responseHeader2;
//		this.mdcTokenKey = mdcTokenKey2;
//		this.requestHeader = requestHeader2;
//
//	}
//	@Override
//	protected void doFilterInternal(final HttpServletRequest request, final HttpServletResponse response, final FilterChain chain)
//			throws java.io.IOException, ServletException {
//		try {
//			final String token;
//			if (!StringUtils.isEmpty(requestHeader) && !StringUtils.isEmpty(request.getHeader(requestHeader))) {
//				token = request.getHeader(requestHeader);
//			} else {
//				token = UUID.randomUUID().toString().toUpperCase().replace("-", "");
//			}
//			MDC.put(mdcTokenKey, token);
//			if (!StringUtils.isEmpty(responseHeader)) {
//				response.addHeader(responseHeader, token);
//			}
//			chain.doFilter(request, response);
//		} finally {
//			MDC.remove(mdcTokenKey);
//		}
//	}
//}