package com.newbiest.mms.repository;

import com.newbiest.base.repository.custom.IRepository;
import com.newbiest.mms.model.InterfaceFail;
import com.newbiest.mms.model.InterfaceHistory;
import org.springframework.stereotype.Repository;

/**
 * Created by guozhangLuo on 2020/9/01.
 */
@Repository
public interface InterfaceFailRepository extends IRepository<InterfaceFail, Long> {

}