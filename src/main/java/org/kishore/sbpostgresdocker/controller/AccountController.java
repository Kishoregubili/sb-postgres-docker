package org.kishore.sbpostgresdocker.controller;

import lombok.extern.slf4j.Slf4j;
import org.kishore.sbpostgresdocker.entity.Account;
import org.kishore.sbpostgresdocker.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/getAccount/{id}")
    public Account getAccount(@PathVariable int id){
        log.info("Fetched account by id: {}", id);
        return accountService.findById(id).get();
    }
       @PostMapping("/createAccount")
    public Account createAccount(@RequestBody Account account){
        log.info("Created account {}", account);
        return accountService.save(account);

    }
    @PutMapping("/updateAccount")
    public Account updateAccount(@RequestBody Account account){
        log.info("Updated account {}", account);
        return accountService.save(account);
    }
    @DeleteMapping("/deleteAccount")
    public void deleteAccount(@PathVariable int id){
        log.info("Deleted account by id: {}", id);
        accountService.deleteById(id);
    }

}
