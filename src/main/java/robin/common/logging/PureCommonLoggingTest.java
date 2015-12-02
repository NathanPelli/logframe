package robin.common.logging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author man
 * 2015年12月2日 上午11:29:21
 * 该类主要用来测试,纯粹用common logging来实现日志输出的效果
 * common logging只是一个日志门面,程序只和关联,由他负责调用具体的日志实现框架
 */
public class PureCommonLoggingTest {
	private static Log logger = LogFactory.getLog(PureCommonLoggingTest.class);
	public static void main(String[] args){
		logger.warn("Hello common logging !");
	}
}
