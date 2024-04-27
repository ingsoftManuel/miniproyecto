package cue.edu.co.Service;

import cue.edu.co.config.DatabaseConnection;
import cue.edu.co.mapping.mappers.Mapper;
import cue.edu.co.repository.Repository;
import cue.edu.co.models.Vehicles;
import cue.edu.co.repository.impl.RepositoryJDBCImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class VehicleServiceImpl implements VehicleService {
    Connection conn = DatabaseConnection.getInstance();
    private RepositoryJDBCImpl studentRepository;

    public VehicleServiceImpl() throws SQLException {
        this.studentRepository = new RepositoryJDBCImpl();
    }

    @Override
    public List listStudent() throws SQLException {
        return studentRepository.list()
                .stream()
                .map(Mapper::mapfrommodel)
                .toList();
    }
}