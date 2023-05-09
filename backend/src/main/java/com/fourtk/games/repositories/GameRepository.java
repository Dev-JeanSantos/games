package com.fourtk.games.repositories;

import com.fourtk.games.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
