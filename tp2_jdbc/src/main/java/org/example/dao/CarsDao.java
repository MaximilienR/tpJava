package org.example.dao;

import org.example.domain.Car;
import org.example.domain.Product;
import org.example.utils.ConnectionUtils;

import java.sql.*;
import java.util.List;

public class CarsDao implements DAOCars {

    /*public CarsDao(String name, int price, int puissance) {

    }*/


    @Override
    public Integer create(Car car) {
        return null;
    }

    @Override
    public List<Car> getAllCar() {
        return null;
    }

    @Override
    public Car getCar(Integer id){
        Car c =null;
        PreparedStatement statement=null;
        ResultSet rs =null;
        Connection connection=null;

        try {
            connection= ConnectionUtils.getMySQLConnection();
            String sql = "select * car where idCar  = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            rs=statement.executeQuery();

        if(rs.next()){
          c= new Car(
                  rs.getInt("idCar"),
                  rs.getString("name"),
                  rs.getInt("year"),
                  rs.getInt("chevaux"),
                  rs.getDouble("price"))
        ;};
        }catch (SQLSyntaxErrorException e){
            System.out.println("Error :"+e.getMessage());
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (rs !=null){
                    rs.close();
                }
                if (statement!=null){
                    statement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return  c;
        }

    @Override
    public int update(Car car) {
        return 0;
    }

    @Override
    public int delete(Car car) {
        return 0;
    }
}
