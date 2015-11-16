// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.database.sqlite.SQLiteStatement;
import java.util.Locale;
import java.util.Stack;
import java.util.regex.Pattern;

public final class apv
{

    private static apv a;
    private static ThreadLocal b = new apw();
    private static String c[] = {
        "took %d ms to %s", "   took %d ms to %s", "      took %d ms to %s"
    };
    private final SQLiteDatabase d;
    private final Context e;

    apv(Context context, SQLiteDatabase sqlitedatabase)
    {
        e = context;
        d = sqlitedatabase;
    }

    public static apv a(Context context, SQLiteDatabase sqlitedatabase)
    {
        apv;
        JVM INSTR monitorenter ;
        if (a == null || a.d != sqlitedatabase)
        {
            a = new apv(context, sqlitedatabase);
        }
        context = a;
        apv;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private static void a(long l, String s)
    {
        int i = ((Stack)b.get()).size();
        l = System.currentTimeMillis() - l;
        if (l > 250L)
        {
            eev.a("Babel", String.format(Locale.US, c[Math.min(c.length - 1, i)], new Object[] {
                Long.valueOf(l), s
            }));
        }
    }

    private void a(SQLiteQueryBuilder sqlitequerybuilder, SQLiteDatabase sqlitedatabase, String as[], String s, String s1, String s2, String s3)
    {
        as = sqlitequerybuilder.buildQuery(as, s, s1, null, s2, s3);
        if (Pattern.matches(f(), as)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        sqlitequerybuilder = String.valueOf(as);
        int i;
        if (sqlitequerybuilder.length() != 0)
        {
            sqlitequerybuilder = "explain query plan ".concat(sqlitequerybuilder);
        } else
        {
            sqlitequerybuilder = new String("explain query plan ");
        }
        sqlitequerybuilder = sqlitedatabase.rawQuery(sqlitequerybuilder, null);
        if (sqlitequerybuilder == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (sqlitequerybuilder.moveToFirst())
        {
            i = sqlitequerybuilder.getColumnIndex("detail");
            sqlitedatabase = new StringBuilder();
            do
            {
                sqlitedatabase.append(sqlitequerybuilder.getString(i));
                sqlitedatabase.append("\n");
            } while (sqlitequerybuilder.moveToNext());
            if (sqlitedatabase.length() > 0)
            {
                sqlitedatabase.setLength(sqlitedatabase.length() - 1);
            }
            sqlitedatabase = String.valueOf(sqlitedatabase.toString());
            eev.a("Babel", (new StringBuilder(String.valueOf(as).length() + 20 + String.valueOf(sqlitedatabase).length())).append("for query ").append(as).append("\nplan is: ").append(sqlitedatabase).toString());
        }
        if (sqlitequerybuilder == null) goto _L1; else goto _L3
_L3:
        sqlitequerybuilder.close();
        return;
        sqlitedatabase;
        eev.d("Babel", "Query plan failed ", sqlitedatabase);
        if (sqlitequerybuilder == null) goto _L1; else goto _L4
_L4:
        sqlitequerybuilder.close();
        return;
        sqlitedatabase;
        if (sqlitequerybuilder != null)
        {
            sqlitequerybuilder.close();
        }
        throw sqlitedatabase;
    }

    private String f()
    {
        return ((amo)hlp.a(e, amo)).a("babel_query_plan_regexp", null);
    }

    public int a(String s, ContentValues contentvalues, String s1, String as[])
    {
        long l = 0L;
        if (aps.d())
        {
            l = System.currentTimeMillis();
        }
        int i = d.update(s, contentvalues, s1, as);
        if (aps.d())
        {
            a(l, String.format(Locale.US, "update %s with %s ==> %d", new Object[] {
                s, s1, Integer.valueOf(i)
            }));
        }
        return i;
    }

    public int a(String s, String s1)
    {
        long l = 0L;
        if (aps.d())
        {
            l = System.currentTimeMillis();
        }
        SQLiteStatement sqlitestatement = d.compileStatement(s);
        if (s1 != null)
        {
            sqlitestatement.bindString(1, s1);
        }
        int i = sqlitestatement.executeUpdateDelete();
        if (aps.d())
        {
            a(l, String.format(Locale.US, "execSQLUpdateDelete %s", new Object[] {
                s
            }));
        }
        return i;
    }

    public int a(String s, String s1, String as[])
    {
        long l = 0L;
        if (aps.d())
        {
            l = System.currentTimeMillis();
        }
        int i = d.delete(s, s1, as);
        if (aps.d())
        {
            a(l, String.format(Locale.US, "delete from %s with %s ==> %d", new Object[] {
                s, s1, Integer.valueOf(i)
            }));
        }
        return i;
    }

    public long a(String s, ContentValues contentvalues)
    {
        long l = 0L;
        if (aps.d())
        {
            l = System.currentTimeMillis();
        }
        long l1 = d.insert(s, null, contentvalues);
        if (aps.d())
        {
            a(l, String.format(Locale.US, "insert to %s", new Object[] {
                s
            }));
        }
        return l1;
    }

    public Cursor a(SQLiteQueryBuilder sqlitequerybuilder, String as[], String s, String as1[], String s1, String s2)
    {
        if (f() != null)
        {
            a(sqlitequerybuilder, d, as, s, null, s1, s2);
        }
        long l;
        if (aps.d())
        {
            l = System.currentTimeMillis();
        } else
        {
            l = 0L;
        }
        as = sqlitequerybuilder.query(d, as, s, as1, null, null, s1, s2);
        if (aps.d())
        {
            a(l, String.format(Locale.US, "query %s with %s ==> %d", new Object[] {
                sqlitequerybuilder.getTables(), s, Integer.valueOf(as.getCount())
            }));
        }
        return as;
    }

    public Cursor a(String s, String as[])
    {
        long l = 0L;
        if (aps.d())
        {
            l = System.currentTimeMillis();
        }
        as = d.rawQuery(s, as);
        if (aps.d())
        {
            a(l, String.format(Locale.US, "rawQuery %s ==> %d", new Object[] {
                s, Integer.valueOf(as.getCount())
            }));
        }
        return as;
    }

    public Cursor a(String s, String as[], String s1, String as1[], String s2)
    {
        return a(s, as, s1, as1, null, null, s2, null);
    }

    public Cursor a(String s, String as[], String s1, String as1[], String s2, String s3, String s4, 
            String s5)
    {
        if (f() != null)
        {
            s2 = new SQLiteQueryBuilder();
            s2.setTables(s);
            a(((SQLiteQueryBuilder) (s2)), d, as, s1, null, s4, s5);
        }
        long l;
        if (aps.d())
        {
            l = System.currentTimeMillis();
        } else
        {
            l = 0L;
        }
        as = d.query(s, as, s1, as1, null, null, s4, s5);
        if (aps.d())
        {
            a(l, String.format(Locale.US, "query %s with %s ==> %d", new Object[] {
                s, s1, Integer.valueOf(as.getCount())
            }));
        }
        return as;
    }

    public void a()
    {
        long l = System.currentTimeMillis();
        if (aps.d())
        {
            a(l, ">>> beginTransaction");
        }
        apx apx1 = new apx();
        apx1.a = l;
        ((Stack)b.get()).push(apx1);
        d.beginTransaction();
    }

    public void a(String s)
    {
        long l = 0L;
        if (aps.d())
        {
            l = System.currentTimeMillis();
        }
        d.execSQL(s);
        if (aps.d())
        {
            a(l, String.format(Locale.US, "execSQL %s", new Object[] {
                s
            }));
        }
    }

    public void a(Locale locale)
    {
        d.setLocale(locale);
    }

    public void b()
    {
        ((apx)((Stack)b.get()).peek()).b = true;
        d.setTransactionSuccessful();
    }

    public void c()
    {
        long l1 = 0L;
        apx apx1 = (apx)((Stack)b.get()).pop();
        if (!apx1.b)
        {
            eev.f("Babel", "endTransaction without setting successful");
            StackTraceElement astacktraceelement[] = (new Exception()).getStackTrace();
            int j = astacktraceelement.length;
            int i = 0;
            while (i < j) 
            {
                String s = String.valueOf(astacktraceelement[i].toString());
                if (s.length() != 0)
                {
                    s = "    ".concat(s);
                } else
                {
                    s = new String("    ");
                }
                eev.f("Babel", s);
                i++;
            }
        }
        long l;
        if (aps.d())
        {
            l = apx1.a;
            l1 = System.currentTimeMillis();
        } else
        {
            l = 0L;
        }
        d.endTransaction();
        if (aps.d())
        {
            a(l1, String.format(Locale.US, ">>> endTransaction (total for this transaction: %d)", new Object[] {
                Long.valueOf(System.currentTimeMillis() - l)
            }));
        }
    }

    public void d()
    {
        long l = 0L;
        if (aps.d())
        {
            l = System.currentTimeMillis();
        }
        if (d.yieldIfContendedSafely() && aps.d())
        {
            a(l, "yieldTransaction");
        }
    }

    public SQLiteDatabase e()
    {
        return d;
    }

}
