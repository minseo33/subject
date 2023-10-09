package com.intern.backend.backend.endpoint.api.student.endpoint;

import com.intern.backend.backend.endpoint.api.student.endpoint.support.ResponseDTO;
import com.intern.backend.backend.endpoint.api.student.endpoint.support.GrantDTO;
import com.intern.backend.backend.endpoint.api.student.service.GrantService;
import org.springframework.web.bind.annotation.*;

/**
 * 학생관리 EndPoint
 */
@RestController
@RequestMapping("/api/grant")
public class GrantController {
    private final GrantService grantService;

    public GrantController(GrantService grantService) {
        this.grantService = grantService;
    }

    /**
     * 그랜트 생성
     * @param req
     * @return
     */
    @PostMapping
    public ResponseDTO createStudent(@RequestBody GrantDTO.SaveReq req){
        try {
            grantService.createGrant(req);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseDTO(e.getMessage());
        }

        return new ResponseDTO();
    }

    /**
     * 그랜트 목록 조회
     * @param req
     * @return
     */
    @GetMapping("/list")
    public ResponseDTO<GrantDTO.SearchRes> selectStudents(){
        return grantService.selectGrants();
    }
}
