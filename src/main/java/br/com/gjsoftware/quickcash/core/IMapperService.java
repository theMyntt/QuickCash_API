package br.com.gjsoftware.quickcash.core;

public interface IMapperService<Aggregate, Entity> {
    Aggregate toDomain(Entity target);
    Entity toPersistance(Aggregate schema);
}
