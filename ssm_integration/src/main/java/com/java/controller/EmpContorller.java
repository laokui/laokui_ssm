package com.java.controller;

import com.java.pojo.Emp;
import com.java.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ClassName EmpContorller
 * @Description:
 * @Author :lmk
 * @Date 2021/5/23
 * @Version V1.0
 **/
@Controller
@RequestMapping("/emp")
public class EmpContorller {

    @Autowired
    private EmpService empService;

    //测试
    @RequestMapping("/test1.do")
    public @ResponseBody String test1(){
        return "test1.do";
    }

    @RequestMapping("/getEmp")
    public @ResponseBody List<Map<String,Object>> getEmp(){

        return empService.findEmp();
    }


    /** description:批量添加 <br>
     * @Param: [list]
     *  @Return: boolean
     *  @Author: lmk
     *  @Date: 2021/5/23 21:26
     */
    @RequestMapping("/addBathEmp.do")
    public @ResponseBody boolean addBathEmp(){
        List<Emp> list=new ArrayList<Emp>();
        for (int i=12;i<15;i++){
            Emp emp = new Emp();
            emp.setEmpName("张三"+i);
            emp.setSalary(Float.parseFloat("9999")+i);
            emp.setProfession("java架构师"+i);
            list.add(emp);
        }
        return empService.saveBathEmp(list);
    }

    /** description: 批量删除<br>
     * @Param: []
     *  @Return: boolean
     *  @Author: lmk
     *  @Date: 2021/5/24 20:38
     */
    @RequestMapping("/scBathEmp.do")
    public  @ResponseBody boolean scBathEmp(){

        List<Integer> ls=new ArrayList<Integer>();
        for(int i=11;i<19;i++){
            ls.add(i);
        }
        return empService.removeBathEmp(ls);
    }


    /** description:动态查询 <br>
     * @Param: [empName, profession, salary]
     *  @Return: java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     *  @Author: lmk
     *  @Date: 2021/5/24 21:37
     */
    @RequestMapping("/getDynamicEmp.do")
    public @ResponseBody  List<Map<String,Object>> getDynamicEmp(String empName,String profession,Float salary){

        return empService.findDynamicEmp(empName,profession,salary);

    }


    /** description:动态添加 <br>
     * @Param: [empName, profession, salary]
     *  @Return: boolean
     *  @Author: lmk
     *  @Date: 2021/5/24 21:36
     */
    @RequestMapping("addDynamic.do")
    public @ResponseBody boolean addDynamic(String empName,String profession,Float salary){
        return empService.saveDynamic(empName,profession,salary);
    }




}