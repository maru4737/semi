/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.73
 * Generated at: 2021-12-07 06:43:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.kh.f_board.model.vo.*;
import java.util.ArrayList;

public final class boardDetailView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/views/board/../common/header1.jsp", Long.valueOf(1638453265444L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("com.kh.f_board.model.vo");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

Board b = (Board) request.getAttribute("b");

int m = (int) request.getAttribute("m");

Attachment at = (Attachment) request.getAttribute("at");

ArrayList<Attachment> list = (ArrayList<Attachment>)request.getAttribute("list");


      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>자유게시판</title>\r\n");
      out.write("<!-- Latest compiled and minified CSS -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery library -->\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Popper JS -->\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled JavaScript -->\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".wrap {\r\n");
      out.write("	width: 1200px;\r\n");
      out.write("	margin: 0px auto;\r\n");
      out.write("	position: relative\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#header {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: 200px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#board-side {\r\n");
      out.write("	float: left;\r\n");
      out.write("	width: 20%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#board-title {\r\n");
      out.write("	width: 200px;\r\n");
      out.write("	height: 200px;\r\n");
      out.write("	background: green;\r\n");
      out.write("	font-size: 25px;\r\n");
      out.write("	font-display: none;\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	color: white;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	display: table-cell;\r\n");
      out.write("	vertical-align: middle;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#board-center {\r\n");
      out.write("	float: left;\r\n");
      out.write("	padding: 30px;\r\n");
      out.write("	width: 80%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hr1 {\r\n");
      out.write("	border: 0;\r\n");
      out.write("	height: 2px;\r\n");
      out.write("	background: green;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".table-side td {\r\n");
      out.write("	border: 1px solid lightgrey;\r\n");
      out.write("	width: 200px;\r\n");
      out.write("	height: 50px;\r\n");
      out.write("	text-indent: 10px\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".table-side tr:hover {\r\n");
      out.write("	color: green;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".next-content1 {\r\n");
      out.write("	height: 50px;\r\n");
      out.write("	width: 80%;\r\n");
      out.write("	border-top: 1px solid lightgray;\r\n");
      out.write("	border-bottom: 1px solid lightgray;\r\n");
      out.write("	color: gray;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".next-content:hover {\r\n");
      out.write("	background: lightgray;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".next-content2 {\r\n");
      out.write("	height: 50px;\r\n");
      out.write("	width: 10%;\r\n");
      out.write("	border-top: 1px solid lightgray;\r\n");
      out.write("	border-bottom: 1px solid lightgray;\r\n");
      out.write("	color: gray;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>고정헤더</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled and minified CSS -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("  <!-- jQuery library -->\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Popper JS -->\r\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Latest compiled JavaScript -->\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("    #wrap {\r\n");
      out.write("        width: 1000px;\r\n");
      out.write("        height: 300px;\r\n");
      out.write("        margin: auto;\r\n");
      out.write("    }\r\n");
      out.write("    div, form{\r\n");
      out.write("        /*border: 1px solid black;*/\r\n");
      out.write("        box-sizing: border-box;\r\n");
      out.write("    }\r\n");
      out.write("    #miniMenu { height:3%;} \r\n");
      out.write("    #miniMenu>button {\r\n");
      out.write("        float: right;\r\n");
      out.write("        border-radius: 5px;\r\n");
      out.write("    }\r\n");
      out.write("    #header {height: 15%;}\r\n");
      out.write("    #header>div {\r\n");
      out.write("        float: left;\r\n");
      out.write("    }\r\n");
      out.write("    #search {width: 80%; height: 100%; position: relative;}\r\n");
      out.write("    #search_form {\r\n");
      out.write("        width: 80%;\r\n");
      out.write("        height: 20%;\r\n");
      out.write("        margin: auto;\r\n");
      out.write("        position: absolute;\r\n");
      out.write("        right: 0px;\r\n");
      out.write("        left: 0px;\r\n");
      out.write("        top: 0px;\r\n");
      out.write("        bottom: 0px;\r\n");
      out.write("    }\r\n");
      out.write("    #search_form>div{\r\n");
      out.write("        height: 100%;\r\n");
      out.write("        float: left;\r\n");
      out.write("    }\r\n");
      out.write("    #search_form input {\r\n");
      out.write("        box-sizing: border-box;\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        height: 100%;\r\n");
      out.write("    }\r\n");
      out.write("    #search_text { width: 90%; }\r\n");
      out.write("    #search_btn { width: 10%; }\r\n");
      out.write("\r\n");
      out.write("    #img {width: 20%; height: 100%;}\r\n");
      out.write("    #nav { height: 5%;}\r\n");
      out.write("    #cat {\r\n");
      out.write("        list-style-type: none;\r\n");
      out.write("        margin: 0px;\r\n");
      out.write("        padding: 0px;\r\n");
      out.write("        height: 100%;\r\n");
      out.write("    }\r\n");
      out.write("    #cat>li {\r\n");
      out.write("        float: left;\r\n");
      out.write("        width: 20%;\r\n");
      out.write("        height: 100%;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("    }\r\n");
      out.write("    #cat a {\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("        color: black;\r\n");
      out.write("        font-size: 13px;\r\n");
      out.write("        font-weight: 900;\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        height: 100%;\r\n");
      out.write("        display: block;\r\n");
      out.write("        line-height: 35px;\r\n");
      out.write("    }\r\n");
      out.write("    #cat li:hover {\r\n");
      out.write("        background-color: rgb(67, 155, 68);\r\n");
      out.write("    }\r\n");
      out.write("    #cat a:hover {\r\n");
      out.write("        color: white;\r\n");
      out.write("    }\r\n");
      out.write("   \r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"wrap\">\r\n");
      out.write("        <div id=\"miniMenu\">\r\n");
      out.write("            <button><a href=\"/javajo/list.fb?currentPage=1\">회원가입</a></button>\r\n");
      out.write("            <button>로그인</button>\r\n");
      out.write("            <button>마이페이지</button>\r\n");
      out.write("            <button>고객센터</button>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"header\">\r\n");
      out.write("            <div id=\"img\"><a href=\"\"><img src=\"resources\\mainImage.png\" style=\"width:100%; height: 100%;\"></a></div>\r\n");
      out.write("            <div id=\"search\">\r\n");
      out.write("                <form id=\"search_form\" action=\"search.do\" method=\"post\">\r\n");
      out.write("                    <div id=\"search_text\">\r\n");
      out.write("                        <input type=\"text\" placeholder=\"내용을 입력해주세요\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"search_btn\">\r\n");
      out.write("                        <input type=\"submit\" value=\"검색\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"nav\">\r\n");
      out.write("            <ul id=\"cat\">\r\n");
      out.write("                <li><a>국내도서</a></li>\r\n");
      out.write("                <li><a>해외도서</a></li>\r\n");
      out.write("                <li><a>초/중/고 참고서</a></li>\r\n");
      out.write("                <li><a>대학교재</a></li>\r\n");
      out.write("                <li><a>수험서/자격증</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("       \r\n");
      out.write("            \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"wrap\">\r\n");
      out.write("\r\n");
      out.write("		<div id=\"board-body\">\r\n");
      out.write("			<div id=\"board-side\">\r\n");
      out.write("				<div id=\"board-title\" onclick=\"location.href=''\"\r\n");
      out.write("					style=\"cursor: pointer;\">\r\n");
      out.write("					<span>자유게시판</span><br>COMUUNITY\r\n");
      out.write("				</div>\r\n");
      out.write("				<table class=\"table-side\">\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td>공지사항</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td>1:1 문의</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td>FAQ문의</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("				</table>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<div id=\"board-center\">\r\n");
      out.write("				<div id=\"board-center-header\">\r\n");
      out.write("					<h2 class=\"h2\">자유게시판</h2>\r\n");
      out.write("				</div>\r\n");
      out.write("				<hr class=\"hr1\">\r\n");
      out.write("				<div id=\"board-center-body\">\r\n");
      out.write("\r\n");
      out.write("					<table style=\"width: 100%;\">\r\n");
      out.write("\r\n");
      out.write("						<thead style=\"border-bottom: 1px solid lightgray;\">\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td style=\"width: 52%; padding-bottom: 15px;\">제목 <span\r\n");
      out.write("									style=\"font-weight: bold; font-size: large;\">");
      out.print(b.getF_TITLE());
      out.write("</span></td>\r\n");
      out.write("								<td style=\"width: 18%; padding-bottom: 15px;\">작성자 <span\r\n");
      out.write("									style=\"font-weight: bold; font-size: small;\"></span>");
      out.print(b.getMEMBER_ID());
      out.write("</td>\r\n");
      out.write("								<td style=\"width: 12%; padding-bottom: 15px;\">조회수 <span\r\n");
      out.write("									style=\"font-weight: bold; font-size: small;\"></span>");
      out.print(b.getT_COUNT());
      out.write("</td>\r\n");
      out.write("								<td style=\"width: 20%; padding-bottom: 15px;\">작성일 <span\r\n");
      out.write("									style=\"font-weight: bold; font-size: small;\"></span>");
      out.print(b.getCREATE_DATE());
      out.write("</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("						</thead>\r\n");
      out.write("						<tbody>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td style=\"height: 500px;\" colspan=\"4\">");
      out.print(b.getCONTENT());
      out.write("</td>\r\n");
      out.write("								\r\n");
      out.write("							</tr>\r\n");
      out.write("						</tbody>\r\n");
      out.write("						<tfoot>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td colspan=\"4\">\r\n");
      out.write("								<div >\r\n");
      out.write("								");
 for(int i = 0; i < list.size(); i++) { 
      out.write("\r\n");
      out.write("            		<img src=\"/javajo/");
      out.print(list.get(i).getFilePath() + list.get(i).getChangeName() );
      out.write("\" style=\"margin : 10px\"width=\"400\" height=\"300\" >\r\n");
      out.write("            	");
} 
      out.write("\r\n");
      out.write("								</div>\r\n");
      out.write("							</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("						</tfoot>\r\n");
      out.write("						\r\n");
      out.write("					</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<br>\r\n");
      out.write("					<table style=\"width: 100%;\">\r\n");
      out.write("						");

						if (b.getF_NO() < m) {
						
      out.write("\r\n");
      out.write("						<tr class=\"next-content\">\r\n");
      out.write("							<td class=\"next-content1\" id=\"nextBoard\">다음 게시물</td>\r\n");
      out.write("							<td class=\"next-content2\"></td>\r\n");
      out.write("						</tr>\r\n");
      out.write("						");

						}
						
      out.write("\r\n");
      out.write("						");

						if (b.getF_NO() != 1) {
						
      out.write("\r\n");
      out.write("						<tr class=\"next-content\">\r\n");
      out.write("							<td class=\"next-content1\" id=\"prevBoard\">이전 게시물</td>\r\n");
      out.write("							<td class=\"next-content2\">2021-11-01</td>\r\n");
      out.write("						</tr>\r\n");
      out.write("						");

						}
						
      out.write("\r\n");
      out.write("					</table>\r\n");
      out.write("\r\n");
      out.write("					<script>\r\n");
      out.write("						$(function() {\r\n");
      out.write("							$(\"#nextBoard\")\r\n");
      out.write("									.click(\r\n");
      out.write("											function() {\r\n");
      out.write("												function getParameterByName(\r\n");
      out.write("														name) {\r\n");
      out.write("													name = name.replace(/[\\[]/,\r\n");
      out.write("															\"\\\\[\").replace(\r\n");
      out.write("															/[\\]]/, \"\\\\]\");\r\n");
      out.write("													var regex = new RegExp(\r\n");
      out.write("															\"[\\\\?&]\"\r\n");
      out.write("																	+ name\r\n");
      out.write("																	+ \"=([^&#]*)\"), results = regex\r\n");
      out.write("															.exec(location.search);\r\n");
      out.write("													return results == null ? \"\"\r\n");
      out.write("															: decodeURIComponent(results[1]\r\n");
      out.write("																	.replace(\r\n");
      out.write("																			/\\+/g,\r\n");
      out.write("																			\" \"));\r\n");
      out.write("												}\r\n");
      out.write("\r\n");
      out.write("												var bno = getParameterByName('bno');\r\n");
      out.write("												var bno2 = 1;\r\n");
      out.write("												var bno3 = +bno + bno2\r\n");
      out.write("\r\n");
      out.write("												location.href = \"/javajo/detail.fd?bno=\"\r\n");
      out.write("														+ bno3;\r\n");
      out.write("											});\r\n");
      out.write("						});\r\n");
      out.write("					</script>\r\n");
      out.write("					<script>\r\n");
      out.write("						$(function() {\r\n");
      out.write("							$(\"#prevBoard\")\r\n");
      out.write("									.click(\r\n");
      out.write("											function() {\r\n");
      out.write("												function getParameterByName(\r\n");
      out.write("														name) {\r\n");
      out.write("													name = name.replace(/[\\[]/,\r\n");
      out.write("															\"\\\\[\").replace(\r\n");
      out.write("															/[\\]]/, \"\\\\]\");\r\n");
      out.write("													var regex = new RegExp(\r\n");
      out.write("															\"[\\\\?&]\"\r\n");
      out.write("																	+ name\r\n");
      out.write("																	+ \"=([^&#]*)\"), results = regex\r\n");
      out.write("															.exec(location.search);\r\n");
      out.write("													return results == null ? \"\"\r\n");
      out.write("															: decodeURIComponent(results[1]\r\n");
      out.write("																	.replace(\r\n");
      out.write("																			/\\+/g,\r\n");
      out.write("																			\" \"));\r\n");
      out.write("												}\r\n");
      out.write("\r\n");
      out.write("												var bno = getParameterByName('bno');\r\n");
      out.write("												var bno2 = -1;\r\n");
      out.write("												var bno3 = +bno + bno2\r\n");
      out.write("\r\n");
      out.write("												location.href = \"/javajo/detail.fd?bno=\"\r\n");
      out.write("														+ bno3;\r\n");
      out.write("											});\r\n");
      out.write("						});\r\n");
      out.write("					</script>\r\n");
      out.write("					<br>\r\n");
      out.write("					<!-- 댓글 영역-->\r\n");
      out.write("					<div>\r\n");
      out.write("						<table border=\"1\" width=100%>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td width=\"3%\">1.</td>\r\n");
      out.write("								<td width=\"10%\">작성자</td>\r\n");
      out.write("								<td align=\"right\">2021-11-29</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td colspan=\"3\">댓글 테스트</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("						</table>\r\n");
      out.write("					</div>\r\n");
      out.write("					<br>\r\n");
      out.write("					<!-- 댓글 -->\r\n");
      out.write("					<div class=\"reply\">\r\n");
      out.write("						<div class=\"card-header\">\r\n");
      out.write("							<i class=\"fa fa-comment fa\"></i> REPLY\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<ul class=\"list-group list-group-flush\" align=\"right\">\r\n");
      out.write("								<li class=\"list-group-item\"><textarea class=\"form-control\"\r\n");
      out.write("										id=\"exampleFormControlTextarea1\" rows=\"3\"\r\n");
      out.write("										style=\"resize: none;\"></textarea>\r\n");
      out.write("									<button type=\"button\" class=\"btn btn-dark mt-3 btn-sm\">등록</button>\r\n");
      out.write("								</li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<br> <br>\r\n");
      out.write("					<!-- 로그인 시-->\r\n");
      out.write("					<div align=\"center\">\r\n");
      out.write("						<button type=\"button\" class=\"btn btn-dark btn-sm\" onclick=\"location.href='/javajo/updateForm.fb?bno=");
      out.print( b.getF_NO() );
      out.write("'\">게시글 수정</button>\r\n");
      out.write("						\r\n");
      out.write("						<button class=\"btn btn-dark btn-sm\" onclick=\"test()\">게시글 삭제</button>\r\n");
      out.write("  \r\n");
      out.write("						<script>\r\n");
      out.write("						    function test() {\r\n");
      out.write("						        if (confirm(\"정말 게시글을 삭제하시겠습니까?\")) {\r\n");
      out.write("						        	alert(\"삭제되었습니다\");\r\n");
      out.write("						        	location.href=\"/javajo/delete.fb?bno=");
      out.print( b.getF_NO() );
      out.write("\";\r\n");
      out.write("						        }\r\n");
      out.write("						    }\r\n");
      out.write("						</script>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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