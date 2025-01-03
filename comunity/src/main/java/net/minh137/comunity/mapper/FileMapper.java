package net.minh137.comunity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import net.minh137.comunity.model.FileDto;

@Mapper
public interface FileMapper {
	void insertFile(FileDto file);

	void updateFileByBbsId(@Param("bbsId") long bbsId, @Param("fileId") long fileId);

	int deleteFile(Long id);

	List<FileDto> selectFileByBbsId(long bbsid);

	List<String> selectTrashFile();

	void deleteTrashFile();

	FileDto fileById(long id);
}
