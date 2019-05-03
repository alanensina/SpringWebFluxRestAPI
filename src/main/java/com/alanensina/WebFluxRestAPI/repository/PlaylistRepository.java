package com.alanensina.WebFluxRestAPI.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.alanensina.WebFluxRestAPI.document.Playlist;

public interface PlaylistRepository extends ReactiveMongoRepository<Playlist, String>{ // CRUD operations is already done with ReactiveMongoRepository
	
}