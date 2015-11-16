// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public final class fwr extends fwh
{

    final Uri a;
    final int b = 0;
    final fst i;

    public fwr(fst fst, ejx ejx, Uri uri, int j)
    {
        i = fst;
        a = uri;
        super(ejx);
    }

    protected ekg a(Status status)
    {
        return new ftb(DataHolder.b(status.f()));
    }

    protected void a(ejv ejv)
    {
        ((fwb)ejv).a(this, a, b);
    }
}
