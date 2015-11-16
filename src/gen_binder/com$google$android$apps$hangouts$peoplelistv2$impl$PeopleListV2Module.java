// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import ciw;
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
            a = new HashMap(6);
            a.put(ciw.a, Integer.valueOf(0));
            a.put(ciw.b, Integer.valueOf(1));
            a.put(ciw.c, Integer.valueOf(2));
            a.put(ciw.d, Integer.valueOf(3));
            a.put(ciw.e, Integer.valueOf(4));
            a.put(ciw.f, Integer.valueOf(5));
        }
        context = (Integer)a.get(class1.getName());
        if (context == null)
        {
            return;
        }
        switch (context.intValue())
        {
        default:
            return;

        case 0: // '\0'
            ciw.a(hlp);
            return;

        case 1: // '\001'
            ciw.b(hlp);
            return;

        case 2: // '\002'
            ciw.c(hlp);
            return;

        case 3: // '\003'
            ciw.d(hlp);
            return;

        case 4: // '\004'
            ciw.e(hlp);
            return;

        case 5: // '\005'
            ciw.f(hlp);
            break;
        }
    }

    public ()
    {
    }
}
