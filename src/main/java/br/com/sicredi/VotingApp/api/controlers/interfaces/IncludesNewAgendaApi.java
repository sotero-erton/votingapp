package br.com.sicredi.VotingApp.api.controlers.interfaces;

import br.com.sicredi.VotingApp.requests.AgendaInformation;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import java.util.Optional;

@Validated
@Api(value = "includes-new-agenda")
public interface IncludesNewAgendaApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /includes-new-agenda : INCLUI UMA NOVA PAUTA
     * Efetiva a inclusão de uma nova Pauta
     *
     * @param agendaInformation Informações de uma nova Pauta. (optional)
     * @return Nova Pauta incluída com sucesso. (status code 201)
     */
    @ApiOperation(value = "INCLUI UMA NOVA PAUTA", nickname = "includesNewAgenda",
                  notes = "Efetiva a inclusão de uma nova Pauta", tags = {"MinhasPautas",})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Nova Pauta incluída com sucesso.")})
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/includes-new-agenda",
            consumes = {"application/json"}
    )
    default ResponseEntity<Void> includesNewAgenda(
            @ApiParam(value = "Informações de uma nova Pauta.") @RequestBody(required = false) @Valid
                    AgendaInformation agendaInformation) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
