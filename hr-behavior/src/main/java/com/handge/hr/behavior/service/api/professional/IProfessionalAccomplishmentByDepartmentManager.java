package com.handge.hr.behavior.service.api.professional;


import com.handge.hr.domain.entity.behavior.web.request.professional.ProfessionalAccomplishmentByDepartmentManagerDetailParam;
import com.handge.hr.domain.entity.behavior.web.request.professional.TopOfProfessionalAccomplishmentByDepartmentManagerParam;

/**
 * Created by MaJianfu on 2018/6/13.
 */
public interface IProfessionalAccomplishmentByDepartmentManager {
    /**
     * 部门经理职业素养 TOP5
     *
     * @param
     * @return
     * @author MaJianfu
     * @date 2018/6/12 16:01
     **/
    public Object listTopOfProfessionalAccomplishmentByDepartmentManager(TopOfProfessionalAccomplishmentByDepartmentManagerParam topOfProfessionalAccomplishmentByDepartmentManagerParam);

    /**
     * 部门经理职业素养排名
     *
     * @param
     * @return
     * @author MaJianfu
     * @date 2018/6/12 16:01
     **/
    public Object listProfessionalAccomplishmentByDepartmentManagerDetail(ProfessionalAccomplishmentByDepartmentManagerDetailParam professionalAccomplishmentByDepartmentManagerDetailParam);

}
