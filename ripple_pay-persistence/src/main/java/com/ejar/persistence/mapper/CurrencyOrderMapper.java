package com.ejar.persistence.mapper;

import com.ejar.domain.model.CurrencyOrder;
import com.ejar.domain.model.CurrencyOrderExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CurrencyOrderMapper {
    long countByExample(CurrencyOrderExample example);

    int deleteByExample(CurrencyOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CurrencyOrder record);

    int insertSelective(CurrencyOrder record);

    List<CurrencyOrder> selectByExample(CurrencyOrderExample example);

    CurrencyOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CurrencyOrder record, @Param("example") CurrencyOrderExample example);

    int updateByExample(@Param("record") CurrencyOrder record, @Param("example") CurrencyOrderExample example);

    int updateByPrimaryKeySelective(CurrencyOrder record);

    int updateByPrimaryKey(CurrencyOrder record);
}