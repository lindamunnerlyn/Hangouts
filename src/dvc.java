// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class dvc
{

    public static final String a[] = {
        "type", "mmsc", "mmsproxy", "mmsport"
    };
    private List b;
    private boolean c;

    private dvc()
    {
        this(false);
    }

    private dvc(boolean flag)
    {
        b = new ArrayList();
        c = flag;
    }

    private static dvc a(Context context)
    {
        Object obj;
        Object obj1;
        dvc dvc1;
        obj1 = a(eey.l());
        obj = String.valueOf(obj1);
        Object obj2;
        if (((String) (obj)).length() != 0)
        {
            obj = "TransactionSettings: loaded from local APN table, mcc/mnc=".concat(((String) (obj)));
        } else
        {
            obj = new String("TransactionSettings: loaded from local APN table, mcc/mnc=");
        }
        eev.e("Babel_SMS", ((String) (obj)));
        obj2 = anh.a(context);
        obj = null;
        context = null;
        dvc1 = new dvc(true);
        obj1 = b(((SQLiteDatabase) (obj2)), ((String) (obj1)));
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        context = ((Context) (obj1));
        obj = obj1;
        if (!((Cursor) (obj1)).moveToNext()) goto _L2; else goto _L3
_L3:
        context = ((Context) (obj1));
        obj = obj1;
        obj2 = dvd.a(((Cursor) (obj1)), true);
        if (obj2 == null) goto _L1; else goto _L4
_L4:
        context = ((Context) (obj1));
        obj = obj1;
        dvc1.a(((dvd) (obj2)));
          goto _L1
        obj1;
        obj = context;
        obj2 = String.valueOf(obj1);
        obj = context;
        eev.e("Babel_SMS", (new StringBuilder(String.valueOf(obj2).length() + 56)).append("TransactionSettings.getFromLocalTable: failed to query. ").append(((String) (obj2))).toString(), ((Throwable) (obj1)));
        if (context != null)
        {
            context.close();
        }
_L6:
        return dvc1;
_L2:
        if (obj1 == null) goto _L6; else goto _L5
_L5:
        ((Cursor) (obj1)).close();
        return dvc1;
        context;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw context;
    }

    public static dvc a(Context context, String s)
    {
        String s1 = g.a(g.nU, "babel_mms_mmsc", dlb.g);
        dvc dvc1;
        if (!TextUtils.isEmpty(s1))
        {
            dvc1 = new dvc();
            dvc1.a(new dvd(s1, b(g.a(g.nU, "babel_mms_proxy_address", dlb.h)), g.a(g.nU, "babel_mms_proxy_port", -1)));
        } else
        {
            dvc1 = null;
        }
        if (dvc1 != null && dvc1.b())
        {
            eev.e("Babel_SMS", "TransactionSettings: loaded from Gservcies");
            return dvc1;
        }
        s = b(context, s);
        if (s != null && s.b())
        {
            eev.e("Babel_SMS", "TransactionSettings: loaded from system");
            return s;
        } else
        {
            return a(context);
        }
    }

    public static String a(SQLiteDatabase sqlitedatabase, String s)
    {
        String s1;
        Object obj;
        obj = null;
        s1 = null;
        sqlitedatabase = b(sqlitedatabase, s);
        s = sqlitedatabase;
        if (!sqlitedatabase.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_31;
        }
        s = sqlitedatabase;
        s1 = sqlitedatabase.getString(4);
        s = s1;
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
            s = s1;
        }
_L2:
        return s;
        Exception exception;
        exception;
        sqlitedatabase = null;
_L5:
        s = sqlitedatabase;
        eev.e("Babel_SMS", "Failed to query local APN database", exception);
        s = obj;
        if (sqlitedatabase == null) goto _L2; else goto _L1
_L1:
        sqlitedatabase.close();
        return null;
        sqlitedatabase;
        s = null;
_L4:
        if (s != null)
        {
            s.close();
        }
        throw sqlitedatabase;
        sqlitedatabase;
        if (true) goto _L4; else goto _L3
_L3:
        exception;
          goto _L5
    }

    public static String a(String s)
    {
        if (TextUtils.isEmpty(s) || s.length() > 6)
        {
            String s1 = String.valueOf(s);
            if (s1.length() != 0)
            {
                s1 = "canonicalizeMccMnc: invalid mccmnc ".concat(s1);
            } else
            {
                s1 = new String("canonicalizeMccMnc: invalid mccmnc ");
            }
            eev.g("Babel_SMS", s1);
            return s;
        } else
        {
            return a(s.substring(0, 3), s.substring(3));
        }
    }

    public static String a(String s, String s1)
    {
        String s2;
        try
        {
            s2 = String.format(Locale.US, "%03d%03d", new Object[] {
                Integer.valueOf(Integer.parseInt(s)), Integer.valueOf(Integer.parseInt(s1))
            });
        }
        catch (NumberFormatException numberformatexception)
        {
            eev.g("Babel_SMS", (new StringBuilder(String.valueOf(s).length() + 35 + String.valueOf(s1).length())).append("canonicalizeMccMnc: invalid mccmnc ").append(s).append(s1).toString());
            s = String.valueOf(s);
            s1 = String.valueOf(s1);
            if (s1.length() != 0)
            {
                return s.concat(s1);
            } else
            {
                return new String(s);
            }
        }
        return s2;
    }

    private void a(dvd dvd1)
    {
        this;
        JVM INSTR monitorenter ;
        if (dvd1 == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        if (dvd1.a())
        {
            b.add(dvd1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        dvd1;
        this;
        JVM INSTR monitorexit ;
        throw dvd1;
    }

    private static Cursor b(SQLiteDatabase sqlitedatabase, String s)
    {
        Cursor cursor;
        try
        {
            cursor = sqlitedatabase.query("apn", anh.a, "numeric =?", new String[] {
                s
            }, null, null, "current DESC", null);
        }
        catch (SQLiteException sqliteexception)
        {
            eev.d("Babel_SMS", "TransactionSettings.queryLocalApns: table not exist? Try rebuilding.", sqliteexception);
            anh.b(sqlitedatabase);
            return sqlitedatabase.query("apn", anh.a, "numeric =?", new String[] {
                s
            }, null, null, "current DESC", null);
        }
        return cursor;
    }

    private static dvc b(Context context, String s)
    {
        Object obj;
        Object obj2;
        Object obj3;
        obj3 = null;
        obj2 = null;
        obj = null;
        if (!due.b(context)) goto _L2; else goto _L1
_L1:
        Object obj1 = "current IS NOT NULL";
        String as[];
        if (!TextUtils.isEmpty(s))
        {
            obj = String.valueOf("current IS NOT NULL");
            obj1 = String.valueOf(" AND apn=?");
            dvc dvc1;
            if (((String) (obj1)).length() != 0)
            {
                obj = ((String) (obj)).concat(((String) (obj1)));
            } else
            {
                obj = new String(((String) (obj)));
            }
            as = new String[1];
            as[0] = s.trim();
            obj1 = obj;
        } else
        {
            as = null;
        }
        dvc1 = new dvc();
        s = obj3;
        obj = obj2;
        context = g.a(context.getContentResolver(), due.b(), a, ((String) (obj1)), as, null);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
_L4:
        s = context;
        obj = context;
        if (!context.moveToNext())
        {
            break MISSING_BLOCK_LABEL_140;
        }
        s = context;
        obj = context;
        obj1 = dvd.a(context, false);
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        s = context;
        obj = context;
        dvc1.a(((dvd) (obj1)));
        if (context != null)
        {
            context.close();
        }
_L6:
        obj = dvc1;
_L2:
        return ((dvc) (obj));
        context;
        obj = s;
        obj1 = String.valueOf(context);
        obj = s;
        eev.e("Babel_SMS", (new StringBuilder(String.valueOf(obj1).length() + 52)).append("TransactionSettings.getFromSystem: failed to query. ").append(((String) (obj1))).toString(), context);
        if (s != null)
        {
            s.close();
        }
        if (true) goto _L6; else goto _L5
_L5:
        context;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw context;
    }

    public static String b(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        String s1 = null;
_L4:
        return s1;
_L2:
        String as[];
        as = s.split("\\.");
        s1 = s;
        if (as.length != 4) goto _L4; else goto _L3
_L3:
        StringBuilder stringbuilder;
        int i;
        stringbuilder = new StringBuilder(16);
        i = 0;
_L8:
        if (i >= 4) goto _L6; else goto _L5
_L5:
        s1 = s;
        if (as[i].length() > 3) goto _L4; else goto _L7
_L7:
        stringbuilder.append(Integer.parseInt(as[i]));
        if (i < 3)
        {
            stringbuilder.append('.');
        }
        i++;
          goto _L8
_L6:
        return stringbuilder.toString();
        NumberFormatException numberformatexception;
        numberformatexception;
        return s;
    }

    public static boolean b(String s, String s1)
    {
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        s = s.split(",");
        int j = s.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                String s2 = s[i];
                if (s2.equals(s1) || s2.equals("*"))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return false;
    }

    public List a()
    {
        this;
        JVM INSTR monitorenter ;
        jsh jsh1 = jsh.a(b);
        this;
        JVM INSTR monitorexit ;
        return jsh1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(Context context, dvd dvd1)
    {
        boolean flag1 = true;
        this;
        JVM INSTR monitorenter ;
        if (!c || dvd1.h > 0) goto _L2; else goto _L1
_L1:
        dvd1.h = 1;
        boolean flag = flag1;
        if (b.size() <= 1)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        b.remove(dvd1);
        b.add(0, dvd1);
        flag = flag1;
_L4:
        this;
        JVM INSTR monitorexit ;
        if (flag)
        {
            dvd1.a(context);
        }
        return;
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (b.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
