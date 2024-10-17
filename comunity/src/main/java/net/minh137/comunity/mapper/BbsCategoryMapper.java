package net.minh137.comunity.mapper;

import java.util.List;

import net.minh137.comunity.model.BbsCategory;

public interface BbsCategoryMapper {
	
	List<BbsCategory> selectCategoryByBbsId(int bbsId); //���
	void insertCategory(BbsCategory category);
	void updateCategory(BbsCategory category);
	void deleteCategory(int id);
}
