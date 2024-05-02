package sazondelbueno.web.Servicio;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sazondelbueno.web.Modelo.Cuenta;
import sazondelbueno.web.Repositorio.CuentaRepositorio;

import java.util.List;
import java.util.Optional;

@Service
public class CuentaServicioImpl implements CuentaServicio {

    @Autowired
    private CuentaRepositorio repositorio;

    @Override
    public Cuenta guardarCuenta(Cuenta cuenta) {
        return repositorio.save(cuenta);
    }

    @Override
    public List<Cuenta> listarCuentas() {
        return repositorio.findAll();
    }

    @Override
    public Cuenta existeCuenta(String email, String password) {
        return repositorio.getByEmailAndPassword(email, password);
    }

    @Override
    public Optional<Cuenta> getById(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public boolean deleteById(Long id) {
        try {
            repositorio.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Cuenta updateById(Long id , Cuenta cuenta) {
        Cuenta c = repositorio.getReferenceById(id);
        BeanUtils.copyProperties(cuenta,c,"id");
        return repositorio.save(c);
    }
}
