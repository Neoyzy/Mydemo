package com.imooc.demo.form;

import lombok.Data;

@Data
public class CategoryForm {

    /** leimu id*/
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;
}

