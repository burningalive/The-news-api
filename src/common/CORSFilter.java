package common;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;


/**
 * 解决Rest接口调用过程中，跨域访问问题
 * @author 刘彦亮
 * @version 1.0
 */
public class CORSFilter implements Filter {
 public CORSFilter() {
 }


 public void doFilter(ServletRequest request, ServletResponse response,
 FilterChain chain) throws IOException, ServletException {


 HttpServletResponse httpServletResponse = (HttpServletResponse) response;


 httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");


 httpServletResponse
 .setHeader(
 "Access-Control-Allow-Headers",
 "User-Agent,Origin,Cache-Control,Content-type,Date,Server,withCredentials,AccessToken");


 httpServletResponse.setHeader("Access-Control-Allow-Credentials",
 "true");


 httpServletResponse.setHeader("Access-Control-Allow-Methods",
 "GET, POST, PUT, DELETE, OPTIONS, HEAD");


 httpServletResponse.setHeader("Access-Control-Max-Age", "1209600");


 httpServletResponse.setHeader("Access-Control-Expose-Headers",
 "accesstoken");


 httpServletResponse.setHeader("Access-Control-Request-Headers",
 "accesstoken");


 httpServletResponse.setHeader("Expires", "-1");


 httpServletResponse.setHeader("Cache-Control", "no-cache");


 httpServletResponse.setHeader("pragma", "no-cache");


 chain.doFilter(request, response);


 }


 public void init(FilterConfig fConfig) throws ServletException {


 }


 public void destroy() {
 }


}