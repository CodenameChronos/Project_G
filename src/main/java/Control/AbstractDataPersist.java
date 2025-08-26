package Control;

import jakarta.persistence.*;

public abstract class AbstractDataPersist<AC>{

    @PersistenceContext
    protected EntityManager manager;

    protected Class<AC> entityClass;


    public AbstractDataPersist(Class<AC> entityClass) {
        this.entityClass = entityClass;
    }

    public void save(AC entity) {
        manager.persist(entity);
    }

    public void update(AC entity) {
        manager.merge(entity);
    }

    public void delete(AC entity) {
        manager.remove(manager.contains(entity) ? entity : manager.merge(entity));
    }

}
