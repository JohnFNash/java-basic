package com.johnfnash.learn.lombok.demo;

import java.util.Date;
import java.util.Set;

import org.junit.Assert;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.Singular;

@Data
@Builder(toBuilder = true)
public class BuilderExample {

	@NonNull
    private String id;
    private String name;
    private boolean active;
    private Date createTime;

    @Singular
    private Set<String> occupations;

    public static void main(String[] args) {
		BuilderExample builer = BuilderExample.builder().active(true)
						.name("name")
						.id("id")
						.createTime(new Date())
						.occupation("1")
						.occupation("2")
						.build();
		Assert.assertEquals(2, builer.getOccupations().size());
	}
    
}
