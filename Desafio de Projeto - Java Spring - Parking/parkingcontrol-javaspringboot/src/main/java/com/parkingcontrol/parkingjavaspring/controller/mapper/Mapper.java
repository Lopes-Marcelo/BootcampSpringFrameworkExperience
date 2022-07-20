package com.parkingcontrol.parkingjavaspring.controller.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.parkingcontrol.parkingjavaspring.controller.dto.CreateDTO;
import com.parkingcontrol.parkingjavaspring.controller.dto.ParkingDTO;
import com.parkingcontrol.parkingjavaspring.model.Parking;

@Component
public class Mapper {

    private static final ModelMapper MODEL_MAPPER = new ModelMapper();

    public ParkingDTO toParkingDTO(Parking parking) {
        return MODEL_MAPPER.map(parking, ParkingDTO.class);
    }

    public List<ParkingDTO> toParkingDTOList(List<Parking> parkingList) {
        return parkingList.stream().map(this::toParkingDTO).collect(Collectors.toList());
    }

    public Parking toParking(ParkingDTO dto) {
        return MODEL_MAPPER.map(dto, Parking.class);
    }

    public Parking toParkingCreate(CreateDTO dto) {
        return MODEL_MAPPER.map(dto, Parking.class);
    }
}
