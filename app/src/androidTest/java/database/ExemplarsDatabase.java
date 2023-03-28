package database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;


@TypeConverters(DAO.class)
@Database(entities = {Exemplar.class}, version = 1)
public abstract class ExemplarsDatabase extends RoomDatabase {

}
