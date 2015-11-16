// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public final class hbv
{

    String a;
    hav b;
    private boolean c;
    private boolean d;
    private boolean e;

    public hbv()
    {
        c = true;
        d = false;
        e = true;
    }

    public hbv a()
    {
        c = false;
        return this;
    }

    public hbv a(hav hav)
    {
        b = hav;
        return this;
    }

    public hbv a(String s)
    {
        a = s;
        return this;
    }

    public hbv b()
    {
        e = false;
        return this;
    }

    public Bundle c()
    {
        Bundle bundle = new Bundle();
        bundle.putString("dialog_title", a);
        bundle.putBoolean("add_account", c);
        bundle.putBoolean("add_account_button_shown", d);
        bundle.putBoolean("auto_select_single_logged_out_account", e);
        bundle.putParcelable("account_filter", b);
        return bundle;
    }
}
