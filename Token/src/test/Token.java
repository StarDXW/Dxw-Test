package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/token")
public class Token extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String token1=(String) req.getSession().getAttribute("token");
	String token2=req.getParameter("token");
	if (token2==null||token1==null||!token1.equals(token2)) {
		throw new RuntimeException("÷ÿ∏¥Ã·Ωª");
	}else {
		req.getSession().removeAttribute("token");
	}
}
}
