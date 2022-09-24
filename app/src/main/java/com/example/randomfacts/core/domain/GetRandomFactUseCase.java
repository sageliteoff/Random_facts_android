package com.example.randomfacts.core.domain;

public class GetRandomFactUseCase implements UseCase<FactEntity> {
    CoreRepository repository;
    public GetRandomFactUseCase(CoreRepository repository){
        this.repository = repository;
    }

    public FactEntity execute() throws Exception {
        return this.repository.getRandom();
    }
}
