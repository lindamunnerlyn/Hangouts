// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;

public class abf extends abc
{

    public hm g;
    public final float h;
    public boolean i;

    public abf(Context context, ap ap, Cursor cursor, float f1, boolean flag)
    {
        super(context, ap, cursor);
        g = new hm(abm.a.length);
        h = f1;
        i = flag;
    }

    private String a(Cursor cursor, String s)
    {
        if (g.containsKey(s))
        {
            return cursor.getString(((Integer)g.get(s)).intValue());
        } else
        {
            return null;
        }
    }

    protected abg a(Intent intent, int j, boolean flag)
    {
        return abg.a(intent, j, flag);
    }

    public ad a(Cursor cursor, int j)
    {
        String s = b(cursor);
        String s1 = c(cursor);
        boolean flag2 = d(cursor);
        boolean flag1 = false;
        boolean flag = flag1;
        if (s == null)
        {
            flag = flag1;
            if (flag2)
            {
                flag = true;
            }
        }
        cursor = g.a(a, f());
        cursor.c(s).d(s1).a(i).a(h);
        return a(cursor.b(), j, flag);
    }

    public Cursor a(Cursor cursor)
    {
        boolean flag = false;
        g.clear();
        if (cursor != null)
        {
            String as[] = abm.a;
            int i1 = as.length;
            for (int j = 0; j < i1; j++)
            {
                String s = as[j];
                g.put(s, Integer.valueOf(cursor.getColumnIndexOrThrow(s)));
            }

            as = abm.b;
            i1 = as.length;
            for (int k = ((flag) ? 1 : 0); k < i1; k++)
            {
                String s1 = as[k];
                int l = cursor.getColumnIndex(s1);
                if (l != -1)
                {
                    g.put(s1, Integer.valueOf(l));
                }
            }

        }
        return super.a(cursor);
    }

    public String b(Cursor cursor)
    {
        return a(cursor, "contentUri");
    }

    public String c(Cursor cursor)
    {
        return a(cursor, "thumbnailUri");
    }

    public boolean d(Cursor cursor)
    {
        cursor = a(cursor, "loadingIndicator");
        if (cursor == null)
        {
            return false;
        } else
        {
            return Boolean.valueOf(cursor).booleanValue();
        }
    }

    protected Class f()
    {
        return abg;
    }
}
