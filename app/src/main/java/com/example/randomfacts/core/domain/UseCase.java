package com.example.randomfacts.core.domain;

public interface UseCase<T> {
     T execute() throws Exception ;
}
