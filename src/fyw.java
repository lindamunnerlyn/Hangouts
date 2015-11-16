// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.google.android.gms.common.api.Status;

public final class fyw extends fym
{

    final Uri a;
    final int b = 0;
    final fuz i;

    public fyw(fuz fuz, emy emy, Uri uri, int j)
    {
        i = fuz;
        a = uri;
        super(emy);
    }

    protected enh a(Status status)
    {
        return new fvc(status, 0);
    }

    protected void a(emw emw)
    {
        ((fyg)emw).b(this, a, b);
    }
}
