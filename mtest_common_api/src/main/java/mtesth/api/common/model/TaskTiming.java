package mtesth.api.common.model;

import java.util.Date;

public class TaskTiming {
    private Integer id;

    private String taskType;

    private Date executeTime;

    private String interfaceName;

    private String parameters;

    private String status;

    private Date createDatetime;

    private Date updateDatetime;

    private Integer mainTaskId;

    private String mutexFlag;

    private Integer afterMinutes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType == null ? null : taskType.trim();
    }

    public Date getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(Date executeTime) {
        this.executeTime = executeTime;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName == null ? null : interfaceName.trim();
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters == null ? null : parameters.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    public Integer getMainTaskId() {
        return mainTaskId;
    }

    public void setMainTaskId(Integer mainTaskId) {
        this.mainTaskId = mainTaskId;
    }

    public String getMutexFlag() {
        return mutexFlag;
    }

    public void setMutexFlag(String mutexFlag) {
        this.mutexFlag = mutexFlag == null ? null : mutexFlag.trim();
    }

    public Integer getAfterMinutes() {
        return afterMinutes;
    }

    public void setAfterMinutes(Integer afterMinutes) {
        this.afterMinutes = afterMinutes;
    }
}