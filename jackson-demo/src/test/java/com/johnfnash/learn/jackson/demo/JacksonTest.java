package com.johnfnash.learn.jackson.demo;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;

public class JacksonTest {

	@Test
	public void jsonPropertyTest() throws IOException {
		List<Author> authors = Lists.newArrayList(
				Author.builder().name("zyc").fields(Lists.newArrayList("java", "sql")).build(),
				Author.builder().name("llp").fields(Lists.newArrayList("cad", "excel")).build());
		Article article = Article.builder().authors(authors).createDate(new Date())
				.description("use @JsonProperty change the property name.").id(168L).title("testJsonProperty").build();
		ObjectMapper mapper = new ObjectMapper();
		// 序列化
		String jsonStr = mapper.writeValueAsString(article);
		System.out.println("序列化结果：" + jsonStr);
		// 反序列化
		Article article2 = mapper.readValue(jsonStr, Article.class);
		System.out.println("反序列化结果：" + article2);
	}

	@Test
	public void JsonAutoDetectTest() throws IOException {
		Person person = new Person();
		ObjectMapper mapper = new ObjectMapper();
		// 序列化
		String jsonStr = mapper.writeValueAsString(person);
		System.out.println("序列化结果：" + jsonStr);
		// 反序列化
		Person p = mapper.readValue("{\"name\":\"llp\", \"boy\":true}", Person.class);
		System.out.println("反序列化结果：" + p);
	}
	
	@Test
	public void JsonIgnoreTest() throws Exception {
	    House house = new House();
	    house.setName("my house");
	    house.setAddress("深圳");
	    ObjectMapper objMapper = new ObjectMapper();
	    // address被忽略
	    String jsonStr = objMapper.writeValueAsString(house);
	    System.out.println("序列化结果：" + jsonStr);
	    // address被忽略
	    House h = objMapper.readValue("{\"name\":\"your house\", \"address\":\"深圳南山\"}", House.class);
	    System.out.println("反序列化结果：" + h);
	}
	
	@Test
	public void JsonIgnorePropertiesTest() throws Exception {
	    Computer cpt = new Computer();
	    cpt.setCpu("i7-U6700HQ");
	    cpt.setMemory("16G");
	    cpt.setOs("windows 10");
	    // 序列化
	    ObjectMapper objMapper = new ObjectMapper();
	    String jsonStr = objMapper.writeValueAsString(cpt);
	    System.out.println("序列化结果：" + jsonStr);
	    // 注意这里，如果忽略的属性数组里不包含mainboard，则会抛出com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException异常
	    Computer computer = objMapper.readValue(
	         "{\"cpu\":\"爱妻六代\", \"os\":\"centos7\",\"memory\":\"8G\",\"mainboard\":\"华硕主板\"}", Computer.class);
	    System.out.println("反序列化结果：" + computer);
	}

	@Test
	public void JsonIgnoreTypeTest() throws JsonProcessingException {
	    Car car = new Car();
	    car.setName("迈腾");
	    car.setPrice(23.49);
	    car.setOwner(new Owner("zyc"));

	    ObjectMapper objMapper = new ObjectMapper();
	    String jsonStr = objMapper.writeValueAsString(car);
	    System.out.println("结果：" + jsonStr);
	}
	
	@Test
	public void JsonIncludeTest() throws JsonProcessingException {
	    Car car = new Car();
	    car.setName("");
	    car.setPrice(0);
	    car.setOwner(new Owner("zyc"));

	    ObjectMapper objMapper = new ObjectMapper();
	    String jsonStr = objMapper.writeValueAsString(car);
	    System.out.println("结果：" + jsonStr);
	}
	
}
