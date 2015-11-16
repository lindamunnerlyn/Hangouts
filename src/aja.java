// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

final class aja
    implements android.content.DialogInterface.OnClickListener
{

    final int a;
    final aiy b;

    aja(aiy aiy1, int i)
    {
        b = aiy1;
        a = i;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent("android.intent.action.VIEW");
        dialoginterface.setData(Uri.parse(ajf.a(b.a, a)));
        b.a.startActivity(dialoginterface);
        b.a.finish();
    }
}
