package by.bsu.watches.JDBC;

import by.bsu.watches.entity.Makers;
import by.bsu.watches.entity.Watches;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Find {
    public static void findMakerOfType(String type){
        try {
            Statement statement = MyConnection.getMyConnection().createStatement();
            String sql = "select maker from watches where type = '"+ type + "'";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String maker = resultSet.getString(1);
                System.out.println(maker);
            }
            if(MyConnection.getMyConnection() != null){
                MyConnection.getMyConnection().close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void findPrice(int prices){
        try {
            Statement statement = MyConnection.getMyConnection().createStatement();
            String sql = " select * from watches where type='mecanic' and price<"+ prices;
            ResultSet resultSet = statement.executeQuery(sql);
            List<Watches> watches = new ArrayList<>();
            while (resultSet.next()) {
                String maker = resultSet.getString(1);
                String type = resultSet.getString(2);
                int price = resultSet.getInt(3);
                int number = resultSet.getInt(4);
                String requisites = resultSet.getString(5);
                watches.add(new Watches(maker, type, price, number, requisites));
            }
            Iterator<Watches> iterator = watches.iterator();
            while (iterator.hasNext()){
                System.out.println(((Watches)iterator).toString());
            }
            if(MyConnection.getMyConnection() != null){
                MyConnection.getMyConnection().close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void findCountry(String country){
        try {
            Statement statement = MyConnection.getMyConnection().createStatement();
            String sql = "select maker from makers where contry = '" + country + "'";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String maker = resultSet.getString(1);
                System.out.println(maker);
            }
            if(MyConnection.getMyConnection() != null){
                MyConnection.getMyConnection().close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void findMakerNumber(int number){
        try {
            Statement statement = MyConnection.getMyConnection().createStatement();
            String sql = "select t1.maker from (select makers.maker , sum(number) as totalnumber from makers inner join watches on makers.maker=watches.maker group by makers.maker) as t1 where totalnumber<" + number;
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String maker = resultSet.getString(1);
                System.out.println(maker);
            }
            if(MyConnection.getMyConnection() != null){
                MyConnection.getMyConnection().close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
