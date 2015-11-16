// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class ajn extends gxh
{

    static final Map a = new gz();
    static final ajp b = new ajp();
    static final Map c = new gz();

    private ajn(Context context, int i)
    {
        super(context, "callerid_data", i);
    }

    static ajl a(Context context, int i)
    {
        if (!g.a(context, i))
        {
            return null;
        } else
        {
            return c(context, i);
        }
    }

    static ajl a(Context context, int i, ajo ajo)
    {
        if (!c.containsKey(Integer.valueOf(i)))
        {
            c.put(Integer.valueOf(i), new HashSet());
        }
        ((Set)c.get(Integer.valueOf(i))).add(ajo);
        return a(context, i);
    }

    private static iwv a(Cursor cursor)
    {
        try
        {
            cursor = (iwv)kws.mergeFrom(new iwv(), cursor.getBlob(3));
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            throw new RuntimeException("Issue parsing ClientCallerIdSetting data from database partition", cursor);
        }
        return cursor;
    }

    static void a(int i, ajo ajo)
    {
        if (c.containsKey(Integer.valueOf(i)))
        {
            ((Set)c.get(Integer.valueOf(i))).remove(ajo);
        }
    }

    static void a(Context context, int i, long l, iwv aiwv[])
    {
        boolean flag = false;
        context = b(context, i).getWritableDatabase();
        context.beginTransaction();
        int i1;
        if (aiwv.length > 0)
        {
            int j1 = aiwv.length;
            int k = 0;
            int j = 0;
            do
            {
                i1 = j;
                if (k >= j1)
                {
                    break;
                }
                iwv iwv1 = aiwv[k];
                i1 = j;
                if (g.a(iwv1.d, false))
                {
                    b.a(i, new ajl(l, iwv1));
                    i1 = j + 1;
                }
                ContentValues contentvalues = new ContentValues();
                contentvalues.put("phone_number_e164", iwv1.a.a);
                contentvalues.put("is_default", Integer.valueOf(eep.a(g.a(iwv1.d, false))));
                contentvalues.put("refreshed_at", Long.valueOf(l));
                contentvalues.put("client_callerid_setting", kws.toByteArray(iwv1));
                context.replace("client_callerid_settings", null, contentvalues);
                k++;
                j = i1;
            } while (true);
        } else
        {
            i1 = 0;
        }
        context.delete("client_callerid_settings", "refreshed_at< ?", new String[] {
            String.valueOf(l)
        });
        context.setTransactionSuccessful();
        context.endTransaction();
        if (i1 == 0)
        {
            b.a(i, null);
        }
        if (i1 <= 1)
        {
            flag = true;
        }
        g.c(flag);
    }

    private static ajn b(Context context, int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder(31)).append("Invalid account ID: ").append(i).toString());
        }
        synchronized (a)
        {
            if (a.get(Integer.valueOf(i)) == null)
            {
                a.put(Integer.valueOf(i), new ajn(context, i));
            }
            context = (ajn)a.get(Integer.valueOf(i));
        }
        return context;
        context;
        map;
        JVM INSTR monitorexit ;
        throw context;
    }

    private static ajl c(Context context, int i)
    {
        g.w();
        if (b.a(i)) goto _L2; else goto _L1
_L1:
        context = b(context, i).getReadableDatabase();
        String as[] = akt.a;
        String s = String.valueOf("is_default=");
        int j = eep.a(true);
        context = context.query("client_callerid_settings", as, (new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(j).toString(), null, null, null, null, null);
        switch (context.getCount())
        {
        default:
            i = context.getCount();
            throw new RuntimeException((new StringBuilder(69)).append("Expected max of 1 default ClientCallerIdSetting but found ").append(i).toString());

        case 1: // '\001'
            break MISSING_BLOCK_LABEL_176;

        case 0: // '\0'
            break;
        }
        break MISSING_BLOCK_LABEL_154;
        Exception exception;
        exception;
        context.close();
        throw exception;
        b.a(i, null);
_L3:
        context.close();
_L2:
        return b.b(i);
        context.moveToFirst();
        b.a(i, new ajl(context.getLong(2), a(context)));
          goto _L3
    }

}
