// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.database.CursorWrapper;
import android.text.TextUtils;

public final class aqx extends CursorWrapper
    implements bgz
{

    private bgl a;

    public aqx(Cursor cursor)
    {
        super(cursor);
    }

    public fqo a()
    {
        Object obj1 = null;
        Object obj = obj1;
        if (a != null)
        {
            obj = obj1;
            if (e() != 1)
            {
                obj = getString(2);
                String s = ebz.k(getString(1));
                if (!TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    obj = a.a(((String) (obj)));
                } else
                {
                    obj = obj1;
                    if (!TextUtils.isEmpty(s))
                    {
                        return a.b(s);
                    }
                }
            }
        }
        return ((fqo) (obj));
    }

    public void a(bgl bgl1)
    {
        a = bgl1;
    }

    public bhj b()
    {
        return new bhj(new bho(getString(1), ""));
    }

    public bhb c()
    {
        boolean flag = true;
        String s = getString(0);
        String s1 = getString(1);
        long l = getLong(3);
        int i = getInt(4);
        String s2 = getString(6);
        if (getInt(7) == 0)
        {
            flag = false;
        }
        return new bhb(s, s1, l, i, s2, flag);
    }

    public int d()
    {
        return 0;
    }

    public int e()
    {
        return getInt(5);
    }

    public boolean f()
    {
        return true;
    }
}
