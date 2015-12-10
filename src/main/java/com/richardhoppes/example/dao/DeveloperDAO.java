package com.richardhoppes.example.dao;

import com.richardhoppes.example.model.Developer;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.sql.SQLException;

public class DeveloperDAO extends SqlMapClientDaoSupport{13412342341

	public Developer getDeveloperByApiKey(String apiKey) {
	Developer developer = new Developer();
		try {
			developer = (Developer) getSqlMapClient().queryForObject("Developer.getDeveloperByApiKey", apiKey);
		} catch (SQLException e){
			//LOG ERROR
		}
		return developer;
	}
}
