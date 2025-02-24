package com.group.server.api.controller;

import com.group.server.apiservice.service.StoreService;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1.0/store")
public class StoreController {

    private final StoreService storeService;

    @GetMapping
    public String getStoreName(@PathParam("id") Long id) {
        return storeService.getStoreName(id);
    }

}
