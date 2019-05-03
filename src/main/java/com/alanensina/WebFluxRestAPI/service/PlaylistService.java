package com.alanensina.WebFluxRestAPI.service;

import com.alanensina.WebFluxRestAPI.document.Playlist;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PlaylistService {

	Flux<Playlist> findAll(); // Flux return one or more objects
	Mono<Playlist> findByID(String id); // Mono return zero or one object
	Mono<Playlist> save(Playlist playlist);
}