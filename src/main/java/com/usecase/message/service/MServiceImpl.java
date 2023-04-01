package com.usecase.message.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usecase.message.model.Message;
import com.usecase.message.payload.Datattransfer;
import com.usecase.message.repository.Messagerepo;

@Service
public class MServiceImpl implements Services {

	@Autowired
	private Messagerepo messagerepo;
	
	public MServiceImpl(Messagerepo messagerepo) {
		super();
		this.messagerepo = messagerepo;
	}
	
	@Override
	public Datattransfer createMessage(Datattransfer dt) {
		
		Message m = this.mtodt(dt);
		Message savedm = this.messagerepo.save(m);
		// TODO Auto-generated method stub
		return this.dttom(savedm);
	}

	

	@Override
	public List<Datattransfer> getAllMessages() {
		
		List<Message> m = this.messagerepo.findAll();
		List<Datattransfer> mess =  m.stream().map(message->this.dttom(message)).collect(Collectors.toList());
		// TODO Auto-generated method stub
		return mess;
	}
	
	private Message mtodt(Datattransfer dt)
	{
		Message m = new Message();
		m.setId(dt.getId());
		m.setStudent(dt.getStudent());
		m.setTeacher(dt.getTeacher());
		m.setMessage(dt.getMessage());
		return m;
	}
	
	private Datattransfer dttom(Message m)
	{
		Datattransfer dt = new Datattransfer();
		dt.setId(m.getId());
		dt.setStudent(m.getStudent());
		dt.setTeacher(m.getTeacher());
		dt.setMessage(m.getMessage());
		return dt;
	}

}
