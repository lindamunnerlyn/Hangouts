// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class gsv extends SQLiteOpenHelper
{

    private static final gst a = gst.d();
    public static final hij d = new hij("debug.social.database");
    private final List b;
    private boolean c;
    private final Context e;
    private final int f;
    private final String g;
    private final hgf h;

    public gsv(Context context, String s, int i)
    {
        super(context.getApplicationContext(), hkv.a(hkv.a().append(s).append(i).append(".db")), null, 1);
        s = (gms)hgx.a(context, gms);
        e = context;
        f = i;
        b = hgx.c(context, gsn);
        h = (hgf)hgx.b(context, hgf);
        if (s.c(i))
        {
            context = s.a(i).b("account_name");
        } else
        {
            context = null;
        }
        g = context;
    }

    private static void a(SQLiteDatabase sqlitedatabase, gsn gsn1)
    {
        if (Log.isLoggable("PartitionedDatabase", 4))
        {
            String s = String.valueOf(gsn1.a());
            if (s.length() != 0)
            {
                "Rebuilding partition: ".concat(s);
            } else
            {
                new String("Rebuilding partition: ");
            }
        }
        a(sqlitedatabase, gsn1.a());
        gsn1.a(sqlitedatabase);
    }

    private static void a(SQLiteDatabase sqlitedatabase, String s)
    {
label0:
        {
            if (Log.isLoggable("PartitionedDatabase", 4))
            {
                String s1 = String.valueOf(s);
                String as[];
                String as1[];
                if (s1.length() != 0)
                {
                    "Dropping partition: ".concat(s1);
                } else
                {
                    new String("Dropping partition: ");
                }
            }
            as1 = gst.b(sqlitedatabase, s);
            gso.a(sqlitedatabase, as1);
            as = gst.c(sqlitedatabase, s);
            gso.b(sqlitedatabase, as);
            a.a(sqlitedatabase, s);
            if (Log.isLoggable("PartitionedDatabase", 3))
            {
                sqlitedatabase = String.valueOf(Arrays.toString(as1));
                if (sqlitedatabase.length() != 0)
                {
                    "Dropped tables: ".concat(sqlitedatabase);
                } else
                {
                    new String("Dropped tables: ");
                }
                sqlitedatabase = String.valueOf(Arrays.toString(as));
                if (sqlitedatabase.length() == 0)
                {
                    break label0;
                }
                "Dropped views: ".concat(sqlitedatabase);
            }
            return;
        }
        new String("Dropped views: ");
    }

    private boolean a(SQLiteDatabase sqlitedatabase, gsn gsn1, int i)
    {
        if (i == 1)
        {
            return false;
        }
        if (i != 0) goto _L2; else goto _L1
_L1:
        gsn1.a(sqlitedatabase);
_L4:
        a.a(sqlitedatabase, gsn1);
        return true;
_L2:
        if (i > 1)
        {
            a(sqlitedatabase, gsn1);
        } else
        {
            try
            {
                if (!gsn1.a(i, 1))
                {
                    a(sqlitedatabase, gsn1);
                }
            }
            catch (SQLiteException sqliteexception)
            {
                new hgg(g, gsn1.a(), i, 1, i);
                hgx.a(e, gpy);
                String s = gsn1.a();
                Log.e("PartitionedDatabase", (new StringBuilder(String.valueOf(s).length() + 57)).append("Failed to upgrade partition: ").append(s).append(" ").append(i).append(" --> 1").toString(), sqliteexception);
                a(sqlitedatabase, gsn1);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void b()
    {
        if (c)
        {
            int i = f;
            throw new gsw((new StringBuilder(38)).append("Database deleted. Account: ").append(i).toString());
        } else
        {
            return;
        }
    }

    protected void a()
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); iterator.next()) { }
    }

    protected void a(SQLiteDatabase sqlitedatabase)
    {
        gso.b(sqlitedatabase);
        gso.c(sqlitedatabase);
        onCreate(sqlitedatabase);
    }

    protected void b(SQLiteDatabase sqlitedatabase)
    {
        gso.c(sqlitedatabase);
        a();
    }

    protected boolean c(SQLiteDatabase sqlitedatabase)
    {
        Map map = gst.b(sqlitedatabase);
        int i = g.a((Integer)map.get(a.a()), 0);
        boolean flag;
        if (a(sqlitedatabase, a, i))
        {
            map = gst.b(sqlitedatabase);
            flag = true;
        } else
        {
            flag = false;
        }
        map.remove(a.a());
        if (Log.isLoggable("PartitionedDatabase", 4))
        {
            int j = b.size();
            int k = map.size();
            (new StringBuilder(70)).append("Partitions in Binder: ").append(j).append(", Partitions in database: ").append(k);
        }
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            gsn gsn1 = (gsn)iterator.next();
            flag = a(sqlitedatabase, gsn1, g.a((Integer)map.remove(gsn1.a()), 0)) | flag;
        }

        for (Iterator iterator1 = map.keySet().iterator(); iterator1.hasNext(); a(sqlitedatabase, (String)iterator1.next())) { }
        if (!map.isEmpty())
        {
            return true;
        } else
        {
            return flag;
        }
    }

    public SQLiteDatabase getReadableDatabase()
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        b();
        sqlitedatabase = super.getReadableDatabase();
        this;
        JVM INSTR monitorexit ;
        return sqlitedatabase;
        Exception exception;
        exception;
        throw exception;
    }

    public SQLiteDatabase getWritableDatabase()
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        b();
        sqlitedatabase = super.getWritableDatabase();
        this;
        JVM INSTR monitorexit ;
        return sqlitedatabase;
        Exception exception;
        exception;
        throw exception;
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        a(sqlitedatabase, a, 0);
        for (Iterator iterator = b.iterator(); iterator.hasNext(); a(sqlitedatabase, (gsn)iterator.next(), 0)) { }
    }

    public void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        a(sqlitedatabase);
    }

    public void onOpen(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.beginTransaction();
        if (c(sqlitedatabase))
        {
            b(sqlitedatabase);
        }
_L1:
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        gso.a(sqlitedatabase);
        return;
        Object obj;
        obj;
        Log.e("PartitionedDatabase", "Failed to init database partitions", ((Throwable) (obj)));
        a(sqlitedatabase);
          goto _L1
        obj;
        sqlitedatabase.endTransaction();
        throw obj;
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
    }

}
