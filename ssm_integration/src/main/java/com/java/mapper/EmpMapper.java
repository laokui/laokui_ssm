package com.java.mapper;

import com.java.pojo.Emp;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @ClassName EmpMapper
 * @Description:
 * @Author :lmk
 * @Date 2021/5/23
 * @Version V1.0
 **/
public interface EmpMapper {

    /** description:查询所有emp<br>
     * @Param: []
     *  @Return: java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     *  @Author: lmk
     *  @Date: 2021/5/23 21:08
     */
    //@Select("select * from emp")
    List<Map<String,Object>>  selectEmp();


    /** description: 批量添加<br>
     * @Param: [list]
     *  @Return: int
     *  @Author: lmk
     *  @Date: 2021/5/23 22:27
     */
    int insertBathEmp(List<Emp> list);


    /** description:批量删除 <br>
     * @Param: [ls]
     *  @Return: int
     *  @Author: lmk
     *  @Date: 2021/5/24 20:24
     */
    int deleteBathEmp(List<Integer> ls);


    /** description:动态查询 <br>
     * @Param: [paramMap]
     *  @Return: java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     *  @Author: lmk
     *  @Date: 2021/5/24 21:23
     */
    List<Map<String,Object>> selectDynamicEmp(Map<String,Object> paramMap);

    /** description: 动态添加<br>
     * @Param: [paramMap]
     *  @Return: int
     *  @Author: lmk
     *  @Date: 2021/5/24 21:23
     */
    int  insertDynamic(Map<String,Object> paramMap);
}