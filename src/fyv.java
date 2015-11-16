// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public final class fyv extends fym
{

    final Uri a;
    final int b = 0;
    final fuz i;

    public fyv(fuz fuz, emy emy, Uri uri, int j)
    {
        i = fuz;
        a = uri;
        super(emy);
    }

    protected enh a(Status status)
    {
        return new fvh(DataHolder.b(status.c()));
    }

    protected void a(emw emw)
    {
        ((fyg)emw).a(this, a, b);
    }
}
