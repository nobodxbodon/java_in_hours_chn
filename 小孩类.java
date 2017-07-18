public class 小孩类 extends 人类 {
  String 想做的事 = "大人的事";
  
  public 小孩类(String 姓名, int 年龄) {
    super(姓名, 年龄);
  }

  public void 长大() {
    System.out.println("我要做" + 想做的事);
  }
}