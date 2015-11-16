// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class heu
    implements android.content.DialogInterface.OnClickListener
{

    final het a;

    heu(het het1)
    {
        a = het1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        het.a(a, i);
        a.onClick(dialoginterface, -1);
        dialoginterface.dismiss();
    }
}
