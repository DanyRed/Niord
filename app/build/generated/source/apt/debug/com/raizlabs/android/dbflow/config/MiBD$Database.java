package com.raizlabs.android.dbflow.config;

import java.util.ArrayList;
import java.util.List;
public final class MiBD$Database extends BaseDatabaseDefinition {


  public MiBD$Database(DatabaseHolder holder) {
    // Writing for: MiBD
    holder.putDatabaseForTable(com.dany.niord.db.Invitado.class, this);

    // Begin Migrations
    // End Migrations

    models.add(com.dany.niord.db.Invitado.class);
    modelTableNames.put("Invitado", com.dany.niord.db.Invitado.class);
    modelAdapters.put(com.dany.niord.db.Invitado.class, new com.dany.niord.db.Invitado$Adapter());
    // Writing Query Models
  }

  @Override
  public final boolean isForeignKeysSupported() {
    return false;
  }

  @Override
  public final boolean backupEnabled() {
    return false;
  }

  @Override
  public final boolean areConsistencyChecksEnabled() {
    return false;
  }

  @Override
  public final int getDatabaseVersion() {
    return 2;
  }

  @Override
  public final String getDatabaseName() {
    return "MiBD";
  }
}
