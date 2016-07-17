package com.dany.niord.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.sql.SqlUtils;
import com.raizlabs.android.dbflow.sql.builder.Condition;
import com.raizlabs.android.dbflow.sql.builder.ConditionQueryBuilder;
import com.raizlabs.android.dbflow.sql.language.Select;
import com.raizlabs.android.dbflow.structure.ModelAdapter;
// This table belongs to the MiBD database
public final class Invitado$Adapter extends ModelAdapter<Invitado> {

  @Override
  public Class<Invitado> getModelClass() {
    return Invitado.class;
  }

  @Override
  public String getTableName() {
    return com.dany.niord.db.Invitado$Table.TABLE_NAME;
  }

  @Override
  protected final String getInsertStatementQuery() {
    return "INSERT INTO `Invitado` (`NOMBRE`, `APELLIDO`) VALUES (?, ?)";
  }

  @Override
  public void bindToStatement(android.database.sqlite.SQLiteStatement statement, Invitado model) {
    if (((java.lang.String)model.nombre) != null)  {
      statement.bindString(1,((java.lang.String)model.nombre));
    } else {
      statement.bindNull(1);
    }
    if (((java.lang.String)model.apellido) != null)  {
      statement.bindString(2,((java.lang.String)model.apellido));
    } else {
      statement.bindNull(2);
    }

  }

  @Override
  public void bindToContentValues(ContentValues contentValues, Invitado model) {
    contentValues.put("id",((int)model.id));
    if (((java.lang.String)model.nombre) != null)  {
      contentValues.put("nombre",((java.lang.String)model.nombre));
    } else {
      contentValues.putNull("nombre");
    }
    if (((java.lang.String)model.apellido) != null)  {
      contentValues.put("apellido",((java.lang.String)model.apellido));
    } else {
      contentValues.putNull("apellido");
    }

  }

  @Override
  public void bindToInsertValues(ContentValues contentValues, Invitado model) {
    if (((java.lang.String)model.nombre) != null)  {
      contentValues.put("nombre",((java.lang.String)model.nombre));
    } else {
      contentValues.putNull("nombre");
    }
    if (((java.lang.String)model.apellido) != null)  {
      contentValues.put("apellido",((java.lang.String)model.apellido));
    } else {
      contentValues.putNull("apellido");
    }

  }

  @Override
  public boolean exists(Invitado model) {
    return  ((int)model.id) > 0;
  }

  @Override
  public void loadFromCursor(Cursor cursor, Invitado model) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1)  {
      model.id = cursor.getInt(indexid);
    }
    int indexnombre = cursor.getColumnIndex("nombre");
    if (indexnombre != -1)  {
      if (cursor.isNull(indexnombre)) {
        model.nombre = null;
      } else {
        model.nombre = cursor.getString(indexnombre);
      }
    }
    int indexapellido = cursor.getColumnIndex("apellido");
    if (indexapellido != -1)  {
      if (cursor.isNull(indexapellido)) {
        model.apellido = null;
      } else {
        model.apellido = cursor.getString(indexapellido);
      }
    }
  }

  @Override
  public void updateAutoIncrement(Invitado model, long id) {
    model.id = ((int)id);
  }

  @Override
  public long getAutoIncrementingId(Invitado model) {
    return ((long)model.id);
  }

  @Override
  public String getAutoIncrementingColumnName() {
    return Invitado$Table.ID;
  }

  @Override
  public ConditionQueryBuilder<Invitado> getPrimaryModelWhere(Invitado model) {
    return new ConditionQueryBuilder<Invitado>(Invitado.class, Condition.column(Invitado$Table.ID).is((model.id)));
  }

  @Override
  public ConditionQueryBuilder<Invitado> createPrimaryModelWhere() {
    return new ConditionQueryBuilder<Invitado>(Invitado.class, Condition.column(Invitado$Table.ID).is("?"));
  }

  @Override
  public String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `Invitado`(`id` INTEGER PRIMARY KEY AUTOINCREMENT, `nombre` TEXT, `apellido` TEXT);";
  }

  @Override
  public final Invitado newInstance() {
    return new com.dany.niord.db.Invitado();
  }
}
