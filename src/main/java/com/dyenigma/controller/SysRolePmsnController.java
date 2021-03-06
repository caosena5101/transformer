package com.dyenigma.controller;

import com.dyenigma.core.Result;
import com.dyenigma.core.ResultGenerator;
import com.dyenigma.entity.SysRolePmsn;
import com.dyenigma.service.ISysRolePmsnService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Description:
* author  dyenigma
* date 2017/07/21
*/
@RestController
@RequestMapping("/sys/role/pmsn")
public class SysRolePmsnController extends BaseController{
    @Resource
    private ISysRolePmsnService sysRolePmsnService;

    @PostMapping
    public Result add(SysRolePmsn sysRolePmsn) {
        sysRolePmsnService.save(sysRolePmsn);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        sysRolePmsnService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(SysRolePmsn sysRolePmsn) {
        sysRolePmsnService.update(sysRolePmsn);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        SysRolePmsn sysRolePmsn = sysRolePmsnService.findById(id);
        return ResultGenerator.genSuccessResult(sysRolePmsn);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<SysRolePmsn> list = sysRolePmsnService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
