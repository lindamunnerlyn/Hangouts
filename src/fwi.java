// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

public final class fwi extends fwh
{

    final String a;
    final fsp b;

    public fwi(fsp fsp, ejx ejx, String s)
    {
        b = fsp;
        a = s;
        super(ejx);
    }

    protected ekg a(Status status)
    {
        return new fsq(status);
    }

    protected void a(ejv ejv)
    {
        ((fwb)ejv).a(this, a);
    }
}
