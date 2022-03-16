package com.graduate.zry.controller;

import com.alibaba.fastjson.JSON;
import com.graduate.zry.bean.Daily;
import com.graduate.zry.bean.Ingredients;
import com.graduate.zry.bean.Login;
import com.graduate.zry.bean.QueryInfo;
import com.graduate.zry.dao.DailyDao;
import com.graduate.zry.dao.IngredientsDao;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IngredientsController {
  @Autowired
  IngredientsDao ingredientsDao;

  @RequestMapping("/addIn")
  public String addingredients(@RequestBody Ingredients ingredients){
    int i=ingredientsDao.addIngredients(ingredients);
    return i > 0 ? "success":"error";
  }

  @RequestMapping("/deleteIn")
  public String deleteingredients(String i_name){
    int i=ingredientsDao.deleteIngredients(i_name);
    return i>0?"success":"error";
  }

  @RequestMapping("/updateIn")
  public String getUpdateingredient(String i_name){
    Ingredients ingredients=ingredientsDao.getUpdateIngredients(i_name);
    String string= JSON.toJSONString(ingredients);
    return string;
  }

  @RequestMapping("/getupdateIn")
  public String getUpdateingredients(String i_name){
    Ingredients ingredients=ingredientsDao.getUpdateIngredients(i_name);
    String string= JSON.toJSONString(ingredients);
    return string;
  }

  @RequestMapping("/editIn")
  public String editingredients(@RequestBody Ingredients ingredients){
    int i=ingredientsDao.editIngredients(ingredients);
    return i>0?"success":"error";
  }

  @RequestMapping("/allIn")
  public String getingredientsList(QueryInfo queryInfo){
    int numbers=ingredientsDao.getIngredientsCounts("%"+queryInfo.getQuery()+"%");
    int pageStart=(queryInfo.getPageNum()-1)* queryInfo.getPageSize();
    List<Ingredients> da=ingredientsDao.getAllIngredients("%"+queryInfo.getQuery()+"%",pageStart, queryInfo.getPageSize());
    HashMap<String,Object> res=new HashMap<>();
    res.put("numbers",numbers);
    res.put("data",da);
    String res_string=JSON.toJSONString(res);
    return res_string;
  }
}