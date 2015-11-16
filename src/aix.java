// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

final class aix
    implements android.content.DialogInterface.OnClickListener
{

    final int a;
    final aiv b;

    aix(aiv aiv1, int i)
    {
        b = aiv1;
        a = i;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent("android.intent.action.VIEW");
        ai ai1 = b.a;
        i = a;
        dialoginterface.setData(Uri.parse(((gqz)hlp.a(ai1, gqz)).a(i).a("app_upgrade_url", "")));
        b.a.startActivity(dialoginterface);
        b.a.finish();
    }
}
