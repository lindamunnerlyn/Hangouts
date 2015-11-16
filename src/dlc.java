// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.IntentService;
import android.content.Intent;

public abstract class dlc extends IntentService
{

    public dlc(String s)
    {
        super(s);
    }

    public abstract void a(Intent intent, jnv jnv);

    protected final void onHandleIntent(Intent intent)
    {
        ((dld)hlp.a(getApplicationContext(), dld)).a(this, intent);
    }
}
