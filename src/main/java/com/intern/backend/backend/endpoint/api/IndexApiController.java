package com.intern.backend.backend.endpoint.api;

import com.intern.backend.backend.endpoint.api.board.service.BoardDataService;
import com.intern.backend.backend.endpoint.api.board.support.BoardVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexApiController {
    @GetMapping("/api")
    public String indexApi() {
        return "index";
    }

}
