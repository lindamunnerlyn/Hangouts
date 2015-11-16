// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import android.content.Intent;

final class dnv
    implements android.content.DialogInterface.OnClickListener
{

    final dnu a;

    dnv(dnu dnu1)
    {
        a = dnu1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = dnu.a(a);
        if (dnu.a(a).b().a == null)
        {
            throw new RuntimeException("gaiaId not provided");
        }
        Intent intent = new Intent("com.google.android.gms.people.profile.ACTION_SET_AVATAR");
        intent.putExtra("com.google.android.gms.people.profile.EXTRA_ACCOUNT", dialoginterface.a());
        if (dialoginterface.F())
        {
            intent.putExtra("com.google.android.gms.people.profile.EXTRA_PAGE_ID", dialoginterface.ae());
        }
        a.startActivityForResult(intent, 1);
    }
}
