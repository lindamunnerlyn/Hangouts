// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.IntentService;
import android.content.Intent;

public abstract class djl extends IntentService
{

    public djl(String s)
    {
        super(s);
    }

    public abstract void a(Intent intent, jhb jhb);

    protected final void onHandleIntent(Intent intent)
    {
        ((djm)hgx.a(getApplicationContext(), djm)).a(this, intent);
    }
}
