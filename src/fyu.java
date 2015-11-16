// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public final class fyu extends fym
{

    final fuz a;

    public fyu(fuz fuz, emy emy)
    {
        a = fuz;
        super(emy);
    }

    protected enh a(Status status)
    {
        return new fvh(DataHolder.b(status.c()));
    }

    protected void a(emw emw)
    {
        ((fyg)emw).a(this);
    }
}
