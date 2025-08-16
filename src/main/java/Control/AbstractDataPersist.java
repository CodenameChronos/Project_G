package Control;

import jakarta.persistence.*;

public abstract class AbstractDataPersist {

    @PersistenceContext
    protected EntityManager em;

}
