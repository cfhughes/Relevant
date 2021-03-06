package edu.cnm.deepdive.relevant.model.dao;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import edu.cnm.deepdive.relevant.model.entity.Category;
import edu.cnm.deepdive.relevant.model.entity.Search;
import java.util.List;

@Dao

public interface CategoryDao {

  @Query("SELECT * FROM Category WHERE category_id = :categoryId")
  Category findFirstByCategoryId(long categoryId);

  @Insert
  List<Long> insert(Category... Categories);

  @Delete
  int Delete(Category... Categories);




}
