package com.intern.backend.backend.endpoint.api.student.service;

import com.intern.backend.backend.endpoint.api.student.domain.repository.TestGrantMapper;
import com.intern.backend.backend.endpoint.api.student.endpoint.support.GrantDTO;
import com.intern.backend.backend.endpoint.api.student.endpoint.support.ResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 학생관리 서비스
 */
@Service
public class GrantService {
    private final TestGrantMapper grantMapper;

    public GrantService(TestGrantMapper grantMapper) {
        this.grantMapper = grantMapper;
    }

    /**
     * 그랜트 생성 함수
     * @param req
     */
    public void createGrant(GrantDTO.SaveReq req) {
        grantMapper.saveGrant(req);
    }

    /**
     * 그랜트 조회 함수
     * @return
     */
    public ResponseDTO<GrantDTO.SearchRes> selectGrants() {
        List<GrantDTO.SearchRes> list = grantMapper.selectGrants();
        return new ResponseDTO(list);
    }
}
