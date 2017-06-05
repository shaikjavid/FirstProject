package com.niit.dao;

import com.niit.model.Chronicling;

public interface RegisterDao {
	void addData(Chronicling chronicling);
	void userUpdate();
	Chronicling getUser(int id);
	Chronicling getOnlinemail(String Onlinemail);


}
