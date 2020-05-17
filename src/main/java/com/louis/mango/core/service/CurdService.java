package com.louis.mango.core.service;
import com.louis.common.page.PageRequest;
import com.louis.common.page.PageResult;
import java.util.List;

/**
 * 通用CURD接口
 * @author huangjiabao
 * @data 2020/5/17/0017
 * @time 12:23:28
 */
public interface CurdService <T>{
    /**
     * 保存操作
     * @param record
     * @return
     */
    int save(T record);

    /**
     * 删除操作
     * @param record
     * @return
     */
    int delete(T record);

    /**
     * 批量删除
     * @param records
     * @return
     */
    int delete(List<T> records);

    /**
     * 根据Id查询
     * @param id
     * @return
     */
    T findById(Long id);

    /**
     * 分页查询
     * @param pageRequest
     * @return
     */
     PageResult findPage(PageRequest pageRequest);
}
