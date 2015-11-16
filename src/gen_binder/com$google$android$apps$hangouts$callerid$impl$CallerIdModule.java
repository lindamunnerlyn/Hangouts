// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import ake;
import android.content.Context;
import hlp;
import hlw;
import java.util.HashMap;

public final class 
    implements hlw
{

    private HashMap a;

    public void a(Context context, Class class1, hlp hlp)
    {
        if (a == null)
        {
            a = new HashMap(10);
            a.put(ake.a, Integer.valueOf(0));
            a.put(ake.b, Integer.valueOf(1));
            a.put(ake.c, Integer.valueOf(2));
            a.put(ake.d, Integer.valueOf(3));
            a.put(ake.e, Integer.valueOf(4));
            a.put(ake.f, Integer.valueOf(5));
            a.put(ake.g, Integer.valueOf(6));
            a.put(ake.h, Integer.valueOf(7));
            a.put(ake.i, Integer.valueOf(8));
            a.put(ake.j, Integer.valueOf(9));
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
            ake.a(context, hlp);
            return;

        case 1: // '\001'
            ake.b(context, hlp);
            return;

        case 2: // '\002'
            ake.c(context, hlp);
            return;

        case 3: // '\003'
            ake.d(context, hlp);
            return;

        case 4: // '\004'
            ake.e(context, hlp);
            return;

        case 5: // '\005'
            ake.f(context, hlp);
            return;

        case 6: // '\006'
            ake.a(hlp);
            return;

        case 7: // '\007'
            ake.g(context, hlp);
            return;

        case 8: // '\b'
            ake.h(context, hlp);
            return;

        case 9: // '\t'
            ake.i(context, hlp);
            break;
        }
    }

    public ()
    {
    }
}
