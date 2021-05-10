package com.br.division3;

import com.datastax.oss.driver.api.core.PagingIterable;
import com.datastax.oss.driver.api.mapper.annotations.Dao;
import com.datastax.oss.driver.api.mapper.annotations.Select;
import com.datastax.oss.driver.api.mapper.annotations.Update;

@Dao
public interface MutantDAO {

    @Select
    PagingIterable<Mutant> findAll();

    @Update
    void save(Mutant mutant);
}
