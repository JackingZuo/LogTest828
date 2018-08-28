import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * @author ZuoJianjun
 * 2018/8/24 17:16
 */
public class Log4JTest {
    static Logger logger = Logger.getLogger(Log4JTest.class);

    public static void main(String[] args) throws InterruptedException {


        //使用的默认配置配置信息、有了log4j.properties配置文件则该句代码可以不要
        //   BasicConfigurator.configure();

        //设置日志输出级别为info，这将覆盖配置文件中低于该级别的日志级别
        logger.setLevel(Level.INFO);

        //下面达到日志输出级别的将被输出
        logger.trace("跟踪信息");

        logger.debug("调试信息");

        logger.info("输出信息");

        Thread.sleep(3000);

        logger.warn("警告信息");

        logger.error("错误信息");

        logger.fatal("致命信息");
    }
}
