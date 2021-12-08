package br.com.sicredi.VotingApp.api.controlers.interfaces;

import br.com.sicredi.VotingApp.responses.Login;
import org.openapitools.responses.AccessAndPermissions;
import org.openapitools.api.controlers.ApiUtil;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import java.util.Optional;

@Validated
@Api(value = "credentials")
public interface CredentialsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /credentials : CREDENCIAIS DE ACESSO E OPERAÇÃO
     * End-Point que será usado para validar acesso. Adicionalmente o end-point prove informações de permissão, tais como: - Usuário está habilitado, no momento, à participar de votações; - Usuário possui permissão para Gerencias Seções de Votação.
     *
     * @param Login (optional)
     * @return Example response (status code 200)
     */
    @ApiOperation(value = "CREDENCIAIS DE ACESSO E OPERAÇÃO", nickname = "postCredentials",
                  notes = "End-Point que será usado para validar acesso. Adicionalmente o end-point prove informações de permissão, tais como: - Usuário está habilitado, no momento, à participar de votações; - Usuário possui permissão para Gerencias Seções de Votação.",
                  response = AccessAndPermissions.class, tags = {"login",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Example response", response = AccessAndPermissions.class)})
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/credentials",
            produces = {"application/json"},
            consumes = {"application/json", "application/xml"}
    )
    default ResponseEntity<AccessAndPermissions> postCredentials(
            @ApiParam(value = "") @Valid @RequestBody(required = false) Login Login) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString =
                            "{ \"acesso\" : true, \"voting-sections\" : true, \"cpf\" : \"cpf\", \"vote\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
