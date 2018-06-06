参考：https://www.jianshu.com/p/d40ee98b84b5

一、springboot 访问静态文件
如果这四个目录中有相同的静态资源文件，那么优先访问哪个目录下面的资源啊？
静态资源的默认访问优先级：/META-INF/resources/>/resources/>/static/>/public/

二、SpringBoot关于静态资源的访问涉及到了application.properties中的两个属性
# 默认值为 /*
spring.mvc.static-path-pattern= #这里设置静态资源匹配的url-pattern
# 默认值为 classpath:/META-INF/resources/,classpath:/resources/,classpath:/static/,classpath:/public/
spring.resources.static-locations= #这里设置要指向的路径，多个使用英文逗号隔开，在前面的优先级高


