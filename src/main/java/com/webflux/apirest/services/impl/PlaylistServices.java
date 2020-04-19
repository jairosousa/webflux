package com.webflux.apirest.services.impl;

import com.webflux.apirest.document.Playlist;
import com.webflux.apirest.repository.PlaylistRepository;
import com.webflux.apirest.services.PlaylistService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PlaylistServices implements PlaylistService {

    private final PlaylistRepository repository;

    public PlaylistServices(PlaylistRepository repository) {
        this.repository = repository;
    }

    @Override
    public Flux<Playlist> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Mono<Playlist> findById(String id) {
        return this.repository.findById(id);
    }

    @Override
    public Mono<Playlist> save(Playlist playlist) {
        return this.repository.save(playlist);
    }
}
