package test.criterionData;

import hr.entity.Data;
import hr.mapperdao.DataMapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;

public class Test {
	private static ApplicationContext cxt = null;

	public static void main(String[] args) {
		cxt = new ClassPathXmlApplicationContext(
				"spring/applicationContext-*.xml");

		// testSelectAllTables(); // 查询数据库中的所有的表

		testSelectPropertiesByTableName();

		//testSelectByTableAndParams();
	}

	private static void testSelectByTableAndParams() {
		DataMapper mapper = (DataMapper) cxt.getBean("dataMapper");
		List<Object> lists = mapper.selectByTableAndColumns("config_file_first_kind", "first_kind_name,first_kind_id");
		
		for (Object obj : lists) {
//			Object[] objcs=new Gson();.
//			new Gson()
			System.out.println(obj);
			String str=obj.toString();
			str=str.substring(1, str.length()-1);
			System.out.println("str:"+str);
			
			String[] s = str.split(", ");
			for (String ss : s) {
				String [] sss = ss.split("=");
				System.out.println("sss[0]"+sss[0]+"  sss[1] "+sss[1]);
			}
			
		}
		
	}

	private static void testSelectPropertiesByTableName() {
		/*SqlSessionTemplate template = (SqlSessionTemplate) cxt
				.getBean("template");
		// sys_role 表 eg
		System.out.println(template);
		String tableName = "config_file_second_kind";
		List<Object> lists = template.selectList(
				"hr.mapperdao.DataMapper.selectByTableName", tableName);
*/
		

		DataMapper mapper = (DataMapper) cxt.getBean("dataMapper");
		List<Data> lists = mapper.selectByTableName("config_file_second_kind");
		
		for (Data obj : lists) {
			System.out.println(obj);
		}

	}

	private static void testSelectAllTables() {
/*		SqlSessionTemplate template = (SqlSessionTemplate) cxt
				.getBean("template");
		System.out.println(template);

		// String sql =
		// " select `table_name` from information_schema.tables 	where `table_schema` ='hr_db' ";
		String sql = "select * from sys_role";
		// List<Object> lists = template.selectList(sql);

		// SqlSession session = template.getSqlSessionFactory().openSession();
		// List<Object> lists =
		// session.selectList("hr.mapperdao.DataMapper.selectTables");

		List<Object> lists = template
				.selectList("hr.mapperdao.DataMapper.selectTables");
*/
		
		DataMapper mapper = (DataMapper) cxt.getBean("dataMapper");
		List<Object> lists = mapper.selectTables();
		for (Object obj : lists) {
			System.out.println(obj);

		}
	}

}
