// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

final class dnt extends BroadcastReceiver
{

    dnt()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if (android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.equals(intent.getData()))
        {
            context.unregisterReceiver(this);
            dns.c();
        }
    }
}
