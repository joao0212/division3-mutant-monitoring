package com.br.division3;

import com.datastax.oss.driver.api.mapper.annotations.DaoFactory;
import com.datastax.oss.driver.api.mapper.annotations.Mapper;

@Mapper
public interface MutantMapper {

    @DaoFactory
    MutantDAO mutantDAO();
}
