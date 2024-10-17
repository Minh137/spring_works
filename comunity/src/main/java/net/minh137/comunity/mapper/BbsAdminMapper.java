package net.minh137.comunity.mapper;

import java.util.List;

import net.minh137.comunity.model.BbsAdmin;

public interface BbsAdminMapper {
   int insertBbsAdmin(BbsAdmin dto);
   int updateBbsAdmin(BbsAdmin dto);
   int deleteBbsAdmin(int id);
   BbsAdmin selectById(int id);
   List<BbsAdmin> selectList();
}
