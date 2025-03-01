package com.kangwon.clip06;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public class Publisher {

    Flux<Integer> startFlux() {
//        Flux.just(1, 2, 3, 4, 5);
        return Flux.range(1, 10).log();
//        Flux.fromIterable(List.of("a", "b", "c", "d", "e", "f"));
    }

    public Flux<String> startFlux2() {
        return Flux.fromIterable(List.of("a", "b", "c", "d")).log();
    }

    public Mono<Integer> startMono() {
        return Mono.just(1);
    }

    public Mono<?> startMono2() {
        return Mono.empty().log();
    }

    public Mono<?> startMono3() {
        return Mono.error(new Exception("hello reactor"));
    }

}
