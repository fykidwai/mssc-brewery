package guru.springframework.msscbrewery.web.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewery.web.model.BeerDto;

@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerById(final UUID beerId) {
		return BeerDto.builder().id(beerId).beerName("Beer Name").beerStyle("Pale Ale").build();
	}

}
