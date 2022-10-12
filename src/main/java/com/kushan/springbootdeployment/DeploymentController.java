package com.kushan.springbootdeployment;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ravindu
 * 10/12/2022
 */
@RestController
@Slf4j
@RequestMapping("/api")
public class DeploymentController {
    @GetMapping
    public ResponseEntity<String> getAll(){
        log.info("Controller called.....");
        return ResponseEntity.ok("Deployment Success.....");
    }
}
