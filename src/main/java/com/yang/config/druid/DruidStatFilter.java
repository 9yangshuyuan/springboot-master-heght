package com.yang.config.druid;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

import com.alibaba.druid.support.http.WebStatFilter;

/** 
 * @Description druid数据源状态监控的过滤器
 * @author 王鑫 
 * @date Mar 16, 2017 3:17:29 PM  
 */
@WebFilter(filterName = "druidWebStatFilter", urlPatterns = "/*", initParams = { @WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")// 忽略资源
})
public class DruidStatFilter extends WebStatFilter {

}
