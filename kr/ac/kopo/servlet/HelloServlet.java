package kr.ac.kopo.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class HelloServlet extends HttpServlet {
	
   @Override
   public void init(ServletConfig config) throws ServletException{ // init메소드 (최초 한 번 실행)
      System.out.println("최초 한 번만 실행되는 메소드입니다.");
   }

   @Override
   public void service(ServletRequest request, ServletResponse response)	 // 요청과 응답을 처리하는 service메소드
	   	throws IOException, ServletException{
	   		System.out.println("미희야 결혼하자");
	   	}

	@Override
	public void destroy() {
		
	}
}