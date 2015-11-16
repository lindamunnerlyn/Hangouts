// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import hck;
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
            a = new HashMap(7);
            a.put(hck.a, Integer.valueOf(0));
            a.put(hck.b, Integer.valueOf(1));
            a.put(hck.c, Integer.valueOf(2));
            a.put(hck.d, Integer.valueOf(3));
            a.put(hck.e, Integer.valueOf(4));
            a.put(hck.f, Integer.valueOf(5));
            a.put(hck.g, Integer.valueOf(6));
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
            hck.a(context, hlp);
            return;

        case 1: // '\001'
            hck.b(context, hlp);
            return;

        case 2: // '\002'
            hck.c(context, hlp);
            return;

        case 3: // '\003'
            hck.d(context, hlp);
            return;

        case 4: // '\004'
            hck.e(context, hlp);
            return;

        case 5: // '\005'
            hck.f(context, hlp);
            return;

        case 6: // '\006'
            hck.g(context, hlp);
            break;
        }
    }

    public Q()
    {
    }
}
