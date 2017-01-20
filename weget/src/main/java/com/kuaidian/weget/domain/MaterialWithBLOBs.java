package com.kuaidian.weget.domain;

public class MaterialWithBLOBs extends Material {
    private String materialdescription;

    private String materialremark;

    public String getMaterialdescription() {
        return materialdescription;
    }

    public void setMaterialdescription(String materialdescription) {
        this.materialdescription = materialdescription == null ? null : materialdescription.trim();
    }

    public String getMaterialremark() {
        return materialremark;
    }

    public void setMaterialremark(String materialremark) {
        this.materialremark = materialremark == null ? null : materialremark.trim();
    }
}