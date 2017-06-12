package com.guozhe.android.sqliteorm;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by guozhe on 2017. 6. 9..
 */

@DatabaseTable(tableName = "bbs")
public class Bbs {

    @DatabaseField
    private int id;
}
