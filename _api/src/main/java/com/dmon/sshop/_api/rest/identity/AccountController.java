package com.dmon.sshop._api.rest.identity;

import com.dmon.sshop._application.service.identity.IAccountAppService;
import com.dmon.sshop._domain.identity.model.request.AccountReq;
import com.dmon.sshop._domain.identity.model.response.AccountRes;
import com.dmon.sshop._domain.identity.model.entity.Account;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class AccountController {
    //ADMIN//
    @RestController
    @RequestMapping("/admin/api/v1/account")
    @AllArgsConstructor
    @FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
    public static class AccountAdminController {
        IAccountAppService accountAppService;

        //CREATE//
        @PostMapping("/create")
        public ResponseEntity<AccountRes> createOne(
                @Valid @RequestBody AccountReq.Create body
        ) {
            return ResponseEntity
                    .ok()
                    .body(this.accountAppService.createOne(body));
        }

        //UPDATE//
        @PatchMapping("/update/{accountId}")
        public ResponseEntity<AccountRes> updateOne(
                @PathVariable("accountId") String accountId,
                @RequestBody AccountReq.Update body
        ) {
            return ResponseEntity
                    .ok()
                    .body(this.accountAppService.updateOne(accountId, body));
        }

        //LIST ALL//
        @GetMapping("/list")
        public ResponseEntity<List<Account>> listAll() {
            return ResponseEntity
                    .ok()
                    .body(this.accountAppService.listAll());
        }

        //FIND ONE//
        @GetMapping("/find/{accountId}")
        public ResponseEntity<AccountRes> findOne(
                @PathVariable("accountId") String accountId
        ) {
            return ResponseEntity
                    .ok()
                    .body(this.accountAppService.findOne(accountId));
        }

        @GetMapping("/my")
        public ResponseEntity<AccountRes> findMyOne() {
            return ResponseEntity
                    .ok()
                    .body(this.accountAppService.findMyOne());
        }

        //DELETE//
        @DeleteMapping("/delete/{id}")
        public ResponseEntity<Void> deleteOne(
                @PathVariable("id") String accountId
        ) {
            return ResponseEntity
                    .status(HttpStatus.NO_CONTENT)
                    .body(this.accountAppService.deleteOne(accountId));
        }
    }
}
