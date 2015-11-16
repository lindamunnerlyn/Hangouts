// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public final class bzr extends hhu
    implements gws
{

    private gwy a;

    public bzr()
    {
    }

    public void a(gxe gxe)
    {
        gxe = getArguments();
        a.a(gxe.getString("account_name"), gxe.getString("effective_gaia_id"));
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        a = (gwy)binder.a(gwy);
    }
}
