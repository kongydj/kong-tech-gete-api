package com.example.gete.plugin.service;

import com.example.gete.plugin.model.entity.Entrance;
import com.example.gete.plugin.model.request.EntranceRequest;
import com.example.gete.plugin.repository.EntranceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntranceServiceImpl implements EntranceService {

    /*private final EntranceRepository entranceRepository;

    public EntranceServiceImpl(EntranceRepository entranceRepository) {
        this.entranceRepository = entranceRepository;
    }

    @Override
    public List<Entrance> getEntranceList() {
        return null;
    }

    @Override
    public Entrance createEntrance(EntranceRequest request) {

        Entrance entrance = new Entrance();
        //entrance = entranceRepository.save(request);

        return entrance;
    }

    @Override
    public Entrance deleteEntrance(Long id) {
        return null;
    }

    @Override
    public Entrance updateEntrance(Long id, EntranceRequest request) {
        return null;
    }

    @Override
    public Entrance getOneEntrance(Long id) {
        return null;
    }*/
}
