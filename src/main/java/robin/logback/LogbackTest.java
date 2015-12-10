package robin.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest {
	public static void main(String[] args){
		Logger loggger = LoggerFactory.getLogger(LogbackTest.class);
		loggger.info("hello world");
	}
}
