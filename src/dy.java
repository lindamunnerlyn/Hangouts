// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

final class dy
    implements dx
{

    dy()
    {
    }

    public PendingIntent a(Context context, Intent aintent[], int i, int j)
    {
        aintent = new Intent(aintent[aintent.length - 1]);
        aintent.addFlags(0x10000000);
        return PendingIntent.getActivity(context, i, aintent, j);
    }
}
