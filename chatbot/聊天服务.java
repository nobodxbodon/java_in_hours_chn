package chatbot;

import javax.xml.ws.*;

public class 聊天服务 {
  public static void main(String[] arguments) {
    聊天机器人 狗蛋 = new 聊天机器人();
    Endpoint.publish("http://127.0.0.1:5335/service", 狗蛋);
  }
}