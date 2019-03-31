package site.bianma.springcloud.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;

/**
 * 访问过滤器
 *
 * @author liangrun
 * @version 1.0
 * @create 2019-03-31 11:39
 */
public class AccessFilter extends ZuulFilter {
	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		String name = request.getParameter("name");
		System.out.println(name);
		return null;
	}
}
