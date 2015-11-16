// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import android.content.Intent;

final class dqo
    implements android.content.DialogInterface.OnClickListener
{

    final dqn a;

    dqo(dqn dqn1)
    {
        a = dqn1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = dqn.a(a);
        if (dqn.a(a).b().a == null)
        {
            throw new RuntimeException("gaiaId not provided");
        }
        Intent intent = new Intent("com.google.android.gms.people.profile.ACTION_SET_AVATAR");
        intent.putExtra("com.google.android.gms.people.profile.EXTRA_ACCOUNT", dialoginterface.a());
        if (dialoginterface.D())
        {
            intent.putExtra("com.google.android.gms.people.profile.EXTRA_PAGE_ID", dialoginterface.ab());
        }
        a.startActivityForResult(intent, 1);
    }
}
