public class 大人类 extends 人类 {
  String 责任 = "扶老携幼";
  
  public 大人类(String 姓名, int 年龄) {
    super(姓名, 年龄);
  }

  public void 生活() {
    System.out.println("我必须" + 责任);
  }
}