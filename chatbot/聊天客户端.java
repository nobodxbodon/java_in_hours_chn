package chatbot;

import java.net.*;
import javax.xml.namespace.*;
import javax.xml.ws.*;

public class 聊天客户端 {
  public static void main(String[] 参数) throws Exception {
    URL url = new URL("http://127.0.0.1:5335/service?wsdl");
    QName qname = new QName("http://chatbot/", "聊天机器人Service");
    Service service = Service.create(url, qname);
    聊天 聊天接口 = service.getPort(聊天.class);

    System.out.println(聊天接口.回答(参数[0]));
  }
}