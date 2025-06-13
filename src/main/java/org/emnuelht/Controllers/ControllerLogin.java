package org.emnuelht.Controllers;

import org.emnuelht.Models.RequestLoginAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class ControllerLogin {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private

    @PostMapping("/login")
    public ResponseEntity<?> iLogin(@RequestBody RequestLoginAccess requestLoginAccess) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(requestLoginAccess.getEmail(), requestLoginAccess.getPassword())
            );



        } catch (AuthenticationException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Acesso negado!");
        }
    }
}
