// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dce
{

    private final Context a;
    private int b;
    private String c;
    private aik d;
    private aob e;
    private boolean f;
    private boolean g;
    private int h;
    private String i;
    private int j;

    public dce(Context context)
    {
        h = 0;
        a = context;
    }

    public Intent a()
    {
        Intent intent = new Intent(a, com/google/android/apps/hangouts/realtimechat/RealTimeChatService);
        intent.putExtra("op", 30);
        intent.putExtra("account_id", b);
        intent.putExtra("conversation_name", c);
        intent.putExtra("audience", d);
        intent.putExtra("conversation_lookup", e);
        intent.putExtra("force_group", g);
        intent.putExtra("transport_type", h);
        if (f)
        {
            intent.putExtra("conversation_hangout", true);
        }
        intent.putExtra("invite_token_url", i);
        intent.putExtra("opened_from_impression", j);
        return intent;
    }

    public dce a(int k)
    {
        b = k;
        return this;
    }

    public dce a(aik aik)
    {
        d = aik;
        return this;
    }

    public dce a(aob aob)
    {
        e = aob;
        return this;
    }

    public dce a(String s)
    {
        i = s;
        return this;
    }

    public dce a(boolean flag)
    {
        f = flag;
        return this;
    }

    public dce b(int k)
    {
        h = k;
        return this;
    }

    public dce b(boolean flag)
    {
        g = flag;
        return this;
    }

    public dce c(int k)
    {
        j = k;
        return this;
    }
}
