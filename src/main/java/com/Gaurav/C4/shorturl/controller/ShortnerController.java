package com.Gaurav.C4.shorturl.controller;

import com.Gaurav.C4.shorturl.entity.UrlEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ShortnerController {

    private final Map<Long, UrlEntry> CACHE = new HashMap<>();

    @GetMapping("/url")
    public List<UrlEntry> getAllUrls() {
        return new ArrayList<UrlEntry>(CACHE.values());
    }

    @PostMapping("/shorten")
    public boolean addUrlToShorten(@RequestBody UrlEntry urlEntry) {
        CACHE.put(urlEntry.getId(), urlEntry);
        System.out.println("added : " + urlEntry);
        return true;
    }

    @GetMapping("/url/{id}")
    public UrlEntry getUrlEntryById(@PathVariable Long id) {
        return CACHE.get(id);
    }

    @DeleteMapping("url/{id}")
    public UrlEntry deleteUrlEntryById(@PathVariable Long id) {
        return CACHE.remove(id);
    }
}
