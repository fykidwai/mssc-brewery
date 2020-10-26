package guru.springframework.msscbrewery.web.controller.v2;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import guru.springframework.msscbrewery.web.service.v2.BeerServiceV2;
import lombok.RequiredArgsConstructor;

@RequestMapping("/api/v2/beer")
@RestController
@RequiredArgsConstructor
public class BeerControllerV2 {

    private final BeerServiceV2 beerService;

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDtoV2> getBeer(@PathVariable("beerId") final UUID beerId) {
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Object> saveBeer(@Valid @RequestBody final BeerDtoV2 beerDto) {
        final var beerDto2 = beerService.saveBeer(beerDto);
        final var httpHeaders = new HttpHeaders();
        httpHeaders.add("Location", "/api/v1/beer/" + beerDto2.getId());
        return new ResponseEntity<>(httpHeaders, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<Object> updateBeer(@PathVariable("beerId") final UUID beerId,
        @Valid @RequestBody final BeerDtoV2 beerDto) {
        beerService.updateBeer(beerId, beerDto);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable("beerId") final UUID beerId) {
        beerService.deleteById(beerId);
    }
}
