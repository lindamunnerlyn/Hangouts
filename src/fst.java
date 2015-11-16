// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.google.android.gms.wearable.PutDataRequest;

public final class fst
{

    public fst()
    {
    }

    private ekd c(ejx ejx1, Uri uri)
    {
        return ejx1.a(new fwr(this, ejx1, uri, 0));
    }

    private ekd d(ejx ejx1, Uri uri)
    {
        return ejx1.a(new fws(this, ejx1, uri, 0));
    }

    public ekd a(ejx ejx1)
    {
        return ejx1.a(new fwq(this, ejx1));
    }

    public ekd a(ejx ejx1, Uri uri)
    {
        return c(ejx1, uri);
    }

    public ekd a(ejx ejx1, PutDataRequest putdatarequest)
    {
        return ejx1.a(new fwp(this, ejx1, putdatarequest));
    }

    public ekd b(ejx ejx1, Uri uri)
    {
        return d(ejx1, uri);
    }
}
