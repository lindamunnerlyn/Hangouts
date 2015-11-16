// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class ajb
    implements android.content.DialogInterface.OnCancelListener
{

    final boolean a;
    final aiy b;

    ajb(aiy aiy1, boolean flag)
    {
        b = aiy1;
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
