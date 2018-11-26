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
import com.farm.model.FarmCrop;
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

	public int registerTrader(FarmTrader trader) {

		String sql1="insert into g3_trader(tName,tMobileNo,tEmail,tPassword) values('"+trader.gettName()+"','"+trader.gettEmail()+"','"+trader.gettPassword()+","+trader.gettMobileNo()+")";
		return jdbcTemplate.update(sql1/*, new Object[] {trader.gettName(),trader.gettEmail(),trader.gettPassword(),trader.gettMobileNo()}*/);

	}

	public FarmTrader validateTrader(FarmLogin login) {
		String sql="select * from g3_trader where tEmail='"+login.getlEmail()+"' and tPassword='"+login.getlPassword()+"'";
		List<FarmTrader> lst=jdbcTemplate.query(sql, new UserMapper());
		return lst.size() >0 ? lst.get(0):null;
	}
	
	
	public FarmBidding getLatestBiddingDetails() {
		String sql="select * from (select * from g3_bidding order by bID desc) where rownum=1";
		FarmBidding bid=(FarmBidding)jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(FarmBidding.class));
		return bid;
	}
	
	public void insertBid(int bidAmount, String cName) {
		String sql="update g3_crops set CSELLPRICE="+bidAmount+" where CNAME='"+cName+"'";
		jdbcTemplate.update(sql);
	}

	public FarmCrop getCrop() {
		String sql="select * from (select * from g3_crops order by cID desc) where rownum=1";
		FarmCrop crop=(FarmCrop)jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(FarmCrop.class));
		return crop;
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
