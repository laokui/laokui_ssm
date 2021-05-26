package com.java.service;

import com.java.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmpService {
    /** description: 查询所有emp<br>
     * @Param: []
     *  @Return: java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     *  @Author: lmk
     *  @Date: 2021/5/23 21:23
     */
    List<Map<String,Object>> findEmp();

    /** description:批量添加 <br>
     * @Param: [list]
     *  @Return: boolean
     *  @Author: lmk
     *  @Date: 2021/5/23 21:23
     */
    boolean saveBathEmp( List<Emp> list);


    /** description:批量删除 <br>
     * @Param: [ls]
     *  @Return: int
     *  @Author: lmk
     *  @Date: 2021/5/24 20:27
     */
    boolean removeBathEmp(List<Integer> ls);

    /** description: 动态查询<br>
     * @Param: [empName, profession, salary]
     *  @Return: java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     *  @Author: lmk
     *  @Date: 2021/5/24 21:33
     */
     List<Map<String,Object>> findDynamicEmp(String empName,String profession,Float salary);


     /** description: 动态添加<br>
      * @Param: [empName, profession, salary]
      *  @Return: boolean
      *  @Author: lmk
      *  @Date: 2021/5/24 21:33
      */
    boolean saveDynamic(String empName,String profession,Float salary);


    }
