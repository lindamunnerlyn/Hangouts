// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public final class cag
{

    String a;
    String b;

    public cag()
    {
    }

    public Bundle a()
    {
        Bundle bundle = new Bundle();
        bundle.putString("account_name", a);
        bundle.putString("effective_gaia_id", b);
        return bundle;
    }

    public cag a(String s)
    {
        a = s;
        return this;
    }

    public cag b(String s)
    {
        b = s;
        return this;
    }
}
