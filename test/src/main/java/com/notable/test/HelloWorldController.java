package com.notable.test;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping(path = "/getme",
            produces = APPLICATION_JSON_VALUE)
    public Object gett(
            @RequestParam final String provider
    ) {
        return "getme";
    }

    @PostMapping(path = "/postme",
            produces = APPLICATION_JSON_VALUE)
    public Object postt(
            @RequestParam final String provider
    ) {
        return "postme";
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Object> deletee(
            @RequestParam final String provider,
            @PathVariable Integer id
    ) {

        return ResponseEntity.ok("deletee");
    }

}
