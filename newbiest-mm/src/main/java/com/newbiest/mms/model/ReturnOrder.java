package com.newbiest.mms.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * 退料单
 */
@Entity
@DiscriminatorValue(Document.CATEGORY_RETURN)
public class ReturnOrder extends Document {

    public static final String GENERATOR_RETURN_ORDER_RULE = "CreateReturnOrder";

}