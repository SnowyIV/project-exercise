package com.geekaca.spring.controller;


import com.geekaca.spring.dao.BrandMapper;
import com.geekaca.spring.domain.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private BrandMapper brandMapper;

    @GetMapping("/all")
    public List<Brand> selectAll() {
        return brandMapper.selectAll();
    }

    @GetMapping("/{id}")
    public Brand select(@PathVariable("id") Integer id) {
        return brandMapper.selectById(id);
    }

    @PostMapping("/insert")
    public String add(@RequestBody Brand brand) {
        int result = brandMapper.add(brand);
        if (result > 0) {
            return "添加成功";
        } else {
            return "添加失败";
        }
    }
    @PostMapping("/update")
    public String update(@RequestBody Brand brand){
        int result = brandMapper.update(brand);
        if (result>0){
            return "更新成功";
        }else {
            return "更新是失败";
        }
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        int result = brandMapper.deleteById(id);
        if (result>0){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }
}