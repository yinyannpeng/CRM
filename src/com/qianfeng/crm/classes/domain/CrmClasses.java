package com.qianfeng.crm.classes.domain;

import java.util.Date;

import com.qianfeng.crm.coursetype.domain.CrmCourseType;

/**
 * 班级实体类
 * @author qq
 * `classId` VARCHAR(50) NOT NULL PRIMARY KEY,
  `courseTypeId` VARCHAR(255) DEFAULT NULL,
  `name` VARCHAR(50) DEFAULT NULL,
  `beginTime` DATETIME DEFAULT NULL,
  `endTime` DATETIME DEFAULT NULL,
  `status` VARCHAR(20) DEFAULT NULL,
  `totalCount` INT(11) DEFAULT NULL,
  `upgradeCount` INT(11) DEFAULT NULL,
  `changeCount` INT(11) DEFAULT NULL,
  `runoffCount` INT(11) DEFAULT NULL,
  `remark` VARCHAR(500) DEFAULT NULL,
  `uploadTime` DATETIME DEFAULT NULL,
  `uploadPath` VARCHAR(200) DEFAULT NULL,
  `uploadFilename` VARCHAR(100) DEFAULT NULL,
 */
public class CrmClasses {
    private String classId;
    private String name;
    private Date beginTime;
    private Date endTime;
    private String status;
    private Integer totalCount;//总人数
    private Integer upgradeCount;//升班人数
    private Integer changeCount; //转班人数
    private Integer runoffCount;//流失人数
    private String remark;
    private Date uploadTime;//上传时间
    private String uploadPath;//上传路径
    private String uploadFilename;//上传文件名称
    
    //对应一种课程类型
    private CrmCourseType  courseType;

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getUpgradeCount() {
		return upgradeCount;
	}

	public void setUpgradeCount(Integer upgradeCount) {
		this.upgradeCount = upgradeCount;
	}

	public Integer getChangeCount() {
		return changeCount;
	}

	public void setChangeCount(Integer changeCount) {
		this.changeCount = changeCount;
	}

	public Integer getRunoffCount() {
		return runoffCount;
	}

	public void setRunoffCount(Integer runoffCount) {
		this.runoffCount = runoffCount;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getUploadTime() {
		return uploadTime;
	}

	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}

	public String getUploadPath() {
		return uploadPath;
	}

	public void setUploadPath(String uploadPath) {
		this.uploadPath = uploadPath;
	}

	public String getUploadFilename() {
		return uploadFilename;
	}

	public void setUploadFilename(String uploadFilename) {
		this.uploadFilename = uploadFilename;
	}

	public CrmCourseType getCourseType() {
		return courseType;
	}

	public void setCourseType(CrmCourseType courseType) {
		this.courseType = courseType;
	}
    
    
    
}




