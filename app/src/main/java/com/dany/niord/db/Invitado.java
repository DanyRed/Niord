package com.dany.niord.db;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.sql.language.Delete;
import com.raizlabs.android.dbflow.sql.language.Select;
import com.raizlabs.android.dbflow.structure.BaseModel;

import java.util.List;

@Table(databaseName = MiBD.NAME)
public class Invitado extends BaseModel {
    @Column
    @PrimaryKey(autoincrement = true)
     public int id;
    @Column
    public String nombre;


    @Column
    public String apellido;

    public static List<Invitado> getAllInvitados(){
        return new Select().from(Invitado.class).queryList();
    }

    public static void deleteAllInvitados(){
        new Delete().from(Invitado.class).query();
    }

}
