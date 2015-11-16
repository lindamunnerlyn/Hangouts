// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;

public final class hdq
{

    private Intent a;
    private boolean b;
    private hav c;

    public hdq()
    {
    }

    public hdq a()
    {
        b = true;
        return this;
    }

    public hdq a(Intent intent)
    {
        a = intent;
        return this;
    }

    public hdq a(hav hav)
    {
        c = hav;
        return this;
    }

    public ad b()
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("allow_no_accounts", b);
        bundle.putParcelable("account_filter", c);
        bundle.putParcelable("account_intent", a);
        hdn hdn1 = new hdn();
        hdn1.setArguments(bundle);
        return hdn1;
    }
}
