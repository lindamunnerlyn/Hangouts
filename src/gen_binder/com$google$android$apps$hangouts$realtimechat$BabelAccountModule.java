// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import dcu;
import hlp;
import hlw;
import java.util.HashMap;

public final class Q
    implements hlw
{

    private HashMap a;

    public void a(Context context, Class class1, hlp hlp)
    {
        if (a == null)
        {
            a = new HashMap(3);
            a.put(dcu.a, Integer.valueOf(0));
            a.put(dcu.b, Integer.valueOf(1));
            a.put(dcu.c, Integer.valueOf(2));
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
            dcu.a(hlp);
            return;

        case 1: // '\001'
            dcu.b(hlp);
            return;

        case 2: // '\002'
            dcu.a(context, hlp);
            break;
        }
    }

    public Q()
    {
    }
}
