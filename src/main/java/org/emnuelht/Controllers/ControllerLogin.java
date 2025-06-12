package org.emnuelht.Controllers;

import org.emnuelht.Models.RequestLoginAccess;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class ControllerLogin {
    @PostMapping("/login")
    public ResponseEntity<?> iLogin(@RequestBody RequestLoginAccess requestLoginAccess) {

        return ResponseEntity.ok("");
    }
}
