import java.util.ArrayList;

class 排队买票类 {
  public static void main(String[] 参数) {
    
    // 创建时, 不用指定长度.
    // <人>的意思是它的内容是"人". 后面为什么只要<>呢? 因为内容已经限定为"人"了.
    ArrayList<人类> 队列 = new ArrayList<>();

    人类 小明 = new 人类("小明", 14);
    人类 小红 = new 人类("小红", 5);
    人类 大黄 = new 人类("大黄", 12);
    人类 阿牛 = new 人类("阿牛", 9);
    
    // 三人先后排上了队
    队列.add(小明);
    队列.add(小红);
    队列.add(大黄);
    
    System.out.println("小红在位置:" + 队列.indexOf(小红));
    
    // 小明走了
    队列.remove(小明);
    
    System.out.println("小明走后, 小红在位置:" + 队列.indexOf(小红));
    
    // 阿牛插队, 到了阿牛前面, 小红的后面
    队列.add(1, 阿牛);
    
    // 现在队是怎么排的?
    for(人类 谁 : 队列) {
      谁.自我介绍();
    }
  }
}