package com.handge.hr.domain.entity.manage.web.request.workflow;

/**
 * create by xc in 2018/08/30
 */
public class TaskQcSelectParam {
    /**
     * 任务名称
     */
    private String taskName;
    /**
     * 任务级别
     */
    private String taskLevel;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskLevel() {
        return taskLevel;
    }

    public void setTaskLevel(String taskLevel) {
        this.taskLevel = taskLevel;
    }

    @Override
    public String toString() {
        return "TaskQcSelectParam{" +
                "taskName='" + taskName + '\'' +
                ", taskLevel='" + taskLevel + '\'' +
                '}';
    }
}
