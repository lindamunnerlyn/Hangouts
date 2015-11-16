// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class cti
    implements android.view.View.OnClickListener
{

    final ctg a;

    cti(ctg ctg1)
    {
        a = ctg1;
        super();
    }

    public void onClick(View view)
    {
        a.a(view.getId());
    }
}
