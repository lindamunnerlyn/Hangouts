// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class anh extends SQLiteOpenHelper
{

    public static final String a[] = {
        "type", "mmsc", "mmsproxy", "mmsport", "_id", "current", "numeric", "name", "mcc", "mnc", 
        "apn"
    };
    public static final String b[] = {
        "name", "mcc", "mnc", "apn", "user", "server", "password", "proxy", "port", "mmsc", 
        "mmsproxy", "mmsport", "authtype", "type", "protocol", "roaming_protocol", "carrier_enabled", "bearer", "mvno_type", "mvno_match_data", 
        "current"
    };
    public static final String c[] = {
        "key", "value", "type"
    };
    private static final boolean d = false;
    private static final String f[] = {
        "_id"
    };
    private SQLiteDatabase e;

    anh(Context context)
    {
        super(context, "apn.db", null, 2);
        e = getWritableDatabase();
        eev.c("Babel", "ApnDatabase constructor");
    }

    private static ContentValues a(Cursor cursor)
    {
        int j = cursor.getColumnCount();
        ContentValues contentvalues;
        if (j > 0)
        {
            ContentValues contentvalues1 = new ContentValues();
            int i = 0;
            do
            {
                contentvalues = contentvalues1;
                if (i >= j)
                {
                    break;
                }
                contentvalues1.put(cursor.getColumnName(i), cursor.getString(i));
                i++;
            } while (true);
        } else
        {
            contentvalues = null;
        }
        return contentvalues;
    }

    public static SQLiteDatabase a(Context context)
    {
        return ((anh)hlp.a(context, anh)).e;
    }

    public static List a(SQLiteDatabase sqlitedatabase)
    {
        Cursor cursor = sqlitedatabase.query("apn", b, "current NOT NULL", null, null, null, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        ArrayList arraylist = new ArrayList();
_L2:
        sqlitedatabase = arraylist;
        if (!cursor.moveToNext())
        {
            break MISSING_BLOCK_LABEL_76;
        }
        sqlitedatabase = a(cursor);
        if (sqlitedatabase == null) goto _L2; else goto _L1
_L1:
        arraylist.add(sqlitedatabase);
          goto _L2
        sqlitedatabase;
        if (d)
        {
            eev.a("Babel", "ApnDatabase.loadUserDataFromOldTable: no old user data", sqlitedatabase);
        }
        sqlitedatabase = null;
        return sqlitedatabase;
    }

    public static void a(SQLiteDatabase sqlitedatabase, List list)
    {
        if (list != null && list.size() > 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Iterator iterator = list.iterator();
_L7:
        if (!iterator.hasNext()) goto _L1; else goto _L3
_L3:
        Object obj;
        ContentValues contentvalues;
        contentvalues = (ContentValues)iterator.next();
        list = new StringBuilder();
        obj = new ArrayList();
        Iterator iterator1 = contentvalues.keySet().iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            String s1 = (String)iterator1.next();
            if (!"current".equals(s1))
            {
                if (list.length() > 0)
                {
                    list.append(" AND ");
                }
                String s2 = contentvalues.getAsString(s1);
                if (TextUtils.isEmpty(s2))
                {
                    list.append(s1).append(" IS NULL");
                } else
                {
                    list.append(s1).append("=?");
                    ((ArrayList) (obj)).add(s2);
                }
            }
        } while (true);
        obj = sqlitedatabase.query("apn", f, list.toString(), (String[])((ArrayList) (obj)).toArray(new String[((ArrayList) (obj)).size()]), null, null, null);
        if (obj == null) goto _L5; else goto _L4
_L4:
        list = ((List) (obj));
        if (!((Cursor) (obj)).moveToFirst()) goto _L5; else goto _L6
_L6:
        list = ((List) (obj));
        sqlitedatabase.update("apn", contentvalues, "_id=?", new String[] {
            ((Cursor) (obj)).getString(0)
        });
_L8:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
          goto _L7
_L5:
        list = ((List) (obj));
        contentvalues.put("numeric", dvc.a(contentvalues.getAsString("mcc"), contentvalues.getAsString("mnc")));
        list = ((List) (obj));
        sqlitedatabase.insert("apn", null, contentvalues);
          goto _L8
        SQLiteException sqliteexception;
        sqliteexception;
_L11:
        list = ((List) (obj));
        String s = String.valueOf(sqliteexception);
        list = ((List) (obj));
        eev.e("Babel", (new StringBuilder(String.valueOf(s).length() + 50)).append("ApnDatabase.saveUserDataFromOldTable: query error ").append(s).toString(), sqliteexception);
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
          goto _L7
        sqlitedatabase;
        list = null;
_L10:
        if (list != null)
        {
            list.close();
        }
        throw sqlitedatabase;
        sqlitedatabase;
        if (true) goto _L10; else goto _L9
_L9:
        sqliteexception;
        obj = null;
          goto _L11
    }

    public static void b(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.beginTransaction();
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS apn");
        sqlitedatabase.execSQL("CREATE TABLE apn(_id INTEGER PRIMARY KEY,name TEXT,numeric TEXT,mcc TEXT,mnc TEXT,apn TEXT,user TEXT,server TEXT,password TEXT,proxy TEXT,port TEXT,mmsproxy TEXT,mmsport TEXT,mmsc TEXT,authtype INTEGER,type TEXT,current INTEGER,protocol TEXT,roaming_protocol TEXT,carrier_enabled BOOLEAN,bearer INTEGER,mvno_type TEXT,mvno_match_data TEXT);");
        sqlitedatabase.endTransaction();
        f(sqlitedatabase);
    }

    public static void c(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.beginTransaction();
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS apn");
        sqlitedatabase.execSQL("CREATE TABLE apn(_id INTEGER PRIMARY KEY,name TEXT,numeric TEXT,mcc TEXT,mnc TEXT,apn TEXT,user TEXT,server TEXT,password TEXT,proxy TEXT,port TEXT,mmsproxy TEXT,mmsport TEXT,mmsc TEXT,authtype INTEGER,type TEXT,current INTEGER,protocol TEXT,roaming_protocol TEXT,carrier_enabled BOOLEAN,bearer INTEGER,mvno_type TEXT,mvno_match_data TEXT);");
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS mmsconfig");
        sqlitedatabase.execSQL("CREATE TABLE mmsconfig(_id INTEGER PRIMARY KEY,numeric TEXT,key TEXT,value TEXT,type TEXT);");
        sqlitedatabase.endTransaction();
    }

    public static void d(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS mmsconfig");
    }

    private static void e(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS apn;");
        sqlitedatabase.execSQL("CREATE TABLE apn(_id INTEGER PRIMARY KEY,name TEXT,numeric TEXT,mcc TEXT,mnc TEXT,apn TEXT,user TEXT,server TEXT,password TEXT,proxy TEXT,port TEXT,mmsproxy TEXT,mmsport TEXT,mmsc TEXT,authtype INTEGER,type TEXT,current INTEGER,protocol TEXT,roaming_protocol TEXT,carrier_enabled BOOLEAN,bearer INTEGER,mvno_type TEXT,mvno_match_data TEXT);");
        f(sqlitedatabase);
    }

    private static void f(SQLiteDatabase sqlitedatabase)
    {
        XmlResourceParser xmlresourceparser;
        if (d)
        {
            eev.b("Babel", "ApnDatabase loadApnTable");
        }
        xmlresourceparser = g.nU.getResources().getXml(g.ii);
        dtg dtg1 = dtg.a(xmlresourceparser);
        dtg1.a(new ani(sqlitedatabase));
        dtg1.a();
        xmlresourceparser.close();
        return;
        sqlitedatabase;
        Log.e("Babel", "Got exception while loading APN database.", sqlitedatabase);
        xmlresourceparser.close();
        return;
        sqlitedatabase;
        xmlresourceparser.close();
        throw sqlitedatabase;
    }

    public void close()
    {
        super.close();
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        e(sqlitedatabase);
        Object obj = dcn.l();
        if (obj == null)
        {
            return;
        } else
        {
            obj = aps.a(g.nU, ((aoa) (obj)).h()).b();
            a(sqlitedatabase, a(((apv) (obj)).e()));
            ((apv) (obj)).a("DROP TABLE IF EXISTS apn;");
            return;
        }
    }

    public void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        e(sqlitedatabase);
    }

    public void onOpen(SQLiteDatabase sqlitedatabase)
    {
        super.onOpen(sqlitedatabase);
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        e(sqlitedatabase);
    }

    static 
    {
        hnc hnc = eev.d;
    }
}
