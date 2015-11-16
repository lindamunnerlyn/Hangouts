// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class ae extends am
{

    final ad a;

    ae(ad ad1)
    {
        a = ad1;
        super();
    }

    public View a(int i)
    {
        if (a.S == null)
        {
            throw new IllegalStateException("Fragment does not have a view");
        } else
        {
            return a.S.findViewById(i);
        }
    }

    public boolean a()
    {
        return a.S != null;
    }
}
