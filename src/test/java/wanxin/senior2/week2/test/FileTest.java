package wanxin.senior2.week2.test;

import java.io.IOException;
import java.lang.reflect.Constructor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bw.wanxin.FileUtils;

/**
 * @author 926474
 *
 */
@ContextConfiguration("classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class FileTest {
	
	@Test
	public void test1() {
		System.out.println("1");
	}
	
	

}
