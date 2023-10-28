主要功能
一.elastic-job的Demo
job适合多节点之间不重复的执行任务，即分布式job 【测试方法,copy该project当作另外一个节点】

	1.1 simpleJob: 时间驱动,到达时间点开始执行任务
	1.2 DataFlowJob: 算是时间驱动和事件驱动，到达时间点后，执行任务，当fetch data = null时，自动停止任务
	1.3  运维平台：
          step-1:elastic-job-lite中有
		  step0:需要先下载源码, mvn install --> 生成jar 和tar.gz文件，
		                        该文件可能需要command去解压缩
	      step1:解压缩elastic-job-lite-console-${version}.tar.gz
	      step2:并执行bin\start.sh (window下start.bat)
	            (elastic-job-lite/target/z-console)
	      step3:打开浏览器访问http://localhost:8899/即可访问控制台
	1.4 监听器 --> 可以理解为job的AOP,在job执行前后do something
总结：
 	1.当一个节点的任务还没执行完，第二次执行时间到了时，此时 第二次任务先不执行，直到第一次任务执行完之后，马上执行第二次任务。即后者会等前者
	2.当一条数据处理过程中有异常失败时,不影响后面记录的处理

二.activeMQ (server: 下载好解压缩文件-->解压-->进入/bin/win64-->执行activemq.bat)
2.1 广播方式：点对点和发布/订阅模式
2.2 receive有2种方式(发送只有一种)：
a.异步接收：listener(server主动推送给customer): 类似包工头：来活了，开始干活拉！
b.同步接收：receive(customer主动从server去拿) 通过while(true)轮询, 类似工人：有活没？有活没？有活没？有活没？
总结：   
a)如果有多个节点receive，那么MQ是支持多节点得：a.当A节点挂了，B节点会接着A的活干  b.A节点在一次处理过程中，没处理完的数据，B节点会接着处理
b)手动确认：
session = connection.createSession(false, Session.CLIENT_ACKNOWLEDGE);
textMessage.acknowledge();// 搭配CLIENT_ACKNOWLEDGE使用


三.task -- timerTask

四.jedis简单demo

五.mybatis
@Param: 字段和属性之间相关联，就不需要parameterType了

六.guava
一种本地缓存，可以设置过期时间
注意：本项目的注册中心为3个节点(zookeeper)的集群

七.CopyOnWriteArrayList
特点：读写分离，适合多线程操作，线程安全的，底层用的是ReentrantLock,Vector用也是线程安全的，底层用的是synchronized锁

ArrayList:
特点：底层是数组，数组有索引，查询的时候效率高，但是删除和增加的时候，牵扯到数据的挪位重排，所以效率低, 多线程时会有异常ConcurrentModificationException


八.序列化和反序列化
a)需要实现implements Serializable 接口
b)定义serialVersionUID,在反序列化时，通过该UID找对应的序列化类，不加的话Serializable接口会默认生成一个
  反序列化时，如果实体类参数不同，会报异常
  参考文档：https://blog.csdn.net/java_mdzy/article/details/78354959
  private static final long serialVersionUID = 3238894774841125195L;
c)序列化的作用是保存内存中的各种对象的状态（也就是实例变量，不是方法）
d)父类实现后Serializable接口后，子类不用再实现，反之，不然

九.反射 .class 和 forName(String "package path") 获取类
通过类名获取 变量 方法 等
包含2个例子

十.deadlock 死锁

十一.泛型
1.泛型类: public class ClassName<E> {}
2.泛型方法: public <T> T add(T t) {return t}   public <T> void save(T t) {}
3.泛型接口

ps:一般能用泛型方法解决的问题优先使用泛型方法而不使用泛型类

十二.同步抢票案例

十三.多线程 (https://www.cnblogs.com/revel171226/p/9411131.html)
1.线程安全的理解：实际就是多线程共享资源
2.实现多线程安全/同步：synchronized  & Lock/reentrantLock
  （在并发量比较小的情况下，使用synchronized是个不错的选择；但是在并发量比较高的情况下，其性能下降会很严重，此时ReentrantLock是个不错的方案）

3.线程死锁的原因：A，B线程获取对方已lock的资源