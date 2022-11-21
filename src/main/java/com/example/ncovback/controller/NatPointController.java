package com.example.ncovback.controller;

import com.example.ncovback.common.R;
import com.example.ncovback.entity.NatPoint;
import com.example.ncovback.service.NatPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class NatPointController {
    @Autowired
    private NatPointService natPointService;
    @PostMapping("/getNatPointbycity")
    public R getNatPointbycity(@RequestBody NatPoint natPoint){
        R r=new R();
        List<NatPoint> result=natPointService.getNatPointbycity(natPoint);
        if(result.size()!=0){
            r.setCode(200);
            r.setMsg("获取成功");
            r.setData(result);
        }else {
            r.setCode(201);
            r.setMsg("暂时未收录该城市信息");
        }
        return r;
    }
    @GetMapping("/admin/CovTest/get")
    public R getTest(){
        R r=new R();
        List<NatPoint> result=natPointService.getTest();
        if(result.size()!=0){
            r.setCode(200);
            r.setMsg("获取成功");
            r.setData(result);
        }else {
            r.setCode(201);
            r.setMsg("暂时未收录该城市信息");
        }
        return r;
    }
    @PostMapping("/admin/CovTest/add")
    public R addTest(@RequestBody NatPoint natPoint){
        R r=new R();
        Integer result=natPointService.addTest(natPoint);
        if(result!=0){
            r.setCode(200);
            r.setMsg("添加成功");
            r.setData(result);
        }else {
            r.setCode(201);
            r.setMsg("添加失败");
        }
        return r;
    }
    @PostMapping("/admin/CovTest/edit")
    public R editTest(@RequestBody NatPoint natPoint){
        R r=new R();
        Integer result=natPointService.editTest(natPoint);
        if(result!=0){
            r.setCode(200);
            r.setMsg("修改成功");
            r.setData(result);
        }else {
            r.setCode(201);
            r.setMsg("修改失败");
        }
        return r;
    }
    @PostMapping("/admin/CovTest/delete")
    public R deleteTest(@RequestBody NatPoint natPoint){
        R r=new R();
        Integer result=natPointService.deleteTest(natPoint);
        if(result!=0){
            r.setCode(200);
            r.setMsg("删除成功");
            r.setData(result);
        }else {
            r.setCode(201);
            r.setMsg("删除失败");
        }
        return r;
    }
}
