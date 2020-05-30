package by.bsu.airline.serialization;

import by.bsu.airline.airlineData.Airline;

import java.io.*;

public class Serializator {
    public boolean seriralization(Airline airline, String fileName){
        boolean flag = false;
        File f = new File(fileName);
      try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f))){
          if(out != null){
              out.writeObject(airline);
              flag = true;
          }
      } catch (FileNotFoundException e) {
          e.printStackTrace();
      } catch (IOException e) {
          e.printStackTrace();
      }
        return flag;
    }

    public Airline deserialization(String fileName){
        File f = new File(fileName);
        Airline airline = null;
        try(ObjectInputStream input = new ObjectInputStream(new FileInputStream(f))){
            airline = (Airline) input.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return airline;
    }
}
