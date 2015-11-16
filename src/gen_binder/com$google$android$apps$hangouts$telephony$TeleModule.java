// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import dym;
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
            a = new HashMap(9);
            a.put(dym.a, Integer.valueOf(0));
            a.put(dym.b, Integer.valueOf(1));
            a.put(dym.c, Integer.valueOf(2));
            a.put(dym.d, Integer.valueOf(3));
            a.put(dym.e, Integer.valueOf(4));
            a.put(dym.f, Integer.valueOf(5));
            a.put(dym.g, Integer.valueOf(6));
            a.put(dym.h, Integer.valueOf(7));
            a.put(dym.i, Integer.valueOf(8));
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
            dym.a(hlp);
            return;

        case 1: // '\001'
            dym.a(context, hlp);
            return;

        case 2: // '\002'
            dym.b(context, hlp);
            return;

        case 3: // '\003'
            dym.b(hlp);
            return;

        case 4: // '\004'
            dym.c(context, hlp);
            return;

        case 5: // '\005'
            dym.c(hlp);
            return;

        case 6: // '\006'
            dym.d(context, hlp);
            return;

        case 7: // '\007'
            dym.d(hlp);
            return;

        case 8: // '\b'
            dym.e(context, hlp);
            break;
        }
    }

    public ()
    {
    }
}
