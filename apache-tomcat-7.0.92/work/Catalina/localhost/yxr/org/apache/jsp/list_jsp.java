/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.92
 * Generated at: 2019-01-04 09:37:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.Bookbean;
import java.sql.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html> \r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>书店</title>\r\n");
      out.write("<SCRIPT language=\"JavaScript\">\r\n");
      out.write("\r\n");
      out.write("function openwin(str)\r\n");
      out.write("{\t\r\n");
      out.write("\twindow.open(\"addcart.jsp?isbn=\"+str,  \r\n");
      out.write("\t\"shoppingcart\",\"width=300,height=200,resizable=1,scrollbars=2\");\r\n");
      out.write("\treturn;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("<style>\r\n");
      out.write("\t.img{\r\n");
      out.write("\t\theight:650px;\r\n");
      out.write("\t\tbackground-image:url(5.jpg) ;\r\n");
      out.write("\t\tbackground-size:100% 100%;\r\n");
      out.write("\t\tbackground-repeat:no-repeat\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"img\">\r\n");
      out.write("\t<h1 align=\"center\">网上书店</h1>\r\n");
      out.write("\t");
      bean.Bookbean book = null;
      book = (bean.Bookbean) _jspx_page_context.getAttribute("book", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (book == null){
        book = new bean.Bookbean();
        _jspx_page_context.setAttribute("book", book, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<table width=\"100%\" border=\"1\" cellspacing=\"0\" bordercolor=\"#9999FF\">\r\n");
      out.write("\t\t<tr> \r\n");
      out.write("\t\t\t<td><font color=\"#3333FF\">书名</font></td>\r\n");
      out.write("\t\t\t<td><font color=\"#3333FF\">作者</font></td>\r\n");
      out.write("\t\t\t<td><font color=\"#3333FF\">出版社</font></td>\r\n");
      out.write("\t\t\t<td><font color=\"#3333FF\">定价</font></td>\r\n");
      out.write("\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");

			ResultSet rs = book.getBookList();
			while(rs.next()){
				String ISBN = rs.getString("bookISBN");
		
      out.write(" \r\n");
      out.write("\t\t<tr> \r\n");
      out.write("\t\t\t<td><a href=\"bookinfo.jsp?isbn=");
      out.print( ISBN);
      out.write('"');
      out.write('>');
      out.print( rs.getString("bookName"));
      out.write("</A></td>\r\n");
      out.write("\t\t\t<td>");
      out.print( rs.getString("bookAuthor"));
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( rs.getString("publisher"));
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( rs.getString("price"));
      out.write("</td>\r\n");
      out.write("\t\t\t<td><a href='Javascript:openwin(\"");
      out.print( ISBN );
      out.write("\")'>加入购物车</a></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");

		   }   
		
      out.write(" \r\n");
      out.write("\t</table>  \r\n");
      out.write("\t<br><br><br>\r\n");
      out.write("\t<p align=\"center\"><a href=\"shoppingcart.jsp\"><font color=\"#0000FF\" >查看购物车</font></a></p>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}