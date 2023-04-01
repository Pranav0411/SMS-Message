package com.usecase.message.service;

import java.util.List;

import com.usecase.message.payload.Datattransfer;

public interface Services {
	
	Datattransfer createMessage(Datattransfer dt);
	List<Datattransfer> getAllMessages();

}
