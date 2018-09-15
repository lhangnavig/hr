package com.handge.hr.domain.entity.behavior.web.request.monitor;

import com.handge.hr.domain.entity.behavior.web.request.base.UserContextParam;
import java.io.Serializable;

/**
 * Created by DaLu Guo on 2018/6/1.
 */
public class NetStatusParam extends UserContextParam implements Serializable {
    /**
     * 部门名称
     */
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "NetStatusParam{" +
                "department='" + department + '\'' +
                '}';
    }
}
