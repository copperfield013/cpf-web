package cn.sowell.copframe.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.session.InvalidSessionStrategy;

public class CpfInvalidSessionStrategy implements InvalidSessionStrategy{

	private final RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
	
	final static Logger logger = Logger.getLogger(CpfInvalidSessionStrategy.class);
	
	public CpfInvalidSessionStrategy() {
		logger.error("构造Session过期拦截策略对象");
	}
	
	@Override
	public void onInvalidSessionDetected(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		String requestCategory = request.getHeader("request-category");
		if("cpf-ajax".equals(requestCategory)){
			response.setHeader("cpf-session-status", "invalid");
		}else{
			redirectStrategy.sendRedirect(request, response, "/admin/login");
		}
	}

}
