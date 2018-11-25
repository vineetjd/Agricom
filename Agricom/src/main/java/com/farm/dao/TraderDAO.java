package com.farm.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.farm.model.FarmBidding;
import com.farm.model.FarmLogin;
import com.farm.model.FarmTrader;

public class TraderDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void register(FarmTrader trader) {

		String sql1="insert into trader(name,email,password,mobileNo) values(?,?,?,?)";
		jdbcTemplate.update(sql1, new Object[] {trader.gettName(),trader.gettEmail(),trader.gettPassword(),trader.gettMobileNo()});

	}

	public FarmTrader validateTrader(FarmLogin login) {
		String sql="select * from trader where email='"+login.getlEmail()+"' and password='"+login.getlPassword()+"'";
		List<FarmTrader> lst=jdbcTemplate.query(sql, new UserMapper());
		return lst.size() >0 ? lst.get(0):null;
	}
	
	public FarmBidding getLatestBiddingDetails() {
		String sql="select * from (select * from bidding order by b_id desc) where rownum=1";
		FarmBidding bid=(FarmBidding)jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(FarmBidding.class));
		return bid;
	}
	
}
class UserMapper implements RowMapper<FarmTrader> {
	public FarmTrader mapRow(ResultSet rs, int arg1) throws SQLException {
		FarmTrader user = new FarmTrader();
		user.settName(rs.getString("name"));
		user.settPassword(rs.getString("password"));
		user.settEmail(rs.getString("email"));
		//  user.setAddress(rs.getString("address"));
		user.settMobileNo(rs.getInt("mobileNo"));
		return user;
	}
}
