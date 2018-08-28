import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * @author ZuoJianjun
 * 2018/8/24 17:16
 */
public class Log4JTest {
    static Logger logger = Logger.getLogger(Log4JTest.class);

    public static void main(String[] args) throws InterruptedException {

        BasicConfigurator.configure();

        logger.setLevel(Level.INFO);

        logger.trace("跟踪信息");

        logger.debug("调试信息");

        logger.info("输出信息");

        Thread.sleep(3000);

        logger.warn("警告信息");

        logger.error("错误信息");

        logger.fatal("致命信息");
    }
}
