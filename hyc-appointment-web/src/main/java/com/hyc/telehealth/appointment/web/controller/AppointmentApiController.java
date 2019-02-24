package com.hyc.telehealth.appointment.web.controller;

import com.hyc.telehealth.appointment.api.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @ 创建人 zt
 * @ 创建时间 2019/2/18
 * @ 描述
 */
@RequestMapping
@Controller
public class AppointmentApiController {

    @Autowired
    private IDeptService iDeptService;

    /**
     * 获取所有部门列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        List<Map<String, Object>> list = iDeptService.list(condition);
        return list;
//        return super.warpObject(new DeptWarpper(list));
    }

}
