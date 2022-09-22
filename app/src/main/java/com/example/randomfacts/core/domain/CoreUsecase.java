package com.example.randomfacts.core.domain;

public class CoreUsecase {
    CoreRepository repository;
    public CoreUsecase(CoreRepository repository){
        this.repository = repository;
    }

    public FactEntity getRandomFact(){
        return this.repository.getRandom();
    }
}
