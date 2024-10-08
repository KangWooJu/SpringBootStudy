package hello.embed;

import hello.servlet.HelloServlet;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;

public class EmbedTomcatServletMain {

    public static void main(String[] args) throws LifecycleException {
        System.out.println("EmbedTomcatServletMain.main");
        //톰캣 설정
        Tomcat tomcat = new Tomcat();
        // 커넥터 생성
        Connector connector = new Connector();
        // 포트 설정
        connector.setPort(8080);
        // 톰켓에 커넥터 연결
        tomcat.setConnector(connector);

        //서블릿 등록
        Context context = tomcat.addContext("", "/");
        // 톰켓에 서블릿 등록
        tomcat.addServlet("", "helloServlet", new HelloServlet());
        // 등록한 서블릿의 경로를 매핑
        context.addServletMappingDecoded("/hello-servlet", "helloServlet");
        tomcat.start();
    }
}
