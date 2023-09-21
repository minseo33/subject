package com.intern.backend.backend.endpoint.api.student.endpoint;

import com.intern.backend.backend.endpoint.api.student.endpoint.support.HobbyDTO;
import com.intern.backend.backend.endpoint.api.student.endpoint.support.ResponseDTO;
import com.intern.backend.backend.endpoint.api.student.service.HobbyService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hobby")
public class HobbyController {
    private final HobbyService hobbyService;

    public HobbyController(HobbyService hobbyService) {
        this.hobbyService = hobbyService;
    }

    /**
     * 취미 등록
     * @param req
     * @return
     */
    @PostMapping
    public ResponseDTO createHobby(@RequestBody HobbyDTO.SaveReq req){
        // 학생시퀀스 데이터 검증
        if(req.getStudentSeq() == null  || "".equals(req.getStudentSeq())){
            return new ResponseDTO("학생시퀀스를 입력해주세요.");
        }
        // 취미 데이터 검증
        if(req.getHobby() == null || "".equals(req.getHobby()) ){
            return new ResponseDTO("나이를 입력해주세요.");
        }
        // 학생 생성 서비스 함수 호출
        try {
            hobbyService.createHobby(req);
        }catch (Exception e){
            return new ResponseDTO(e.getMessage());
        }

        return new ResponseDTO();
    }
}
