// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class ddm
{

    private final Context a;
    private int b;
    private String c;
    private aid d;
    private aot e;
    private boolean f;
    private boolean g;
    private int h;
    private String i;
    private int j;

    public ddm(Context context)
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

    public ddm a(int k)
    {
        b = k;
        return this;
    }

    public ddm a(aid aid)
    {
        d = aid;
        return this;
    }

    public ddm a(aot aot)
    {
        e = aot;
        return this;
    }

    public ddm a(String s)
    {
        i = s;
        return this;
    }

    public ddm a(boolean flag)
    {
        f = flag;
        return this;
    }

    public ddm b(int k)
    {
        h = k;
        return this;
    }

    public ddm b(boolean flag)
    {
        g = flag;
        return this;
    }

    public ddm c(int k)
    {
        j = k;
        return this;
    }
}
