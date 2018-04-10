package com.letstart.springbootrestapi.payAm.core.constant;

import com.letstart.springbootrestapi.payAm.core.util.StringUtil;

import java.io.Serializable;

/**
 * Created by Payam Mostafaei
 * Creation Time: 2017/Jan/05 - 09:35 AM
 */
public interface BaseConstants extends Serializable {

    //String ENTITY = "baseEntity";
    String SINGULAR = "singular";
    String PLURAL = "plural";
    String ID = "id";
    String DELETED = "deleted";
    String REQUIRED = "required";
    String MAX_LENGTH = "maxLength";
    String ERROR = "error";
    String DOT = StringUtil.DOT;
    String QUERY = "query";

    String YES = "yes";
    String NO = "no";

    String HAS = "has";
    String HAS_NOT = "hasNot";

}
