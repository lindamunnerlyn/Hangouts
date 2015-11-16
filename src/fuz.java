// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.google.android.gms.wearable.PutDataRequest;

public final class fuz
{

    public fuz()
    {
    }

    private ene c(emy emy1, Uri uri)
    {
        return emy1.a(new fyv(this, emy1, uri, 0));
    }

    private ene d(emy emy1, Uri uri)
    {
        return emy1.a(new fyw(this, emy1, uri, 0));
    }

    public ene a(emy emy1)
    {
        return emy1.a(new fyu(this, emy1));
    }

    public ene a(emy emy1, Uri uri)
    {
        return c(emy1, uri);
    }

    public ene a(emy emy1, PutDataRequest putdatarequest)
    {
        return emy1.a(new fyt(this, emy1, putdatarequest));
    }

    public ene b(emy emy1, Uri uri)
    {
        return d(emy1, uri);
    }
}
