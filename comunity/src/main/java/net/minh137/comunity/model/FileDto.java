package net.minh137.comunity.model;

import lombok.Data;


@Data
public class FileDto {

	private long id;
	private long bbsid;
	private String orfilename;
	private String newfilename;
	private String ext;
	private long filesize;
}
