package chatbot;

import javax.jws.*;
import javax.jws.soap.*;
import javax.jws.soap.SOAPBinding.*;
 
@WebService
@SOAPBinding(style = Style.RPC)
public interface 聊天 {
  @WebMethod String 回答(String 听到的);
}