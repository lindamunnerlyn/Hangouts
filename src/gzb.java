// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class gzb extends BroadcastReceiver
{

    public gzb()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        try
        {
            ((gzl)hlp.a(context, gzl)).i();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }
}
