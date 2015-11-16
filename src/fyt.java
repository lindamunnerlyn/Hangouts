// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.PutDataRequest;

public final class fyt extends fym
{

    final PutDataRequest a;
    final fuz b;

    public fyt(fuz fuz, emy emy, PutDataRequest putdatarequest)
    {
        b = fuz;
        a = putdatarequest;
        super(emy);
    }

    public enh a(Status status)
    {
        return new fva(status, null);
    }

    protected void a(emw emw)
    {
        ((fyg)emw).a(this, a);
    }
}
