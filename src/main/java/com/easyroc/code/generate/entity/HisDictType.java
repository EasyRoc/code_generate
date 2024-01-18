package com.easyroc.code.generate.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 字典类型表
 * </p>
 *
 * @author easyroc
 * @since 2024-01-10
 */
@TableName("t_his_dict_type")
public class HisDictType implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 字典名称
     */
    private String dictName;

    /**
     * 字典编码
     */
    private String dictCode;

    /**
     * 描述
     */
    private Integer dictDescribe;

    /**
     * 父级编码
     */
    private Integer parentCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    public Integer getDictDescribe() {
        return dictDescribe;
    }

    public void setDictDescribe(Integer dictDescribe) {
        this.dictDescribe = dictDescribe;
    }

    public Integer getParentCode() {
        return parentCode;
    }

    public void setParentCode(Integer parentCode) {
        this.parentCode = parentCode;
    }

    @Override
    public String toString() {
        return "HisDictType{" +
            "id = " + id +
            ", dictName = " + dictName +
            ", dictCode = " + dictCode +
            ", dictDescribe = " + dictDescribe +
            ", parentCode = " + parentCode +
        "}";
    }
}
