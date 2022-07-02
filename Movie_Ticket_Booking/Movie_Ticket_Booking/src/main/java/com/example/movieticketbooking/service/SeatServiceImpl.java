package com.example.movieticketbooking.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.movieticketbooking.dao.SeatRepository;
import com.example.movieticketbooking.entity.Screen;
import com.example.movieticketbooking.entity.Seat;
import com.example.movieticketbooking.exception.ScreenNotFoundException;
import com.example.movieticketbooking.exception.SeatNotFoundException;

@Service  //service annotation means that it perform service related tasks present in service layer.
public class SeatServiceImpl implements SeatService {
	
	private SeatRepository seatRepository;
	
	@Autowired //used for dependency injection.
    public SeatServiceImpl(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }

	@Override
	public List<Seat> findAll() {
		// TODO Auto-generated method stub
		
		return seatRepository.findAll();
		
		
	}

	@Override
	public Seat findById(int seatId) throws SeatNotFoundException{
		// TODO Auto-generated method stub
		Optional<Seat> result=seatRepository.findById(seatId);
		
		Seat theSeat=null;
		
		if(result.isPresent())
		{
			theSeat=result.get();
		}
		else
		{
			throw  new SeatNotFoundException("Did not found Seat id-"+seatId);
		}
		return theSeat;
		
	}

	@Override
	public void save(Seat theSeat) {
		// TODO Auto-generated method stub
		seatRepository.save(theSeat);
	}

	@Override
	public String deleteById(int seatId) throws SeatNotFoundException {
		// TODO Auto-generated method stub

		Optional<Seat> theSeat=seatRepository.findById(seatId);

		
		
		
		// throw exception if null
		
		if (!theSeat.isPresent()) {
			throw new SeatNotFoundException("seat id not found - " + seatId);
		}
		
		seatRepository.deleteById(seatId);
		
		return "Deleted seat id - " + seatId;
		
	}

	@Override
	public Seat findAllByScreenId(int screenId) {
		// TODO Auto-generated method stub
		return findAllByScreenId(screenId) ;
	}

    


	
}
	
	
	