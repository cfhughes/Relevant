package edu.cnm.deepdive.relevant.model.entity;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import java.util.Date;


@Entity(

    foreignKeys = {
        @ForeignKey(
            entity = User.class,
            parentColumns = "user_id", childColumns = "user_id",
            onDelete = ForeignKey.CASCADE
        ),
        @ForeignKey(
            entity = Category.class,
            parentColumns = "category_id", childColumns = "category_id",
            onDelete = ForeignKey.CASCADE
        )
    }
)
public class Search {
  @ColumnInfo(name = "category_id", index = true)
  private long categoryId;

  @ColumnInfo(name = "search_id")
  @PrimaryKey(autoGenerate = true)
  private long id;

  @ColumnInfo(index = true)
  private Date date;

  @ColumnInfo(name = "user_id", index = true)
  private long userId;

  @ColumnInfo(name = "url", index = true)
  private long url;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public long getUrl() {
    return url;
  }

  public void setUrl(long url) {
    this.url = url;
  }

  public long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(long categoryId) {
    this.categoryId = categoryId;
  }
}


