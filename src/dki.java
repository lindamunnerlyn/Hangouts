// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class dki extends SQLiteOpenHelper
    implements cck
{

    private static final boolean a = false;
    private final long b;
    private SQLiteDatabase c;

    dki(Context context)
    {
        super(context, "message_store.db", null, 60);
        c = getWritableDatabase();
        b = ((ecs)hgx.a(context, ecs)).d();
        ebw.c("Babel_RequestWriter", "RequestWriterDatabase init");
    }

    public static dki a(Context context)
    {
        return (dki)hgx.a(context, dki);
    }

    private static void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS messages;");
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS requests;");
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS responses;");
        sqlitedatabase.execSQL("CREATE TABLE requests (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, version_code INT NOT NULL,queue_name TEXT NOT NULL,account INT NOT NULL,server_request BLOB NOT NULL,fail_count INT NOT NULL,server_fail_count INT NOT NULL,server_target_retry INT NOT NULL,creation_time INT NOT NULL);");
        sqlitedatabase.execSQL("CREATE TABLE responses (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, version_code INT NOT NULL,creation_time INT NOT NULL,server_response BLOB NOT NULL);");
        sqlitedatabase = new File(g.f());
        if (sqlitedatabase.exists())
        {
            sqlitedatabase = sqlitedatabase.listFiles();
            int j = sqlitedatabase.length;
            for (int i = 0; i < j; i++)
            {
                g.a(sqlitedatabase[i].getName(), 0, 0);
            }

        }
    }

    private void a(String s, long l)
    {
        if (a)
        {
            ebw.b("Babel_RequestWriter", (new StringBuilder(String.valueOf(s).length() + 39)).append("Deleting row ").append(l).append(" from ").append(s).toString());
        }
        String s1 = Long.toString(l);
        int i = c.delete(s, "_id=?", new String[] {
            s1
        });
        if (i != 1)
        {
            ebw.f("Babel_RequestWriter", (new StringBuilder(54)).append("Expected to delete 1 row but deleted ").append(i).append(" rows.").toString());
        }
    }

    private boolean a(String as[], List list)
    {
        String s;
        int i;
        long l;
        long l2;
        if (as == null)
        {
            s = null;
        } else
        {
            s = "_id = ?";
        }
        as = c.query("requests", dkj.a, s, as, null, null, "creation_time ASC");
        if (a)
        {
            i = as.getCount();
            ebw.b("Babel_RequestWriter", (new StringBuilder(29)).append("Decoding ").append(i).append(" messages").toString());
        }
_L1:
        if (!as.moveToNext())
        {
            break MISSING_BLOCK_LABEL_333;
        }
        l = as.getLong(1);
        if (l >= b)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        l2 = b;
        ebw.f("Babel_RequestWriter", (new StringBuilder(100)).append("Dropping all pending request(s) due to apk upgrade from ").append(l).append(" => ").append(l2).toString());
        as.close();
        return false;
        long l1 = as.getLong(0);
        if (a)
        {
            ebw.b("Babel_RequestWriter", (new StringBuilder(33)).append("Decoding row ").append(l1).toString());
        }
        Object obj = dkl.a(as.getBlob(4));
        obj = new ccf(l1, as.getString(2), as.getInt(3), as.getInt(5), as.getInt(6), as.getLong(7), ((ccg) (obj)));
        if (a)
        {
            String s1 = String.valueOf(obj);
            ebw.b("Babel_RequestWriter", (new StringBuilder(String.valueOf(s1).length() + 25)).append("Restoring ServerRequest: ").append(s1).toString());
        }
        list.add(obj);
          goto _L1
        list;
        ebw.e("Babel_RequestWriter", "Failed to decode pending requests", list);
        as.close();
        return false;
        as.close();
        return true;
        list;
        as.close();
        throw list;
    }

    public long a(cvn cvn1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("version_code", Long.valueOf(b));
        contentvalues.put("creation_time", Long.valueOf(System.currentTimeMillis()));
        contentvalues.put("server_response", cvn1.f());
        long l = c.insert("responses", null, contentvalues);
        gbh.b("Database insert failed", Long.valueOf(l), Integer.valueOf(-1));
        return l;
    }

    public void a(long l)
    {
        a("requests", l);
    }

    public void a(ccf ccf1)
    {
        ContentValues contentvalues = new ContentValues();
        ccf1 = ccf1.a;
        contentvalues.put("fail_count", Integer.valueOf(((cci) (ccf1)).d));
        contentvalues.put("server_fail_count", Integer.valueOf(((cci) (ccf1)).e));
        contentvalues.put("server_target_retry", Long.valueOf(((cci) (ccf1)).f));
        long l = ((cci) (ccf1)).a;
        c.update("requests", contentvalues, "_id=?", new String[] {
            String.valueOf(l)
        });
    }

    void a(dkb dkb1)
    {
        Object obj = new ArrayList();
        if (!a(((String []) (null)), ((List) (obj))))
        {
            int i = c.delete("requests", "1", null);
            boolean flag;
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gbh.a(flag);
            ebw.f("Babel_RequestWriter", (new StringBuilder(38)).append("Dropped ").append(i).append(" pending request(s)").toString());
            g.a(null, 1982);
            RealTimeChatService.c();
        } else
        {
            obj = ((List) (obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                ccf ccf1 = (ccf)((Iterator) (obj)).next();
                if (dbf.e(ccf1.a.c) == null)
                {
                    int j = ccf1.a.c;
                    ebw.a("Babel_RequestWriter", (new StringBuilder(51)).append("Ignoring message restore for account id ").append(j).toString());
                } else
                {
                    dkb1.a(ccf1);
                }
            }
        }
    }

    public long b(ccf ccf1)
    {
        int i = ccf1.a.c;
        cci cci1 = ccf1.a;
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("version_code", Long.valueOf(b));
        contentvalues.put("account", Integer.valueOf(i));
        contentvalues.put("queue_name", cci1.b);
        contentvalues.put("server_request", ccf1.e());
        contentvalues.put("creation_time", Long.valueOf(cci1.g));
        contentvalues.put("fail_count", Integer.valueOf(cci1.d));
        contentvalues.put("server_fail_count", Integer.valueOf(cci1.e));
        contentvalues.put("server_target_retry", Long.valueOf(cci1.f));
        long l1;
        try
        {
            ccf1.a.a = c.insert("requests", null, contentvalues);
            if (a)
            {
                long l = ccf1.a.a;
                ebw.b("Babel_RequestWriter", (new StringBuilder(34)).append("Wrote request ").append(l).toString());
            }
            l1 = ccf1.a.a;
        }
        // Misplaced declaration of an exception variable
        catch (ccf ccf1)
        {
            ebw.e("Babel_RequestWriter", "caught constraint exception ", ccf1);
            return 0L;
        }
        return l1;
    }

    public ccf b(long l)
    {
        ArrayList arraylist = new ArrayList();
        if (a(new String[] {
    Long.toString(l)
}, arraylist) && arraylist.size() > 0)
        {
            return (ccf)arraylist.get(0);
        } else
        {
            return null;
        }
    }

    public cvn c(long l)
    {
        Cursor cursor = c.query("responses", dkk.a, "_id = ?", new String[] {
            Long.toString(l)
        }, null, null, null);
        Object obj;
        int i;
        i = cursor.getCount();
        obj = (new StringBuilder(48)).append("Did not find row for row id ").append(l).toString();
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gbh.b(((String) (obj)), flag);
        obj = (new StringBuilder(54)).append("Found ").append(i).append(" rows for row id ").append(l).toString();
        if (i > 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gbh.b(((String) (obj)), flag);
        if (a)
        {
            ebw.b("Babel_RequestWriter", (new StringBuilder(37)).append("Getting response ").append(l).toString());
        }
        cursor.moveToNext();
        if ((long)cursor.getInt(1) == b)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        d(l);
        cursor.close();
        return null;
        obj = dkl.b(cursor.getBlob(3));
        cursor.close();
        return ((cvn) (obj));
        Exception exception;
        exception;
        cursor.close();
        throw exception;
    }

    public void d(long l)
    {
        a("responses", l);
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE requests (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, version_code INT NOT NULL,queue_name TEXT NOT NULL,account INT NOT NULL,server_request BLOB NOT NULL,fail_count INT NOT NULL,server_fail_count INT NOT NULL,server_target_retry INT NOT NULL,creation_time INT NOT NULL);");
        sqlitedatabase.execSQL("CREATE TABLE responses (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, version_code INT NOT NULL,creation_time INT NOT NULL,server_response BLOB NOT NULL);");
    }

    public void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        a(sqlitedatabase);
        RealTimeChatService.c();
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        if (i < 60)
        {
            a(sqlitedatabase);
            RealTimeChatService.c();
        }
    }

    static 
    {
        hik hik = ebw.o;
    }
}
