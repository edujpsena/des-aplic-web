package br.com.developer.ted1.web;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping
    public String get() {
        return "Método de GET";
    }

    @PostMapping
    public String post() {
        return "Método de POST";
    }

    @DeleteMapping
    public String delete() {
        return "Método de DELETE";
    }

    @PutMapping
    public String put() {
        return "Método de PUT";
    }
}
