
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TDB.MsSeguridad.repository.IAuthRepository;
import TDB.MsSeguridad.model.UsuarioModel;

@Service
public class AuthService {
    
    @Autowired
    IAuthRepository authRepository;

    public UsuarioModel create(UsuarioModel usuario){
        return authRepository.save(usuario);
    }

}