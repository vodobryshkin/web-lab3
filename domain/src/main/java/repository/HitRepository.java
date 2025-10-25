package repository;

import entities.Hit;

import java.util.List;
import java.util.Optional;

/**
 * Интерфейс для описания репозитория для попаданий.
 */
public interface HitRepository {
    /**
     * Метод для добавления попадания в репозиторий
     *
     * @param hit логическая модель попадания
     */
    void addHit(Hit hit);

    /**
     * Метод для получения элемента по его ID
     *
     * @param id UUID попадания, которое необходимо получить
     * @return попадание с данным id или null
     */
    Optional<Hit> getHitById(String id);

    /**
     * Метод для получения результатов всех попаданий
     *
     * @return результаты всех попаданий
     */
    List<Hit> getAllHits();
}
