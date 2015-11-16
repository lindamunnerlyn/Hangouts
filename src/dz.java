// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

final class dz
    implements dx
{

    dz()
    {
    }

    public PendingIntent a(Context context, Intent aintent[], int i, int j)
    {
        aintent[0] = (new Intent(aintent[0])).addFlags(0x1000c000);
        return PendingIntent.getActivities(context, i, aintent, j);
    }
}
