package net.minh137.comunity.model;

import lombok.Data;

@Data
public class BbsCategory {
	private int id;
	private int bbsid;	//bbs의 아이디(외래키)
	private String categorytext;
	private int categorynum;
}
