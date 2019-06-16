package bao.doan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import bao.doan.aop.util.AppLogger;
import bao.doan.web.model.Store;

@Configuration 
@ComponentScan(basePackages = "bao.doan")
@EnableAspectJAutoProxy(proxyTargetClass=true)

public class WebMvcConfig {
  @Bean(name = "viewResolver")
  public InternalResourceViewResolver getViewResolver() {
    InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
    return viewResolver;
  }

  @Bean
  public AppLogger appLogger() { 
   return new AppLogger();
  }
  
  @Bean
  @Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
  public Store store() {
    return new Store();
  }
}
