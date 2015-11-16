// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import alh;
import android.content.Context;
import hgx;
import hhe;
import java.util.HashMap;

public final class 
    implements hhe
{

    private HashMap a;

    public void a(Context context, Class class1, hgx hgx)
    {
        if (a == null)
        {
            a = new HashMap(6);
            a.put(alh.a, Integer.valueOf(0));
            a.put(alh.b, Integer.valueOf(1));
            a.put(alh.c, Integer.valueOf(2));
            a.put(alh.d, Integer.valueOf(3));
            a.put(alh.e, Integer.valueOf(4));
            a.put(alh.f, Integer.valueOf(5));
        }
        class1 = (Integer)a.get(class1.getName());
        if (class1 == null)
        {
            return;
        }
        switch (class1.intValue())
        {
        default:
            return;

        case 0: // '\0'
            alh.a(context, hgx);
            return;

        case 1: // '\001'
            alh.b(context, hgx);
            return;

        case 2: // '\002'
            alh.c(context, hgx);
            return;

        case 3: // '\003'
            alh.d(context, hgx);
            return;

        case 4: // '\004'
            alh.a(hgx);
            return;

        case 5: // '\005'
            alh.e(context, hgx);
            break;
        }
    }

    public ()
    {
    }
}
