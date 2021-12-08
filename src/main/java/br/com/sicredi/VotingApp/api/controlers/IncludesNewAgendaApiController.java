package br.com.sicredi.VotingApp.api.controlers;

import br.com.sicredi.VotingApp.api.controlers.interfaces.IncludesNewAgendaApi;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

@RestController
@CrossOrigin( origins = "*" )
@RequestMapping("${openapi.sicredVotingOfAgendas.base-path:}")
public class IncludesNewAgendaApiController implements IncludesNewAgendaApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public IncludesNewAgendaApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
