package chatbot;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class 聊天客户端 {
  public static void main(String[] 参数) throws Exception {
    Service 服务 = Service.create(new URL("http://127.0.0.1:5335/service?wsdl"),
                                new QName("http://chatbot/", "聊天机器人Service"));
    聊天 聊天接口 = 服务.getPort(聊天.class);

    // 待续: 参数检查
    System.out.println(聊天接口.回答(参数[0]));
  }
}