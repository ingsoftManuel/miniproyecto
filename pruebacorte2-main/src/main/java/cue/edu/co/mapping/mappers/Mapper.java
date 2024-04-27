package cue.edu.co.mapping.mappers;
import cue.edu.co.mapping.dtos.VehiclesDto;
import cue.edu.co.models.Vehicles;

public class Mapper {

    public static VehiclesDto mapFromModel(Vehicles vehicles){
        return new VehiclesDto(vehicles.getId(), vehicles.getName(), vehicles.getType(), vehicles.getPrice(), vehicles.isAvailable());
    }

    public static Vehicles mapFromDTO(VehiclesDto vehicles){
        return Vehicles.builder()
                .id(vehicles.id())
                .name(vehicles.name())
                .type(vehicles.type())
                .price(vehicles.price())
                .available(vehicles.available())
                .build();
    }
}
