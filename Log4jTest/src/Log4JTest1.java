import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * @author ZuoJianjun
 * 2018/8/28 14:22
 */
public class Log4JTest1 {
   private static Logger logger1= Logger.getLogger(Log4JTest1.class);

    public static void main(String[] args) throws  InterruptedException{
            logger1.setLevel(Level.TRACE);

            logger1.trace("trace message");
            logger1.debug("debug message");
            logger1.info("info message");
            logger1.warn("info message");
            logger1.error("error message");
    }
}
