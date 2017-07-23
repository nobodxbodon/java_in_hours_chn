public class 听不懂例外 extends Exception {
  
  private String 听见的;
  
  public 听不懂例外(String 听见的) {
    this.听见的 = 听见的;
  }

  @Override
  public String getMessage() {
    return "听不懂这个: " + 听见的;
  }
}
