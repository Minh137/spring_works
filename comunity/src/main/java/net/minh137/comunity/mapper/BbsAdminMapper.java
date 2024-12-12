package net.minh137.comunity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import net.minh137.comunity.model.BbsAdmin;
import net.minh137.comunity.model.BbsCategory;

@Mapper
public interface BbsAdminMapper {
   int insertBbsAdmin(BbsAdmin dto);
   int updateBbsAdmin(BbsAdmin dto);
   int fileUpdateBbsAdmin(BbsAdmin dto);
   int deleteBbsAdmin(int id);
   BbsAdmin selectById(int id);
   List<BbsAdmin> selectList();
   
   List<BbsCategory> selectCategoryByBbsId(int id); 
   
}

