// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public final class cau extends hmm
    implements hbc
{

    private hbi a;

    public cau()
    {
    }

    public void a(hbo hbo)
    {
        hbo = getArguments();
        a.a(hbo.getString("account_name"), hbo.getString("effective_gaia_id"));
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        a = (hbi)binder.a(hbi);
    }
}
