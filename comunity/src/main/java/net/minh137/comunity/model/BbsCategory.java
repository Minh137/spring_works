package net.minh137.comunity.model;

import lombok.Data;

@Data
public class BbsCategory {
	private int id;
	private int bbsid;	//bbs�� ���̵�(�ܷ�Ű)
	private String categorytext;
	private int categorynum;
}