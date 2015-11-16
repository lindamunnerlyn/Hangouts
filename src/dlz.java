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

public class dlz extends SQLiteOpenHelper
    implements cdp
{

    private static final boolean a = false;
    private final long b;
    private SQLiteDatabase c;

    dlz(Context context)
    {
        super(context, "message_store.db", null, 60);
        c = getWritableDatabase();
        b = ((efu)hlp.a(context, efu)).d();
        eev.c("Babel_RequestWriter", "RequestWriterDatabase init");
    }

    public static dlz a(Context context)
    {
        return (dlz)hlp.a(context, dlz);
    }

    private static void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS messages;");
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS requests;");
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS responses;");
        sqlitedatabase.execSQL("CREATE TABLE requests (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, version_code INT NOT NULL,queue_name TEXT NOT NULL,account INT NOT NULL,server_request BLOB NOT NULL,fail_count INT NOT NULL,server_fail_count INT NOT NULL,server_target_retry INT NOT NULL,creation_time INT NOT NULL);");
        sqlitedatabase.execSQL("CREATE TABLE responses (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, version_code INT NOT NULL,creation_time INT NOT NULL,server_response BLOB NOT NULL);");
        sqlitedatabase = new File(g.e());
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
            eev.b("Babel_RequestWriter", (new StringBuilder(String.valueOf(s).length() + 39)).append("Deleting row ").append(l).append(" from ").append(s).toString());
        }
        String s1 = Long.toString(l);
        int i = c.delete(s, "_id=?", new String[] {
            s1
        });
        if (i != 1)
        {
            eev.f("Babel_RequestWriter", (new StringBuilder(54)).append("Expected to delete 1 row but deleted ").append(i).append(" rows.").toString());
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
        as = c.query("requests", dma.a, s, as, null, null, "creation_time ASC");
        if (a)
        {
            i = as.getCount();
            eev.b("Babel_RequestWriter", (new StringBuilder(29)).append("Decoding ").append(i).append(" messages").toString());
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
        eev.f("Babel_RequestWriter", (new StringBuilder(100)).append("Dropping all pending request(s) due to apk upgrade from ").append(l).append(" => ").append(l2).toString());
        as.close();
        return false;
        long l1 = as.getLong(0);
        if (a)
        {
            eev.b("Babel_RequestWriter", (new StringBuilder(33)).append("Decoding row ").append(l1).toString());
        }
        Object obj = dmc.a(as.getBlob(4));
        obj = new cdk(l1, as.getString(2), as.getInt(3), as.getInt(5), as.getInt(6), as.getLong(7), ((cdl) (obj)));
        if (a)
        {
            String s1 = String.valueOf(obj);
            eev.b("Babel_RequestWriter", (new StringBuilder(String.valueOf(s1).length() + 25)).append("Restoring ServerRequest: ").append(s1).toString());
        }
        list.add(obj);
          goto _L1
        list;
        eev.e("Babel_RequestWriter", "Failed to decode pending requests", list);
        as.close();
        return false;
        as.close();
        return true;
        list;
        as.close();
        throw list;
    }

    public long a(cxr cxr1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("version_code", Long.valueOf(b));
        contentvalues.put("creation_time", Long.valueOf(System.currentTimeMillis()));
        contentvalues.put("server_response", cxr1.f());
        long l = c.insert("responses", null, contentvalues);
        gdv.b("Database insert failed", Long.valueOf(l), Integer.valueOf(-1));
        return l;
    }

    public void a(long l)
    {
        a("requests", l);
    }

    public void a(cdk cdk1)
    {
        ContentValues contentvalues = new ContentValues();
        cdk1 = cdk1.a;
        contentvalues.put("fail_count", Integer.valueOf(((cdn) (cdk1)).d));
        contentvalues.put("server_fail_count", Integer.valueOf(((cdn) (cdk1)).e));
        contentvalues.put("server_target_retry", Long.valueOf(((cdn) (cdk1)).f));
        long l = ((cdn) (cdk1)).a;
        c.update("requests", contentvalues, "_id=?", new String[] {
            String.valueOf(l)
        });
    }

    void a(dls dls1)
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
            gdv.a("Expected condition to be true", flag);
            eev.f("Babel_RequestWriter", (new StringBuilder(38)).append("Dropped ").append(i).append(" pending request(s)").toString());
            g.a(null, 1982);
            RealTimeChatService.c();
        } else
        {
            obj = ((List) (obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                cdk cdk1 = (cdk)((Iterator) (obj)).next();
                if (dcn.e(cdk1.a.c) == null)
                {
                    int j = cdk1.a.c;
                    eev.a("Babel_RequestWriter", (new StringBuilder(51)).append("Ignoring message restore for account id ").append(j).toString());
                } else
                {
                    dls1.a(cdk1);
                }
            }
        }
    }

    public long b(cdk cdk1)
    {
        int i = cdk1.a.c;
        cdn cdn1 = cdk1.a;
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("version_code", Long.valueOf(b));
        contentvalues.put("account", Integer.valueOf(i));
        contentvalues.put("queue_name", cdn1.b);
        contentvalues.put("server_request", cdk1.e());
        contentvalues.put("creation_time", Long.valueOf(cdn1.g));
        contentvalues.put("fail_count", Integer.valueOf(cdn1.d));
        contentvalues.put("server_fail_count", Integer.valueOf(cdn1.e));
        contentvalues.put("server_target_retry", Long.valueOf(cdn1.f));
        long l1;
        try
        {
            cdk1.a.a = c.insert("requests", null, contentvalues);
            if (a)
            {
                long l = cdk1.a.a;
                eev.b("Babel_RequestWriter", (new StringBuilder(34)).append("Wrote request ").append(l).toString());
            }
            l1 = cdk1.a.a;
        }
        // Misplaced declaration of an exception variable
        catch (cdk cdk1)
        {
            eev.e("Babel_RequestWriter", "caught constraint exception ", cdk1);
            return 0L;
        }
        return l1;
    }

    public cdk b(long l)
    {
        ArrayList arraylist = new ArrayList();
        if (a(new String[] {
    Long.toString(l)
}, arraylist) && arraylist.size() > 0)
        {
            return (cdk)arraylist.get(0);
        } else
        {
            return null;
        }
    }

    public cxr c(long l)
    {
        Cursor cursor = c.query("responses", dmb.a, "_id = ?", new String[] {
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
        gdv.b(((String) (obj)), flag);
        obj = (new StringBuilder(54)).append("Found ").append(i).append(" rows for row id ").append(l).toString();
        if (i > 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gdv.b(((String) (obj)), flag);
        if (a)
        {
            eev.b("Babel_RequestWriter", (new StringBuilder(37)).append("Getting response ").append(l).toString());
        }
        cursor.moveToNext();
        if ((long)cursor.getInt(1) == b)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        d(l);
        cursor.close();
        return null;
        obj = dmc.b(cursor.getBlob(3));
        cursor.close();
        return ((cxr) (obj));
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
        hnc hnc = eev.o;
    }
}
