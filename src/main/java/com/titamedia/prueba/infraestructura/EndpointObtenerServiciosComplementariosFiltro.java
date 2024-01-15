package com.titamedia.prueba.infraestructura;


import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ServiciosComplementarios")
@RequiredArgsConstructor
@Validated
public class EndpointObtenerServiciosComplementariosFiltro {

    private final EndpointObtenerServiciosComplementariosFiltro manejadorObtenerServiciosComplementariosFiltro;

}
