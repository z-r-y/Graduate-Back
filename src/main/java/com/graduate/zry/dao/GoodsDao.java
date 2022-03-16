package com.graduate.zry.dao;

import com.graduate.zry.bean.Goods;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsDao {
  public List<Goods> getAllGoods(@Param("id") String id, @Param("pageStart") int PageStart, @Param("pageSize") int PageSize);
  public int getGoodsCounts(@Param("id") String id);
  public int addGoods(Goods goods);
  public int deleteGoods(String id);
  public Goods getUpdateGoods(int id);
  public int editGoods(Goods goods);
  public Goods getOneGoods(@Param("id") int id);
  public Goods aaa(@Param("id") int id,@Param("many") int many);
  public int bbb(@Param("id") int id);
}
