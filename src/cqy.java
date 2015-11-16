// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class cqy
    implements android.view.View.OnClickListener
{

    final cqw a;

    cqy(cqw cqw1)
    {
        a = cqw1;
        super();
    }

    public void onClick(View view)
    {
        a.a(view.getId());
    }
}
