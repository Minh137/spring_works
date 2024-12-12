package net.minh137.comunity.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import net.minh137.comunity.model.Bbs;

@Mapper
public interface BbsMapper {
  void insertBbs(Bbs bbs);
  void refUpdateById(@Param("ref") long ref, @Param("id") long id);
  int reInsertBbs(Bbs bbs);
  void updateBbs(Bbs bbs);
  int deleteBbs(long id);
  
  
  int selectCountBbs(@Param("bbsid") int bbsid);
  
  int selectSearchCountBbs(@Param("bbsid") int bbsid, 
		                   @Param("key") String key, 
		                   @Param("val") String val);
  
  List<Bbs> selectBbs(@Param("bbsid") int bbsid, 
		              @Param("page") int page, 
		              @Param("recordsPerPage") int recordsPerPage);
  
  List<Bbs> selectSearchBbs(
		  @Param("bbsid") int bbsid, 
		  @Param("page") int page, 
		  @Param("recordsPerPage") int recordsPerPage, 
		  @Param("key") String key, 
		  @Param("val") String val);

  //�Խù� ��� Ȯ��
  int bbsByIdAndPassword(@Param("id") long id, @Param("password") String password);
  
  //�Խù� ��ȸ�� ��� �� ����
  void updateHit(long id);
  Bbs viewBbs(long id);
  
  List<Map<String, Object>> selectMainLatestPosts();
  
  //�˻�
  List<Bbs> searchBbsPostsGrouped(String searchVal);
  void insertSearchKeyword(Map<String, Object> params);
  List<Map<String, Object>> selectPopularKeywords();
}

