package net.minh137.comunity.model;

import java.util.List;

import lombok.Data;

@Data
public class BbsExtends {
	// private LocalDateTime createDate;
	private String formattedDate;
	private List<String> fileExt;
	private List<String> newfilename;
	private long num;
}
