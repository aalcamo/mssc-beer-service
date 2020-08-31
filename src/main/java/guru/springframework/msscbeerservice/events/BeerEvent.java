package guru.springframework.msscbeerservice.events;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class BeerEvent implements Serializable {

    static final long serialVersionUID = -5311404787329924096L;

    private final BeerDto beerDto;
}
