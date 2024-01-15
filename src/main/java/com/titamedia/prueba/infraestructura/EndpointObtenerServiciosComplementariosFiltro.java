package com.titamedia.prueba.infraestructura;


import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ServiciosComplementarios")
@RequiredArgsConstructor
@Validated
//@PreAuthorize("hasAuthority('Solicitante') or hasAuthority('Aprobador')")
public class EndpointObtenerServiciosComplementariosFiltro {

    private final EndpointObtenerServiciosComplementariosFiltro manejadorObtenerServiciosComplementariosFiltro;

    @GetMapping()
    public ObjetoRespuestaSolicitud ejecutarObtenerSolicitudes(@NotNull ObtenerSolicitudesFiltroComando obtenerSolicitudesFiltroComando) {
        UsuarioContextoComando usuarioDatos = (UsuarioContextoComando) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        ObjetoRespuestaSolicitud solicitudes = manejadorObtenerSolicitudesFiltro.ejecutar(obtenerSolicitudesFiltroComando, usuarioDatos.getId());
        return solicitudes;
    }

}

