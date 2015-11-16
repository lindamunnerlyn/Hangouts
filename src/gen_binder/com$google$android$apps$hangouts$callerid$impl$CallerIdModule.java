// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import akh;
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
            a = new HashMap(10);
            a.put(akh.a, Integer.valueOf(0));
            a.put(akh.b, Integer.valueOf(1));
            a.put(akh.c, Integer.valueOf(2));
            a.put(akh.d, Integer.valueOf(3));
            a.put(akh.e, Integer.valueOf(4));
            a.put(akh.f, Integer.valueOf(5));
            a.put(akh.g, Integer.valueOf(6));
            a.put(akh.h, Integer.valueOf(7));
            a.put(akh.i, Integer.valueOf(8));
            a.put(akh.j, Integer.valueOf(9));
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
            akh.a(context, hgx);
            return;

        case 1: // '\001'
            akh.b(context, hgx);
            return;

        case 2: // '\002'
            akh.c(context, hgx);
            return;

        case 3: // '\003'
            akh.d(context, hgx);
            return;

        case 4: // '\004'
            akh.e(context, hgx);
            return;

        case 5: // '\005'
            akh.f(context, hgx);
            return;

        case 6: // '\006'
            akh.a(hgx);
            return;

        case 7: // '\007'
            akh.g(context, hgx);
            return;

        case 8: // '\b'
            akh.h(context, hgx);
            return;

        case 9: // '\t'
            akh.i(context, hgx);
            break;
        }
    }

    public ()
    {
    }
}
