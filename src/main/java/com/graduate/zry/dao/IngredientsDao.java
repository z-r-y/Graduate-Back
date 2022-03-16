package com.graduate.zry.dao;

import com.graduate.zry.bean.Ingredients;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientsDao {
  public List<Ingredients> getAllIngredients(@Param("i_name") String i_name, @Param("pageStart") int PageStart, @Param("pageSize") int PageSize);
  public int getIngredientsCounts(@Param("i_name") String i_name);
  public int addIngredients(Ingredients ingredients);
  public int deleteIngredients(String i_name);
  public Ingredients getUpdateIngredients(String i_name);
  public int editIngredients(Ingredients ingredients);
}
