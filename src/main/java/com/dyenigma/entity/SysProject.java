package com.dyenigma.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "sys_project")
public class SysProject extends BaseDomain {
    /**
     * 项目自增ID
     */
    @Id
    @Column(name = "PRJ_ID")
    private String prjId;

    /**
     * 项目名称
     */
    @Column(name = "PRJ_NAME")
    private String prjName;

    /**
     * 项目描述
     */
    @Column(name = "PRJ_DESC")
    private String prjDesc;

    /**
     * 项目领导
     */
    @Column(name = "LEADER")
    private String leader;

    /**
     * 项目等级(可扩展为外键)
     */
    @Column(name = "LEVEL")
    private String level;

    /**
     * 当前状态,E:有效的,I:无效的
     */
    @Column(name = "STATUS")
    private String status;

    /**
     * 创造日期
     */
    @Column(name = "CREATED")
    private Date created;

    /**
     * 修改日期
     */
    @Column(name = "LASTMOD")
    private Date lastmod;

    /**
     * 创建人
     */
    @Column(name = "CREATER")
    private String creater;

    /**
     * 修改人
     */
    @Column(name = "MODIFYER")
    private String modifyer;

    /**
     * 所属公司ID
     */
    @Column(name = "CO_ID")
    private String coId;

    /**
     * 所属公司名称
     */
    @Column(name = "CO_NAME")
    private String coName;

    /**
     * 获取项目自增ID
     *
     * @return PRJ_ID - 项目自增ID
     */
    public String getPrjId() {
        return prjId;
    }

    /**
     * 设置项目自增ID
     *
     * @param prjId 项目自增ID
     */
    public void setPrjId(String prjId) {
        this.prjId = prjId;
    }

    /**
     * 获取项目名称
     *
     * @return PRJ_NAME - 项目名称
     */
    public String getPrjName() {
        return prjName;
    }

    /**
     * 设置项目名称
     *
     * @param prjName 项目名称
     */
    public void setPrjName(String prjName) {
        this.prjName = prjName;
    }

    /**
     * 获取项目描述
     *
     * @return PRJ_DESC - 项目描述
     */
    public String getPrjDesc() {
        return prjDesc;
    }

    /**
     * 设置项目描述
     *
     * @param prjDesc 项目描述
     */
    public void setPrjDesc(String prjDesc) {
        this.prjDesc = prjDesc;
    }

    /**
     * 获取项目领导
     *
     * @return LEADER - 项目领导
     */
    public String getLeader() {
        return leader;
    }

    /**
     * 设置项目领导
     *
     * @param leader 项目领导
     */
    public void setLeader(String leader) {
        this.leader = leader;
    }

    /**
     * 获取项目等级(可扩展为外键)
     *
     * @return LEVEL - 项目等级(可扩展为外键)
     */
    public String getLevel() {
        return level;
    }

    /**
     * 设置项目等级(可扩展为外键)
     *
     * @param level 项目等级(可扩展为外键)
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * 获取当前状态,E:有效的,I:无效的
     *
     * @return STATUS - 当前状态,E:有效的,I:无效的
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置当前状态,E:有效的,I:无效的
     *
     * @param status 当前状态,E:有效的,I:无效的
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取创造日期
     *
     * @return CREATED - 创造日期
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置创造日期
     *
     * @param created 创造日期
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取修改日期
     *
     * @return LASTMOD - 修改日期
     */
    public Date getLastmod() {
        return lastmod;
    }

    /**
     * 设置修改日期
     *
     * @param lastmod 修改日期
     */
    public void setLastmod(Date lastmod) {
        this.lastmod = lastmod;
    }

    /**
     * 获取创建人
     *
     * @return CREATER - 创建人
     */
    public String getCreater() {
        return creater;
    }

    /**
     * 设置创建人
     *
     * @param creater 创建人
     */
    public void setCreater(String creater) {
        this.creater = creater;
    }

    /**
     * 获取修改人
     *
     * @return MODIFYER - 修改人
     */
    public String getModifyer() {
        return modifyer;
    }

    /**
     * 设置修改人
     *
     * @param modifyer 修改人
     */
    public void setModifyer(String modifyer) {
        this.modifyer = modifyer;
    }

    /**
     * 获取所属公司ID
     *
     * @return CO_ID - 所属公司ID
     */
    public String getCoId() {
        return coId;
    }

    /**
     * 设置所属公司ID
     *
     * @param coId 所属公司ID
     */
    public void setCoId(String coId) {
        this.coId = coId;
    }

    /**
     * 获取所属公司名称
     *
     * @return CO_NAME - 所属公司名称
     */
    public String getCoName() {
        return coName;
    }

    /**
     * 设置所属公司名称
     *
     * @param coName 所属公司名称
     */
    public void setCoName(String coName) {
        this.coName = coName;
    }
}