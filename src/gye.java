// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.List;

final class gye extends gqn
{

    private final String a;
    private final String b;
    private final gyf e;
    private final gxe f;

    gye(String s, String s1, String s2, gyf gyf1, gxe gxe)
    {
        super(s);
        a = s1;
        b = s2;
        e = gyf1;
        f = gxe;
    }

    protected grk a(Context context)
    {
        context = e.a(a, b, f, false);
        grk grk1 = gxy.a(context);
        if (((gxu) (context)).a)
        {
            grk1.d().putInt("account_id", ((Integer)((gxu) (context)).f.get(0)).intValue());
        }
        return grk1;
    }
}
