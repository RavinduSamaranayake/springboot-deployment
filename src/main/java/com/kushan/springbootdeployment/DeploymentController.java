package com.kushan.springbootdeployment;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ravindu
 * 10/12/2022
 */
@RestController
@RequestMapping("/api")
public class DeploymentController {
    @GetMapping
    public ResponseEntity<String> getAll(){
        return ResponseEntity.ok("Deployment Success.....");
    }
}
