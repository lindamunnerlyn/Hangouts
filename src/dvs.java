// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class dvs
    implements android.view.View.OnClickListener
{

    final dvr a;

    dvs(dvr dvr1)
    {
        a = dvr1;
        super();
    }

    public void onClick(View view)
    {
        eep.a(view.getContext(), dvr.a(a), dvr.b(a));
    }
}
