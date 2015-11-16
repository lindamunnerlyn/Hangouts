// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

final class avw
    implements gtd
{

    final avv a;

    avw(avv avv1)
    {
        a = avv1;
        super();
    }

    public void a(int i, Intent intent)
    {
        if (i == 1)
        {
            a.getActivity().finish();
        }
    }
}
