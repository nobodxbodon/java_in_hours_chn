public class 小孩 extends 人 {
  String 想做的事 = "大人的事";
  
  public 小孩(String 姓名, int 年龄) {
    super(姓名, 年龄);
  }

  public void 长大() {
    System.out.println("我要做" + 想做的事);
  }
}