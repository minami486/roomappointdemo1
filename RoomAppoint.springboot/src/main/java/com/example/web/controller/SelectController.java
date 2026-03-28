package com.example.web.controller;

import com.example.web.enums.*;
import com.example.web.tools.dto.PagedResult;
import com.example.web.tools.dto.SelectResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
<<<<<<< HEAD
import java.util.stream.Collectors;
=======
>>>>>>> 33acc898c80b8b3f2f47fe0ba5ff63293201fc02
import java.util.stream.Stream;

@RestController
@RequestMapping("/Select")
public class SelectController {

    @RequestMapping(value = "/RoleType", method = RequestMethod.POST)
    public PagedResult<SelectResult> RoleType() {

<<<<<<< HEAD
        List<SelectResult> rs = Arrays.stream(RoleTypeEnum.values()).map(n -> new SelectResult(n.toString(), n.name(), n.index() + "", "")).collect(Collectors.toList());
=======
        List<SelectResult> rs = Arrays.stream(RoleTypeEnum.values()).map(n -> new SelectResult(n.toString(), n.name(), n.index() + "", "")).toList();
>>>>>>> 33acc898c80b8b3f2f47fe0ba5ff63293201fc02
        return PagedResult.GetInstance(rs, rs.stream().count());
    }

    /**
     * 预约状态枚举接口
     */
    @RequestMapping(value = "/AppointStatusEnum", method = RequestMethod.POST)
    public PagedResult<SelectResult> AppointStatusEnum() {

<<<<<<< HEAD
        List<SelectResult> rs = Arrays.stream(AppointStatusEnum.values()).map(n -> new SelectResult(n.toString(), n.name(), Integer.toString(n.index()), "")).collect(Collectors.toList());
=======
        var rs = Arrays.stream(AppointStatusEnum.values()).map(n -> new SelectResult(n.toString(), n.name(), Integer.toString(n.index()), "")).toList();
>>>>>>> 33acc898c80b8b3f2f47fe0ba5ff63293201fc02
        return PagedResult.GetInstance(rs, rs.stream().count());
    }

    /**
     * 预约时间段枚举接口
     */
    @RequestMapping(value = "/AppointDateTypeEnum", method = RequestMethod.POST)
    public PagedResult<SelectResult> AppointDateTypeEnum() {

<<<<<<< HEAD
        List<SelectResult> rs = Arrays.stream(AppointDateTypeEnum.values()).map(n -> new SelectResult(n.toString(), n.name(), Integer.toString(n.index()), "")).collect(Collectors.toList());
=======
        var rs = Arrays.stream(AppointDateTypeEnum.values()).map(n -> new SelectResult(n.toString(), n.name(), Integer.toString(n.index()), "")).toList();
>>>>>>> 33acc898c80b8b3f2f47fe0ba5ff63293201fc02
        return PagedResult.GetInstance(rs, rs.stream().count());
    }

}
