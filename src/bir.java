// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.HashMap;

final class bir
    implements dsu
{

    final biq a;
    private boolean b;

    bir(biq biq1)
    {
        a = biq1;
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
        if (((biq) (view)).a != null && ((biq) (view)).a.size() > 0)
        {
            view.a(((biq) (view)).a, false, false);
            view.a = null;
        }
        b = true;
    }
}
