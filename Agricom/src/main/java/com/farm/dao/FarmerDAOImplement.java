package com.farm.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.RowMapper;

import org.springframework.jdbc.core.JdbcTemplate;
import com.farm.model.FarmFarmer;
import com.farm.model.FarmLogin;

public class FarmerDAOImplement implements IFarmerDAO {
	
	JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public int addFarmer(FarmFarmer f) {
		// TODO Auto-generated method stub
		System.out.println("in save data..");
		String query="insert into g3_farm_details values(g3_farm_seq.nextval,'"+f.getfName()+"','"+f.getfEmail()+"',"+f.getfMobileNo()+",'"+f.getfPassword()+"')";
		return jdbcTemplate.update(query);
	}

	@Override
	public FarmFarmer validate(FarmLogin l) {
		// TODO Auto-generated method stub
		String sql = "select * from g3_farmer where FEmail='" + l.getlEmail() + "' and FPassword='" + l.getlPassword()
	    + "'";
	   List<FarmFarmer> list=jdbcTemplate.query(sql, new FarmMapper());

	    return list.size() > 0 ? list.get(0) : null;
	}

}
class FarmMapper implements RowMapper<FarmFarmer> {
	  public FarmFarmer mapRow(ResultSet rs, int arg1) throws SQLException {
	    FarmFarmer farmer = new FarmFarmer();
	    farmer.setfName(rs.getString("FName"));
	    farmer.setfEmail(rs.getString("FEmail"));
	    farmer.setfMobileNo(rs.getInt("FMobileNo"));
	    farmer.setfPassword(rs.getString("FPassword"));
	    
	    return farmer;
	  }
	}

