package com.alanensina.WebFluxRestAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alanensina.WebFluxRestAPI.document.Playlist;
import com.alanensina.WebFluxRestAPI.repository.PlaylistRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PlaylistServiceImpl implements PlaylistService{

	@Autowired
	public PlaylistRepository pr;
	
	
	@Override
	public Flux<Playlist> findAll() {
		return pr.findAll();
	}

	@Override
	public Mono<Playlist> findByID(String id) {
		return pr.findById(id);
	}

	@Override
	public Mono<Playlist> save(Playlist playlist) {
		return pr.save(playlist);
	}
}