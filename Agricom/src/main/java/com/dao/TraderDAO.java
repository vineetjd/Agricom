package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.model.Login;
import com.model.Trader;

public class TraderDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void register(Trader trader) {

		String sql1="insert into trader(name,email,password,mobileNo) values(?,?,?,?)";
		jdbcTemplate.update(sql1, new Object[] {trader.getName(),trader.getEmail(),trader.getPassword(),trader.getMobileNo()});

	}

	public Trader validateTrader(Login login) {
		String sql="select * from trader where email='"+login.getEmail()+"' and password='"+login.getPassword()+"'";
		List<Trader> lst=jdbcTemplate.query(sql, new UserMapper());
		return lst.size() >0 ? lst.get(0):null;
	}
}
class UserMapper implements RowMapper<Trader> {
	public Trader mapRow(ResultSet rs, int arg1) throws SQLException {
		Trader user = new Trader();
		user.setName(rs.getString("name"));
		user.setPassword(rs.getString("password"));
		user.setEmail(rs.getString("email"));
		//  user.setAddress(rs.getString("address"));
		user.setMobileNo(rs.getInt("mobileNo"));
		return user;
	}
}
