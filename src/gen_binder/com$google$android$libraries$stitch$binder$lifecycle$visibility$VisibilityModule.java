// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import hgx;
import hhe;
import hif;
import java.util.HashMap;

public final class a
    implements hhe
{

    private HashMap a;

    public void a(Context context, Class class1, hgx hgx)
    {
        if (a == null)
        {
            a = new HashMap(2);
            a.put(hif.a, Integer.valueOf(0));
            a.put(hif.b, Integer.valueOf(1));
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
            hif.a(hgx);
            return;

        case 1: // '\001'
            hif.b(hgx);
            break;
        }
    }

    public a()
    {
    }
}
