package com.kangwon.clip06;

import reactor.core.publisher.Flux;

public class Operator1 {
    // map

    public Flux<Integer> fluxMap() {
        return Flux.range(1, 5)
                .map(i -> i * 2)
                .log();
    }

    public Flux<Integer> fluxFilter() {
        return Flux.range(1, 10)
                .filter(i -> i > 5)
                .log();
    }

    public Flux<Integer> fluxTake() {
        return Flux.range(1, 10)
                .filter(i -> i>5)
                .take(3)
                .log();
    }

    public Flux<Integer> fluxFlatMap() {
        return Flux.range(1, 10)
                .flatMap(i -> Flux.range(i*10, 10))
                .log();
    }

    public Flux<Integer> fluxFlatMap2() {
        return Flux.range(1, 9)
                .flatMap(i -> Flux.range(1, 9)
                        .map(j -> {
                            System.out.printf("%d * %d = %d\n", i, j, i*j);
                            return i*j;
                        }));
    }
}