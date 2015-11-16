// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class dsz
    implements android.view.View.OnClickListener
{

    final dsy a;

    dsz(dsy dsy1)
    {
        a = dsy1;
        super();
    }

    public void onClick(View view)
    {
        ebr.a(view.getContext(), dsy.a(a), dsy.b(a));
    }
}
