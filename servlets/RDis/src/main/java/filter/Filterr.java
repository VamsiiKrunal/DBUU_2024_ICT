package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;


@WebFilter("/firstservlet")
public class Filterr implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String originalUser = (String) httpRequest.getAttribute("user");
        String modifiedUser = "value modified int filter" + originalUser;

        // Set the modified user attribute back into the request
        request.setAttribute("user", modifiedUser);

        // Forward the request to SecondServlet after modification
        RequestDispatcher dispatcher = httpRequest.getRequestDispatcher("/secondservlet");
        dispatcher.forward(request, response);
        
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

		
}
