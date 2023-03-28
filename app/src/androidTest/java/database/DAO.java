package database;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface DAO {
    @Query("SELECT * FROM Exemplar")
    List<Exemplar> getAll();

    @Query("SELECT * FROM Exemplar WHERE id = :id")
    Exemplar getById(long id);

    @Query("SELECT * FROM Exemplar WHERE city = :city")
    Exemplar getByCity(String city);

    @Query("SELECT * FROM Exemplar WHERE country = :country")
    Exemplar getByCountry(String country);

    @Insert
    void insert(Exemplar exemplar);

    @Update
    void update(Exemplar exemplar);

    @Delete
    void delete(Exemplar exemplar);

}
