package com.internousdev.webproj4.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.webproj4.dto.InquiryDTO;
import com.internousdev.webproj4.util.DBConnector;

public class InquiryCompleteDAO {

	List<InquiryDTO> inquiryDTOList = new ArrayList<InquiryDTO>();

	public List<InquiryDTO> select(){
		DBConnctor db=new DBConnector();
		Connection con = db.getConnection();
	}

}
