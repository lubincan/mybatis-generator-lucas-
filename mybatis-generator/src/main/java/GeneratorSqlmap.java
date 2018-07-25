import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * @Copyright(c) CypressTel Technology Co.,Ltd
 * @工程名称：mybatis-generator
 * @程序包名：
 * @程序类名：GeneratorSqlmap.java
 * @创建日期：2018年4月23日
 */

/**
 * @功能说明：
 * @创建人员：Lucas Lu
 * @变更记录：<BR>
 * 1、2018年4月23日 Lucas Lu 新建类
 */
public class GeneratorSqlmap {

	public void generator() throws Exception{

		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		//指定 逆向工程配置文件
		//File configFile = new File("E:\\eclipsespace\\mybatis-generator\\src\\main\\resources\\generatorConfig.xml"); 
		File configFile = new File(GeneratorSqlmap.class.getResource("/generatorConfig.xml").getFile());
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
				callback, warnings);
		myBatisGenerator.generate(null);

	} 
	public static void main(String[] args) throws Exception {
		try {
			GeneratorSqlmap generatorSqlmap = new GeneratorSqlmap();
			generatorSqlmap.generator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


}
