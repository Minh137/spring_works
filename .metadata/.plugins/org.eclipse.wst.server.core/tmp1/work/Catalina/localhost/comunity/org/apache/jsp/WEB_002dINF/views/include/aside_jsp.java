/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.46
 * Generated at: 2024-10-14 08:20:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aside_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/spring-security-taglibs-5.4.11.jar", Long.valueOf(1728289159499L));
    _jspx_dependants.put("jar:file:/C:/spring_works/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/comunity/WEB-INF/lib/spring-security-taglibs-5.4.11.jar!/META-INF/security.tld", Long.valueOf(1679304544000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1725514167351L));
    _jspx_dependants.put("jar:file:/C:/spring_works/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/comunity/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess;

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
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("    \r\n");
      out.write("\r\n");
      out.write("<h1>aside</h1>\r\n");
      out.write("\r\n");
      if (_jspx_meth_sec_005fauthorize_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_sec_005fauthorize_005f3(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_sec_005fauthorize_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    boolean _jspx_th_sec_005fauthorize_005f0_reused = false;
    try {
      _jspx_th_sec_005fauthorize_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthorize_005f0.setParent(null);
      // /WEB-INF/views/include/aside.jsp(7,0) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthorize_005f0.setAccess("isAuthenticated()");
      int _jspx_eval_sec_005fauthorize_005f0 = _jspx_th_sec_005fauthorize_005f0.doStartTag();
      if (_jspx_eval_sec_005fauthorize_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\r\n");
        out.write("   ");
        if (_jspx_meth_sec_005fauthorize_005f1(_jspx_th_sec_005fauthorize_005f0, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("   ");
        if (_jspx_meth_sec_005fauthorize_005f2(_jspx_th_sec_005fauthorize_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("   <form action=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("/logout\" method=\"post\">\r\n");
        out.write("   <input type=\"hidden\" name=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.parameterName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("\" />\r\n");
        out.write("   	<button type=\"submit\">로그아웃</button>\r\n");
        out.write("   </form>\r\n");
      }
      if (_jspx_th_sec_005fauthorize_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f0);
      _jspx_th_sec_005fauthorize_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sec_005fauthorize_005f0, _jsp_getInstanceManager(), _jspx_th_sec_005fauthorize_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sec_005fauthorize_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f1 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    boolean _jspx_th_sec_005fauthorize_005f1_reused = false;
    try {
      _jspx_th_sec_005fauthorize_005f1.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthorize_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f0);
      // /WEB-INF/views/include/aside.jsp(8,3) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthorize_005f1.setAccess("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')");
      int _jspx_eval_sec_005fauthorize_005f1 = _jspx_th_sec_005fauthorize_005f1.doStartTag();
      if (_jspx_eval_sec_005fauthorize_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\r\n");
        out.write("      <p>안녕하세요? ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.username }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("회원님 (level: ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.grade}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write(")</p>  \r\n");
        out.write("   ");
      }
      if (_jspx_th_sec_005fauthorize_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f1);
      _jspx_th_sec_005fauthorize_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sec_005fauthorize_005f1, _jsp_getInstanceManager(), _jspx_th_sec_005fauthorize_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sec_005fauthorize_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f2 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    boolean _jspx_th_sec_005fauthorize_005f2_reused = false;
    try {
      _jspx_th_sec_005fauthorize_005f2.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthorize_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f0);
      // /WEB-INF/views/include/aside.jsp(11,3) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthorize_005f2.setAccess("hasRole('ROLE_ADMIN')");
      int _jspx_eval_sec_005fauthorize_005f2 = _jspx_th_sec_005fauthorize_005f2.doStartTag();
      if (_jspx_eval_sec_005fauthorize_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\r\n");
        out.write("      <p>당신은 관리자 입니다.\r\n");
        out.write("      	<a href=\"./admin\" target=\"_blank\">관리자모드</a>\r\n");
        out.write("      </p>\r\n");
        out.write("   ");
      }
      if (_jspx_th_sec_005fauthorize_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f2);
      _jspx_th_sec_005fauthorize_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sec_005fauthorize_005f2, _jsp_getInstanceManager(), _jspx_th_sec_005fauthorize_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sec_005fauthorize_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f3 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    boolean _jspx_th_sec_005fauthorize_005f3_reused = false;
    try {
      _jspx_th_sec_005fauthorize_005f3.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthorize_005f3.setParent(null);
      // /WEB-INF/views/include/aside.jsp(23,0) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthorize_005f3.setAccess("!isAuthenticated()");
      int _jspx_eval_sec_005fauthorize_005f3 = _jspx_th_sec_005fauthorize_005f3.doStartTag();
      if (_jspx_eval_sec_005fauthorize_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\r\n");
        out.write("	<form action=\"./login\" method=\"post\">\r\n");
        out.write("	   <table>\r\n");
        out.write("	      <tr>\r\n");
        out.write("	         <td><input type=\"text\" name=\"userid\" id=\"userid\" placeholder=\"아이디\"></td>\r\n");
        out.write("	      </tr>\r\n");
        out.write("	      <tr>\r\n");
        out.write("	         <td><input type=\"password\" name=\"userpass\" id=\"userpass\" placeholder=\"비밀번호\"></td>\r\n");
        out.write("	      </tr>\r\n");
        out.write("	      <tr>\r\n");
        out.write("	         <td class=\"text-center\">\r\n");
        out.write("	            <input type=\"reset\" value=\"취소\" /> <input type=\"submit\" value=\" 로 그 인 \" />\r\n");
        out.write("	         </td>\r\n");
        out.write("	      </tr>\r\n");
        out.write("	      <input type=\"hidden\" name=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.parameterName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("\" />\r\n");
        out.write("	   </table>\r\n");
        out.write("	</form>\r\n");
      }
      if (_jspx_th_sec_005fauthorize_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f3);
      _jspx_th_sec_005fauthorize_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sec_005fauthorize_005f3, _jsp_getInstanceManager(), _jspx_th_sec_005fauthorize_005f3_reused);
    }
    return false;
  }
}
