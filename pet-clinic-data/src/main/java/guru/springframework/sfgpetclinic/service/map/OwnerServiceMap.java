package guru.springframework.sfgpetclinic.service.map;

import com.sun.xml.bind.v2.model.core.ID;
import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.service.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<T> findAll() {
        return null;
    }

    @Override
    public void deleteById(ID id) {

    }

    @Override
    public void delete(T object) {

    }

    @Override
    public Owner save(Owner object) {
        return null;
    }

    @Override
    public T findById(ID id) {
        return null;
    }
}
