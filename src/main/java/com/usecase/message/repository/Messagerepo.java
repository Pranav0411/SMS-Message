package com.usecase.message.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usecase.message.model.Message;

public interface Messagerepo extends JpaRepository<Message, Integer> {

}
