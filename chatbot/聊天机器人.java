package chatbot;

import java.util.*;
import javax.jws.*;

@WebService(endpointInterface = "chatbot.聊天")
public class 聊天机器人 implements 聊天 {
  private String 小秘密 = "";
  
  public String 回答(String 听到的) {
    if (听到的.contains("?")) {
      return "你猜? 答案长度是" + 小秘密.length();
    } else if (听到的.contains("秘密")) {
      小秘密 = 听到的;
      return "我记住了";
    } else {
      return "...";
    }
  }
}