package com.dirtylesc.comic_bo.controllers.man;

import com.dirtylesc.comic_bo.def.DefDb;
import com.dirtylesc.comic_bo.entities.users.TaUsers;
import com.dirtylesc.comic_bo.entities.users.ViTranslators;
import com.dirtylesc.comic_bo.services.man.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(DefDb.PATH_API_PRIV + DefDb.URI_API_USER)
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public ResponseEntity<List<TaUsers>> reqLstUsers() {
        return null;
    }

    @GetMapping("{slug}")
    public ResponseEntity<TaUsers> reqUser() {
        return null;
    }

    @GetMapping(DefDb.URI_API_TRANSLATOR)
    public ResponseEntity<List<ViTranslators>> reqLstTranslators(@RequestParam(required = false) String q) {
        return ResponseEntity.ok(userService.reqLstTranslators(q));
    }

    @GetMapping(DefDb.URI_API_TRANSLATOR + DefDb.URI_API_EXISTS)
    public ResponseEntity<Boolean> reqIsTranslator() {
        return ResponseEntity.ok(userService.isTranslator());
    }

    @PostMapping(DefDb.URI_API_STORE)
    public ResponseEntity<TaUsers> doStoreUser() {
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<TaUsers> doUpdateUser() {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TaUsers> doDestroyUser() {
        return null;
    }
}
