package com.java.service.impl;

import com.java.mapper.EmpMapper;
import com.java.pojo.Emp;
import com.java.service.EmpService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName EmpServiceImpl
 * @Description:
 * @Author :lmk
 * @Date 2021/5/23
 * @Version V1.0
 **/
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    /** description: 查询所有emp<br>
     * @Param: []
     *  @Return: java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     *  @Author: lmk
     *  @Date: 2021/5/23 21:10
     */
    @Override
    public List<Map<String,Object>> findEmp(){
        return empMapper.selectEmp();
    }


    /** description:批量添加 <br>
     * @Param: [list]
     *  @Return: boolean
     *  @Author: lmk
     *  @Date: 2021/5/23 21:26
     */
    @Override
    public boolean saveBathEmp(List<Emp> list){

       return empMapper.insertBathEmp(list)>=1?true:false;
    }


    /** description:批量删除 <br>
     * @Param: [ls]
     *  @Return: boolean
     *  @Author: lmk
     *  @Date: 2021/5/24 20:28
     */
    @Override
    public boolean removeBathEmp(List<Integer> ls) {
       return empMapper.deleteBathEmp(ls)>=1?true:false;
    }


    @Override
    public List<Map<String,Object>> findDynamicEmp( String empName, String profession, Float salary){
        //参数校验
        //分页
        Map<String,Object> paramMap=new HashMap<>();
        paramMap.put("empName",empName);
        paramMap.put("profession",profession);
        paramMap.put("salary",10001);
        return empMapper.selectDynamicEmp(paramMap);


    }

    @Override
    public boolean saveDynamic(String empName, String profession, Float salary) {
        //参数校验
        //参数去掉空格
        Map<String,Object> paramMap=new HashMap<>();
        paramMap.put("empName","张三");
        paramMap.put("profession",profession);
        paramMap.put("salary",13000);
        return empMapper.insertDynamic(paramMap)>=1?true:false;
    }


}