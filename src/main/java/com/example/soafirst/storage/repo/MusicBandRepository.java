package com.example.soafirst.storage.repo;

import com.example.soafirst.storage.entity.MusicBand;
import com.example.soafirst.storage.entity.MusicGenre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MusicBandRepository extends JpaRepository<MusicBand, Long> {
    List<MusicBand> findAllById(Long id);

    Boolean existsByNumberOfParticipants(Long numberOfParticipants);

    void deleteAllByNumberOfParticipants(Long numberOfParticipants);

    List<MusicBand> findAllByNumberOfParticipants(Long numberOfParticipants);

    Long countMusicBandByNumberOfParticipants(Long numberOfParticipants);

    List<MusicBand> findAllByMusicGenre(MusicGenre genre);
}