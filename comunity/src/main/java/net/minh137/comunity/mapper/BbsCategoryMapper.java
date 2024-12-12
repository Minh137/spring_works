package net.minh137.comunity.mapper;

import org.apache.ibatis.annotations.Mapper;

import net.minh137.comunity.model.BbsCategory;

@Mapper
public interface BbsCategoryMapper {
   int insertCategory(BbsCategory category);
   int deleteCategory(int id);
   int updateCategory(BbsCategory category);
}