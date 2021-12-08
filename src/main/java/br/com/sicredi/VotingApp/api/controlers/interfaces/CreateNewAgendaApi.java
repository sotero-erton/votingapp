/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package br.com.sicredi.VotingApp.api.controlers.interfaces;

import br.com.sicredi.VotingApp.requests.CooperativeIdentification;
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
@Api(value = "create-new-agenda", description = "the create-new-agenda API")
public interface CreateNewAgendaApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /create-new-agenda : CRIA UMA NOVA PAUTA
     * Cria uma nova Pauta tendo o Associado como criador.
     *
     * @param cooperativeIdentification Informações de uma nova Pauta. (optional)
     * @return Criado com sucesso. (status code 201)
     */
    @ApiOperation(value = "CRIA UMA NOVA PAUTA", nickname = "postCreateNewAgenda",
                  notes = "Cria uma nova Pauta tendo o Associado como criador.", tags = {"MinhasPautas",})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Criado com sucesso.")})
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/create-new-agenda",
            consumes = {"application/json"}
    )
    default ResponseEntity<Void> postCreateNewAgenda(
            @ApiParam(value = "Informações de uma nova Pauta.") @Valid @RequestBody(required = false)
                    CooperativeIdentification cooperativeIdentification) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
