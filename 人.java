public class 人 {
  String 姓名 = "无名氏";
  int 年龄 = 0;
  float 身高 = 0.0f;
  private String 小秘密 = "";
  
  public void 自我介绍() {
    System.out.println("我叫" + 姓名 + ", 今年" + 年龄 + "岁");
  }
  
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