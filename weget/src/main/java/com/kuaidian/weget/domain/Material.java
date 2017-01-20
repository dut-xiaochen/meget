package com.kuaidian.weget.domain;

import java.util.Date;

public class Material {
    private Long id;

    private String materialname;

    private String aliyunossname;

    private Integer videotype;

    private Integer isvertical;

    private String videourl;

    private Date viedocatchtime;

    private String shareurl;

    private String imgurl;

    private Integer showindex;

    private Integer status;

    private Integer likenum;

    private Integer dislikenum;

    private Integer commentsnum;

    private Integer clicknum;

    private Long updateuserid;

    private Date updatetime;

    private Long createuserid;

    private Date createtime;

    private Integer isauto;

    private Integer usersubjectimg;

    private Date recommandsttime;

    private Date recommandedtime;

    private Date ordertime;

    private Integer isrecommanded;

    private Integer needcatch;

    private Integer catchtype;

    private Integer catchfailtimes;

    private Date catchsuccesstime;

    private Date catchbegintime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaterialname() {
        return materialname;
    }

    public void setMaterialname(String materialname) {
        this.materialname = materialname == null ? null : materialname.trim();
    }

    public String getAliyunossname() {
        return aliyunossname;
    }

    public void setAliyunossname(String aliyunossname) {
        this.aliyunossname = aliyunossname == null ? null : aliyunossname.trim();
    }

    public Integer getVideotype() {
        return videotype;
    }

    public void setVideotype(Integer videotype) {
        this.videotype = videotype;
    }

    public Integer getIsvertical() {
        return isvertical;
    }

    public void setIsvertical(Integer isvertical) {
        this.isvertical = isvertical;
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl == null ? null : videourl.trim();
    }

    public Date getViedocatchtime() {
        return viedocatchtime;
    }

    public void setViedocatchtime(Date viedocatchtime) {
        this.viedocatchtime = viedocatchtime;
    }

    public String getShareurl() {
        return shareurl;
    }

    public void setShareurl(String shareurl) {
        this.shareurl = shareurl == null ? null : shareurl.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public Integer getShowindex() {
        return showindex;
    }

    public void setShowindex(Integer showindex) {
        this.showindex = showindex;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getLikenum() {
        return likenum;
    }

    public void setLikenum(Integer likenum) {
        this.likenum = likenum;
    }

    public Integer getDislikenum() {
        return dislikenum;
    }

    public void setDislikenum(Integer dislikenum) {
        this.dislikenum = dislikenum;
    }

    public Integer getCommentsnum() {
        return commentsnum;
    }

    public void setCommentsnum(Integer commentsnum) {
        this.commentsnum = commentsnum;
    }

    public Integer getClicknum() {
        return clicknum;
    }

    public void setClicknum(Integer clicknum) {
        this.clicknum = clicknum;
    }

    public Long getUpdateuserid() {
        return updateuserid;
    }

    public void setUpdateuserid(Long updateuserid) {
        this.updateuserid = updateuserid;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Long getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(Long createuserid) {
        this.createuserid = createuserid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getIsauto() {
        return isauto;
    }

    public void setIsauto(Integer isauto) {
        this.isauto = isauto;
    }

    public Integer getUsersubjectimg() {
        return usersubjectimg;
    }

    public void setUsersubjectimg(Integer usersubjectimg) {
        this.usersubjectimg = usersubjectimg;
    }

    public Date getRecommandsttime() {
        return recommandsttime;
    }

    public void setRecommandsttime(Date recommandsttime) {
        this.recommandsttime = recommandsttime;
    }

    public Date getRecommandedtime() {
        return recommandedtime;
    }

    public void setRecommandedtime(Date recommandedtime) {
        this.recommandedtime = recommandedtime;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Integer getIsrecommanded() {
        return isrecommanded;
    }

    public void setIsrecommanded(Integer isrecommanded) {
        this.isrecommanded = isrecommanded;
    }

    public Integer getNeedcatch() {
        return needcatch;
    }

    public void setNeedcatch(Integer needcatch) {
        this.needcatch = needcatch;
    }

    public Integer getCatchtype() {
        return catchtype;
    }

    public void setCatchtype(Integer catchtype) {
        this.catchtype = catchtype;
    }

    public Integer getCatchfailtimes() {
        return catchfailtimes;
    }

    public void setCatchfailtimes(Integer catchfailtimes) {
        this.catchfailtimes = catchfailtimes;
    }

    public Date getCatchsuccesstime() {
        return catchsuccesstime;
    }

    public void setCatchsuccesstime(Date catchsuccesstime) {
        this.catchsuccesstime = catchsuccesstime;
    }

    public Date getCatchbegintime() {
        return catchbegintime;
    }

    public void setCatchbegintime(Date catchbegintime) {
        this.catchbegintime = catchbegintime;
    }
}