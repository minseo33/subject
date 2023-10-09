package com.intern.backend.backend.endpoint.api.student.domain.repository;
import com.intern.backend.backend.endpoint.api.student.endpoint.support.GrantDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestGrantMapper {
    List<GrantDTO.SearchRes> selectGrants();

    void saveGrant(GrantDTO.SaveReq req);
}
