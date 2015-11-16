// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.HashMap;

final class bjd
    implements dvn
{

    final bjc a;
    private boolean b;

    bjd(bjc bjc1)
    {
        a = bjc1;
        super();
    }

    public void a()
    {
        if (!b)
        {
            a.a(a.a, true, false);
        }
        b = false;
    }

    public void onClick(View view)
    {
        view = a;
        if (((bjc) (view)).a != null && ((bjc) (view)).a.size() > 0)
        {
            view.a(((bjc) (view)).a, false, false);
            view.a = null;
        }
        b = true;
    }
}
