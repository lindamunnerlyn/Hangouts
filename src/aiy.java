// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class aiy
    implements android.content.DialogInterface.OnCancelListener
{

    final boolean a;
    final aiv b;

    aiy(aiv aiv1, boolean flag)
    {
        b = aiv1;
        a = flag;
        super();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        if (a)
        {
            b.a.finish();
        }
        b.b = null;
    }
}
