// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import bzk;
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
            a = new HashMap(7);
            a.put(bzk.a, Integer.valueOf(0));
            a.put(bzk.b, Integer.valueOf(1));
            a.put(bzk.c, Integer.valueOf(2));
            a.put(bzk.d, Integer.valueOf(3));
            a.put(bzk.e, Integer.valueOf(4));
            a.put(bzk.f, Integer.valueOf(5));
            a.put(bzk.g, Integer.valueOf(6));
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
            bzk.a(hgx);
            return;

        case 1: // '\001'
            bzk.a(context, hgx);
            return;

        case 2: // '\002'
            bzk.b(context, hgx);
            return;

        case 3: // '\003'
            bzk.b(hgx);
            return;

        case 4: // '\004'
            bzk.c(hgx);
            return;

        case 5: // '\005'
            bzk.d(hgx);
            return;

        case 6: // '\006'
            bzk.e(hgx);
            break;
        }
    }

    public ()
    {
    }
}
